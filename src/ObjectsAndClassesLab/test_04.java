package ObjectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class test_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dice diceD6 = new Dice(6, new Random());
        Dice diceD8 = new Dice(8, new Random());

        System.out.println(diceD6.getRnd());

    }

   static class Dice {
        public int sides;
        Random rnd = new Random();

       public Dice(int sides, Random rnd) {
           this.sides = sides;
       }

       public int getSides() {
            return sides;
        }

        public void setSides(int sides) {
            this.sides = sides;
        }

        public Random getRnd() {
            return rnd;
        }

        public void setRnd(Random rnd) {
            this.rnd = rnd;
        }

        public int roll() {
            int sides = rnd.nextInt(this.sides + 1);
            return sides;
        }
    }
}
