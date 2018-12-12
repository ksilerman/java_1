/**
 * Java. level 1. Lesson 7. Example of homework,
 * autor Rudenko Alexander
 * version date 12/12/2018
 *
 */
import java.util.Scanner;

public class java_7 {
    public static void main(String[] args) {
        int amount_food;
        int variant;
        Cat[] arrCat = {
                         new Cat("Barsik", 3),
                         new Cat("Murzik", 8),
                         new Cat("Tabasik", 12)
        };
        System.out.println("Введите кол-во еды в тарелке");
        Scanner scan = new Scanner(System.in);
        amount_food = scan.nextInt();
        Plate plate = new Plate(amount_food);
        System.out.println("Кол-во еды: " + plate);

            for (Cat arrcat : arrCat) {
                if (plate.getFood() >= arrcat.getAppetite()) {
                arrcat.eat(plate);
                System.out.println(arrcat);
            } else {
                System.out.println(arrcat);
                System.out.println("Не хватает еды в тарелке");
                    System.out.println("Добавить еды? 1 - да, 2 - нет");
                    variant = scan.nextInt();
                    switch (variant) {
                        case 1:
                             System.out.println("Сколько добавить еды?");
                            amount_food = scan.nextInt();
                             plate.increaseFood(amount_food);
                             arrcat.eat(plate);
                             System.out.println(arrcat);
                            break;
                        case 2:
                            System.out.println(arrcat);
                            break;
                    }
                }
        }
        System.out.println("после кормежки осталось еды: " + plate);
    }
}

    class Cat {
        private String name;
        private int appetite;
        private boolean satiety;

        Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = satiety;
        }

        public int getAppetite() {
            return appetite;
        }

        void eat(Plate plate) {
            plate.dicreaseFood(appetite);
            satiety = true;
        }
        @Override
        public String toString() {
            return name + " " + "сьел - " + appetite + " " + "Поел? - " + satiety;
        }
    }

    class Plate {
        private int food;

        Plate(int food) {
            this.food = food;
        }

        void dicreaseFood(int food) {
            this.food -= food;
        }
        void increaseFood(int food) {
            this.food += food;
        }

        public int getFood() {
            return food;
        }

        @Override
        public String toString() {
            return "" + food;
        }
    }
