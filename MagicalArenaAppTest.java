public class MagicalArenaAppTest {

    public static void main(String[] args) {
        testAddPlayer();
        testFight();
        testPlayerVictory();
        System.out.println("All tests passed.");
    }

    public static void testAddPlayer() {
        Player player = new Player(50, 5, 10);
        assert player.getHealth() == 50 : "Health should be 50";
        assert player.getStrength() == 5 : "Strength should be 5";
        assert player.getAttack() == 10 : "Attack should be 10";
    }

    public static void testFight() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        int initialHealth = playerB.getHealth();
        MagicalArenaService.fight(playerA, playerB);
        assert playerB.getHealth() < initialHealth : "Player B's health should be reduced after the fight";
    }

    public static void testPlayerVictory() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        boolean playerAWins = false;
        boolean playerBWins = false;

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            if (playerA.getHealth() < playerB.getHealth()) {
                MagicalArenaService.fight(playerA, playerB);
                if (playerB.getHealth() <= 0) {
                    playerAWins = true;
                    break;
                }
                MagicalArenaService.fight(playerB, playerA);
                if (playerA.getHealth() <= 0) {
                    playerBWins = true;
                    break;
                }
            } else {
                MagicalArenaService.fight(playerB, playerA);
                if (playerA.getHealth() <= 0) {
                    playerBWins = true;
                    break;
                }
                MagicalArenaService.fight(playerA, playerB);
                if (playerB.getHealth() <= 0) {
                    playerAWins = true;
                    break;
                }
            }
        }

        assert playerAWins || playerBWins : "One of the players should win";
        if (playerAWins) {
            System.out.println("Player A wins!");
        } else if (playerBWins) {
            System.out.println("Player B wins!");
        }
    }
}
