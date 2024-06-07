import java.util.Random;

public class MagicalArenaService {
    private static final Random random = new Random();

    public static int rollDie() {
        return random.nextInt(6) + 1; // 1 to 6 sided die
    }

    public static void fight(Player attacker, Player defender) {
        int attackRoll = rollDie();
        int defenseRoll = rollDie();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = defender.getStrength() * defenseRoll;

        int damageTaken = Math.max(0, attackDamage - defenseStrength);
        defender.setHealth(defender.getHealth() - damageTaken);

        System.out.println("Attacker rolls " + attackRoll + ", Defender rolls " + defenseRoll);
        System.out.println("Attack damage: " + attackDamage + ", Defense strength: " + defenseStrength);
        System.out.println("Defender health reduced by " + damageTaken + " to " + defender.getHealth() + "\n");
    }
}
