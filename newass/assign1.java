package newass;

interface whehical {
    void changeGear();
}

class Car implements whehical {

    int gear =0;
    public void changeGear() {

        if (gear < 5){
            gear++;
            System.out.println(" Car gear changed" + gear);
        }else {
            System.out.println("Car gear not changed");
        }


    }
}
class Bike implements whehical {

    int gear =0;
    public void changeGear() {

        if (gear <= 3){
            gear++;
            System.out.println("Bike gear changed" + gear);
        }else {
            System.out.println("Bike gear not changed");
        }


    }
}
class Bicycle implements whehical {

    int gear =0;
    public void changeGear() {

        if (gear <= 2){
            gear++;
            System.out.println("Bicycle gear changed" + gear);
        }else {
            System.out.println("Bicycle gear not changed");
        }


    }
}

public class assign1 {

    public static void main(String[] args) {
        Car car = new Car();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        car.changeGear();
        Bike bike = new Bike();
        bike.changeGear();
        bike.changeGear();
        bike.changeGear();
        bike.changeGear();
        bike.changeGear();
        bike.changeGear();
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear();
        bicycle.changeGear();
        bicycle.changeGear();
        bicycle.changeGear();
        bicycle.changeGear();
        bicycle.changeGear();
    }
}
