interface A {
    default void showA() {
        System.out.println("This is Interface A");
    }
}

interface B {
    default void showB() {
        System.out.println("This is Interface B");
    }
}

class C implements A, B {
    public void showC() {
        System.out.println("This is Class C");
    }
}

class MultipleDemo {
    public static void main(String args[]) {

        C obj = new C();

        obj.showA();
        obj.showB();
        obj.showC();
    }
}