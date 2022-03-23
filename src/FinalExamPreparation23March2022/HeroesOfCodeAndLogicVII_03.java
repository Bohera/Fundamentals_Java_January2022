package FinalExamPreparation23March2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII_03 {
    static class Hero {
        String name;
        int hitPoints;
        int manaPoints;

        public Hero(String name, int hitPoints, int manaPoints) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.manaPoints = manaPoints;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHitPoints() {
            return hitPoints;
        }

        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
        }

        public int getManaPoints() {
            return manaPoints;
        }

        public void setManaPoints(int manaPoints) {
            this.manaPoints = manaPoints;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Hero> heroes = new ArrayList<>();

        int numHeroes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numHeroes; i++) {
            String line = scanner.nextLine();
            String[] heroParams = line.split(" ");
            Hero hero = new Hero(heroParams[0], Integer.parseInt(heroParams[1]), Integer.parseInt(heroParams[2]));
            heroes.add(hero);
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandParts = command.split(" - ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "CastSpell":
                    handleCastSpell(commandParts[1], Integer.parseInt(commandParts[2]), commandParts[3]);
                    break;
                case "TakeDamage":
                    handleTakeDamage(commandParts[1], Integer.parseInt(commandParts[2]), commandParts[3]);

                    break;
                case "Recharge":
                    handleRecharge(commandParts[1], Integer.parseInt(commandParts[2]));

                    break;
                case "Heal":
                    handleHeal(commandParts[1], Integer.parseInt(commandParts[2]));

                    break;
                default:
                    throw  new IllegalStateException("Unknown command " + commandName + " in " + command);
            }


            command = scanner.nextLine();
        }
        for (Hero hero: heroes) {
            System.out.println(
                    hero.getName() + System.lineSeparator()
                    + " HP: " + hero.getHitPoints()  + System.lineSeparator()
                    + " MP: " + hero.getManaPoints());

        }
    }

    private static void handleHeal(String heroName, int amount) {
        return;
    }

    private static void handleRecharge(String heroName, int amount) {
        return;
    }

    private static void handleTakeDamage(String heroName, int damage, String attacker) {
        return;
    }

    private static void handleCastSpell(String heroName, int mannaPoints, String spellName) {
        return;
    }
}
