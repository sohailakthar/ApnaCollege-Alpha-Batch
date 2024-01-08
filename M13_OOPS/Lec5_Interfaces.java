package M13_OOPS;

public class Lec5_Interfaces {
    public static void main(String[] args) {
        /*
        Interface can be understood like 'blueprint of a class'

        Imagine, we need to build Maruti 800 objects.
        A class called Maruti800 will be a blueprint for these objects.
        Now, we can also have a blueprint for Maruti800 class, called 'Car' as an interface.

        Interface helps in achieving total abstraction.

        In Abstract class, we don't necessarily have total abstraction. As we can have non-abstract methods, variables etc.


        Interfaces:-
            - All methods are public, abstract & without implementation
            - Used to achieve total abstraction
            - Variables in the interface are final, public and static.
         */


        Bear bhalu = new Bear();
        bhalu.eatingFlesh();
        bhalu.eatingGrass();
    }
}

interface Herbivore {
    void eatingGrass();
}

interface Carnivore {
    void eatingFlesh();
}

class Bear implements Herbivore, Carnivore {

    public void eatingGrass() {
        System.out.println("Nom nom.. eating grass..");
    }

    public void eatingFlesh() {
        System.out.println("Rawr... eating flesh...");
    }
}
