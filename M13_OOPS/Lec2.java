package M13_OOPS;
public class Lec2 {
    public static void main(String[] args) {
        Cat rosy = new Cat();
        rosy.eat();
        rosy.meow();

        Snake pitch = new Snake();
        pitch.hiss();
        pitch.breathe();

    }
}

class Animal {
    public void eat() {
        System.out.println("eating");
    }

    public void breathe() {
        System.out.println("breathing");
    }
}

class Cat extends Animal {
    Type type = Type.MAMMAL;

    public void meow() {
        System.out.println("meow...");
    }
}

class Snake extends Animal {
    Type type = Type.REPTILE;

    public void hiss() {
        System.out.println("hiss...");
    }
}
