package oops;

public class EncapsulationP {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Integer displayInt(){
        int a = 1;
        int b = 2;
        return a+b;
    }
    public static void main(String[] args) {
        EncapsulationP ep = new EncapsulationP();
        int i = ep.displayInt();
        System.out.println("The result is = " + i);
    }
}
