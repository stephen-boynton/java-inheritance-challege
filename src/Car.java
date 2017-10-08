/**
 * Created by stephenboynton on 6/29/17.
 */
public class Car extends Vehicle {

    private int mirrors;
    private int wheelDrive;
    private boolean automatic;

    public Car(int doors, String engine, String safety, int mirrors, int wheelDrive, boolean automatic) {
        super(4, doors, engine, safety);
        this.mirrors = mirrors;
        this.wheelDrive = wheelDrive;
        this.automatic = automatic;
    }

    public void lockDoors(boolean locked) {
        System.out.println("The doors are locked?" + " " + locked);
    }

    @Override
    public void forward(int speed) {
        System.out.println("Using the gas!");
        super.forward(speed);
    }

    @Override
    public void steering(String direction) {
        System.out.println("Using the steering wheel to turn " + direction);
        super.steering(direction);
    }


}
