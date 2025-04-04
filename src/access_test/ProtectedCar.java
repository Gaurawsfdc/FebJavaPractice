package access_test;

import access_modifier.ProtectedVehicle;

public class ProtectedCar extends ProtectedVehicle {
    public void showDetails(){
        System.out.println("Brand of the car = " + brand);
        displayBrand();
    }


}
