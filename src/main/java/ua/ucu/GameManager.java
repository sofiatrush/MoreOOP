package ua.ucu;

public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println("Fight starts between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName() + "\n");

        System.out.println(c1.getClass().getSimpleName() + " HP: " + c1.getHp());
        System.out.println(c2.getClass().getSimpleName() + " HP: " + c2.getHp());
        System.out.println();

        int round = 1;

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("----- ROUND " + round + " -----");

            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " is dead");
                break;
            }

            c2.kick(c1);
            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " is dead");
            }

            System.out.println("Status after round " + round + ":");
            System.out.println(c1.getClass().getSimpleName() + " HP: " + c1.getHp());
            System.out.println(c2.getClass().getSimpleName() + " HP: " + c2.getHp() + "\n");

            round++;
        }

        System.out.println("Fight is ended\n");
    }

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        GameManager manager = new GameManager();

        System.out.println("=== HEROES GAME TEST ===\n");

        Character hero1 = factory.createCharacter();
        Character hero2 = factory.createCharacter();

        System.out.println("Created heroes:");
        System.out.println(hero1.getClass().getSimpleName() + " vs " + hero2.getClass().getSimpleName() + "\n");

        manager.fight(hero1, hero2);
    }
}
