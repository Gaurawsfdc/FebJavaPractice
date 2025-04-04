package access_modifier;

public class PrivatePerson {
    private int height;

    private void displayHeight(){
        System.out.println("Height of the person = " + height);
    }
    public void setHeight(int height){
        this.height= height;
        displayHeight();

    }

}
