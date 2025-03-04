package controlstatement;

public class Calculator {
    public int num1 =10;
    public int num2 = 30;

    public void addNum(int num1){
        this.num1 = num1;
        int add = num1 + num2;
        System.out.println("result of addition = " + add);
    }
    public void substract(){
        System.out.println("Substraction = " + (num1-num2));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.num1 = 25;
        c.addNum(c.num1);
        c.substract();

    }
}
