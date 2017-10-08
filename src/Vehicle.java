/**
 * Created by stephenboynton on 6/29/17.
 */
public class Vehicle {

    private int wheels;
    private int doors;
    private String engine;
    private String safety;

    public Vehicle(int wheels, int doors, String engine, String safety) {
        this.wheels = wheels;
        this.doors = doors;
        this.engine = engine;
        this.safety = safety;
    }

    public void forward (int speed) {
        System.out.println("moving forward!");
    }

    public void backwards (int speed) {
        System.out.println("moving backwards!");
    }

    public void brake (int force) {
        System.out.println("Braking with " + force + " force!!!");
    }

    public void steering (String direction) {
        System.out.println("Vehicle is moving " + direction + "!");
    }
}
