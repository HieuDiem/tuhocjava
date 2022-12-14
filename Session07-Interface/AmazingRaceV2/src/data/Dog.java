
package data;

import java.util.Random;

/**
 *
 * @author 2180358
 */
public class Dog extends Pet implements DeathRacer {
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
       return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%-8s|%-11s|%5.1f|\n", "DOG", name, yob, weight, run() );

    }

    @Override
    public double runToDead() {
        return run() * 3;
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-10s|%4d|%4.1f|%4.1f|\n", "DOG_RACER", name, yob, weight, runToDead());
    }
    
    
}
