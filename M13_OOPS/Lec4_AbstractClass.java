package M13_OOPS;

public class Lec4_AbstractClass {
    public static void main(String[] args) {
        // We have a multi-level inheritance. Animal -> Horse -> Mustang
        // Animal is an abstract class. It has an abstract method 'walk()' & a non-abstract method 'eat()'

        // When creating object, Animal constructor is called, then Horse and then Mustang constructor.
        Mustang musty = new Mustang();
        musty.setColor("Dark Brown");
        System.out.println(musty.getColor());
    }
}

abstract class AnimalAbstractClass {
    String color;

    // We can't create object/instance of an abstract class, then why do we have constructors?
    // We can do some task required to perform upon child object creation.. Or assigning some initial variables etc.
    AnimalAbstractClass() {
        color = "Brown";
        System.out.println("Animal constructor called.");
    }

    void eat() {
        System.out.println("Eating...");
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract void walk();
}


class Horse extends AnimalAbstractClass {
    Horse() {
        System.out.println("Horse constructor called.");
    }
    void walk() {
        System.out.println("Walking on 4 legs.");
    }

    String getColor() {
        return this.color;
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called.");
    }
}
