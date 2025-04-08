package datatypes;

public class DTPractice {
    public static void main(String[] args){
        int x = 10;
        double y = x;
        System.out.println("y = " + y); // 10.0

        double x1 = 10.5;
        int y1 = (int) x1;
        System.out.println("y1 = " + y1); // 10

        boolean flag = true;
        System.out.println(flag);

        byte b = 127;
        System.out.println(b);

        int x2 = 10;
        String s = "Value: " + x2;
        System.out.println(s);

        B objb = new B();
        objb.display();

        int x4 = 5;
        System.out.println("x4 = " + x4++);
    }
}
    class A {
        protected int x3 = 10;
    }
    class B extends A {
        void display(){
            System.out.println("x3 = " + x3);
        }

    }


