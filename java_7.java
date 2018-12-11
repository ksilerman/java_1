public class java_7 {
    public static void main(String[] args) {
        Cat[] arrCat = {
                         new Cat("Barsik", 3, false),
                         new Cat("Murzik", 8, false),
                         new Cat("Tabasik", 12, false)
        };
        Plate plate = new Plate(500);
        System.out.println("Кол-во еды: " + plate);
       // if (plate > 23) {
            for (Cat arrcat : arrCat) {
                arrcat.eat(plate);
                System.out.println(arrcat);
            }
        //}
        System.out.println("после кормежки осталось: " + plate);
    }
}

    class Cat {
        private String name;
        private int appetite;
        private boolean satiety;

        Cat(String name, int appetite, boolean satiety) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = satiety;
        }

       void eat(Plate plate) {
            plate.dicreaseFood(appetite);
        }
        @Override
        public String toString() {
            return name + " " + "съел - " + appetite + " " + "Голодный? - " + satiety;
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

        @Override
        public String toString() {
            return "" + food;
        }
    }

