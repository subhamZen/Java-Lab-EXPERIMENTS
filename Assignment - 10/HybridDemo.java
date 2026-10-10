class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

interface Pet {
    void play();
}

interface Friendly {
    void friendly();
}

class Puppy extends Dog implements Pet, Friendly {

    public void play() {
        System.out.println("Puppy plays");
    }

    public void friendly() {
        System.out.println("Puppy is friendly");
    }
}

class HybridDemo {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
        p.friendly();
    }
}