package examclouds.lesson9.part13;

public class D extends C {
    public String i;

    public D(String a, int b) {
        i = a;
        super.i = b;
    }

    public void print() {
        System.out.println("D.i = " + i);
        super.print();
    }
}
