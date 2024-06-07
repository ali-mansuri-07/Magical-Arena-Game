public class MagicalArenaApp {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        System.out.println("Player A : Health = " + playerA.getHealth() + ", Strength = " + playerA.getStrength() + ", Attack = " + playerA.getAttack());

        System.out.println("Player B : Health = " + playerB.getHealth() + ", Strength = " + playerB.getStrength() + ", Attack = " + playerB.getAttack());

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            if (playerA.getHealth() < playerB.getHealth()) {
                MagicalArenaService.fight(playerA, playerB);
                if (playerB.getHealth() <= 0) {
                    System.out.println("Player A wins!");
                    break;
                }
                MagicalArenaService.fight(playerB, playerA);
                if (playerA.getHealth() <= 0) {
                    System.out.println("Player B wins!");
                    break;
                }
            } else {
                MagicalArenaService.fight(playerB, playerA);
                if (playerA.getHealth() <= 0) {
                    System.out.println("Player B wins!");
                    break;
                }
                MagicalArenaService.fight(playerA, playerB);
                if (playerB.getHealth() <= 0) {
                    System.out.println("Player A wins!");
                    break;
                }
            }
        }
    }
}
