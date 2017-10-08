/**
 * Created by stephenboynton on 6/29/17.
 */
public class Main {

    public static void main (String[] args) {

        Buick laSabre = new Buick("laSabre", 1, 1991, 201000);

        laSabre.forward(25);
        laSabre.rideInStyle(true);
        laSabre.brake(25);
        laSabre.steering("left");

    }

}
