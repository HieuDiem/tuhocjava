
package data;

import java.util.Random;

/**
 *
 * @author 2180358
 */
public class Hamster extends Pet {
    
    public static final double MAX_SPEED = 30;

    public Hamster(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * Dog.MAX_SPEED;
        
    }

    @Override
    public void showRecod() {
        System.out.printf("|%-7s|%-10s|%4d|%4.1f|%4s|%4.1f|\n","HAMSTER" ,name, yob, weight," ",run());
    }
    
    
}
