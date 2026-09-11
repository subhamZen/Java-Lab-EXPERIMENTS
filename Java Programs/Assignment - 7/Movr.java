class Movr {

    void SimpleI(int principal, int time) {
        double rate = 5;

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    void SimpleI(int principal, int time, double rate) {

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    public static void main(String args[]) {

        Movr obj = new Movr();

        obj.SimpleI(10000, 2);
        obj.SimpleI(10000, 2, 8);
    }
}