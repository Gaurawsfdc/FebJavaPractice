package access_modifier;

public class PublicAnimal {
    public String type;

    public void eat(){
        System.out.println("Animal eating");
    }
    public void setType(){
        System.out.println("Animal Type is = " + type);
    }
}
