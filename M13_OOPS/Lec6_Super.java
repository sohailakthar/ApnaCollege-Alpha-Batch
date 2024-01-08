package M13_OOPS;

public class Lec6_Super {
    public static void main(String[] args) {
        /*
        Super keyword is used to refer immediate parent class object.
            - to access parent's properties
            - to acces parent's functions
            - to acces parent's constructor.
         */

        Child c = new Child("Chiru");
        c.setName("Piru");
        c.defineMyself();
    }
}

class Parent {
    String name;
    Parent(String name) {
        this.name = name;
    }
    void defineMyself() {
        System.out.println("I'm a parent.");
    }

    String getName() {
        return this.name;
    }
}

class Child extends Parent {
    private String name;

    Child(String parentName) {
        super(parentName);
    }

    void defineMyself() {
        System.out.println("My name is " + name + ". My parent is " + super.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
