package access_test;

class DefaultStudent {
    int rollno;
    // default will be called only in the package
    void displayRollNo(){
        System.out.println("Roll No = " + rollno);
    }
}
