interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

interface Squeakable {
    void squeak();
}

interface Swimmable {
    void swim();
}
abstract class Duck implements Swimmable {
    String name;

    Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}
class RubberDuck extends Duck implements Squeakable {
    RubberDuck() {
        super("Rubber Duck");
    }

    @Override
    public void squeak() {
        System.out.println(name + " squeaks.");
    }
}

class WoodenDuck extends Duck {
    WoodenDuck() {
        super("Wooden Duck");
    }
}

class RedHeadDuck extends Duck implements Flyable, Quackable {
    RedHeadDuck() {
        super("RedHead Duck");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies.");
    }

    @Override
    public void quack() {
        System.out.println(name + " quacks.");
    }
}

class LakeDuck extends Duck implements Flyable, Quackable {
    LakeDuck() {
        super("Lake Duck");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies.");
    }

    @Override
    public void quack() {
        System.out.println(name + " quacks.");
    }
}
public class DuckGame {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        rubberDuck.swim();
        rubberDuck.squeak();

        woodenDuck.swim();

        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
