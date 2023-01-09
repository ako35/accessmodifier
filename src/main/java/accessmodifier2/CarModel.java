package accessmodifier2;

import accessmodifier1.Car;

public class CarModel extends Car{

    public static void main(String[] args) {

        Car car3=new Car();
        System.out.println(car3.brand);

        CarModel carModel1=new CarModel();
        System.out.println(carModel1.model);
        System.out.println(carModel1.carNumberPlate);

        carModel1.start();
        carModel1.stop();
    }
}
