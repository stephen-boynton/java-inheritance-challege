/**
 * Created by stephenboynton on 6/29/17.
 */
public class Buick extends Car {

    private String model;
    private int trunk;
    private int yearBuilt;
    private int mileage;

    public Buick(String model, int trunk, int yearBuilt, int mileage) {
        super(4, "V6", "Seatbelts", 4, 2, true);
        this.model = model;
        this.trunk = trunk;
        this.yearBuilt = yearBuilt;
        this.mileage = mileage;
    }

    public void rideInStyle (boolean imHot) {
        System.out.println("Yo, ladies, you think I'm hot?" + imHot);
    }

}
