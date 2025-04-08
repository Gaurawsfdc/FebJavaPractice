package calculator;

public class Calculator {
    double a = 10;
    double b = 0;
    double result;
    double c;
    double d;

    public void add(){
        if(a != 0 && b != 0){
            result = a+b;
            System.out.println("" + result);
        }else {
            System.out.println("Both numbers should not be 0");
        }
    }

    public void addonruntime(double a, double b){
        this.c = a;
        this.d = b;
        this.a = a;
        this.b = b;

        System.out.println(a+b);
        System.out.println(c+d);
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add();
        cal.addonruntime(5, 0);
    }
}
