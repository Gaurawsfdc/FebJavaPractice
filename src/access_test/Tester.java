package access_test;

public class Tester {
    public static void main(String[] args) {
        DefaultStudent s = new DefaultStudent();
        s.rollno = 101;
        s.displayRollNo();

        ProtectedCar pc = new ProtectedCar();
        pc.showDetails();
    }
}
