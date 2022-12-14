
package data;

import java.util.Random;

/**
 *
 * @author 2180358
 */
public class Dog extends Pet {
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * Dog.MAX_SPEED;
        
    }

    @Override
    public void showRecod() {
        System.out.printf("|%-7s|%-10s|%4d|%4.1f|%4s|%4.1f|\n","DOG" ,name, yob, weight," ",run());
    }
    
    
}
