/**
 * Java. level 1. Lesson 6. Example of homework, extend OOP
 * autor Rudenko Alexander
 * version date 09/12/2018
 *
 */

class java_6 {
    public static void main(String[] args) {

        IAnimal[] animals = {new Cat(200, 0, 2.0), new Dog(500, 10, 0.5)};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.getClass().getName() +
                    " может: пробежать " + animal.running(200) +
                    ", " + "проплыть " + animal.swiming(0) +
                    ", " + "прыгнуть на " + animal.jumping(1.0));
        }
    }
}

class Cat extends Animal {
    Cat(int run, int swim, double jump) {
        super(run, swim, jump);
    }
    public boolean running(int run) {
        return (run >= 100 & run <= 250);
    }
    public boolean swiming(int swim) {
        return (swim != 0);
    }
    public boolean jumping(double jump) {
        return (jump == 0.5);
    }
}

class Dog extends Animal {
    Dog(int run, int swim, double jump) {
        super(run, swim, jump);
    }
    public boolean running(int run) {
        return (run >= 400 & run <= 600);
    }
    public boolean swiming(int swim) {
        return (swim == 10);
    }
    public boolean jumping(double jump) {
        return (jump == 2.0);
    }
}

interface IAnimal {
    boolean running(int run);
    boolean swiming(int swim);
    boolean jumping(double jump);
}

abstract class Animal implements IAnimal {
    int run;
    int swim;
    double jump;

    Animal(int run, int swim, double jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    @Override
    public String toString() {
        return run + ", " + swim + ", " + jump;
    }
}
