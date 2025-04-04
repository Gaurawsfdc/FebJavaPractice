package access_modifier;

public class Tester {

    public static void main(String [] args){
        PrivatePerson p = new PrivatePerson();
        p.setHeight(168);

        //calling vehilce class
        ProtectedVehicle v = new ProtectedVehicle();
        v.displayBrand();

        PublicAnimal pa = new PublicAnimal();
        pa.type = "Domestic";
        pa.eat();
        pa.setType();
    }
}
