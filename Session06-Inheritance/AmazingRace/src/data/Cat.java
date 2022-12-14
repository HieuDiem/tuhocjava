
package data;

import java.util.Random;

/**
 *
 * @author 2180358
 */
public class Cat extends Pet{
    public static final double MAX_SPEED = 50;
    
    private String ribbon;

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);
        this.ribbon = ribbon;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        
        return new Random().nextDouble() * MAX_SPEED;
         
    }

    @Override
    public void showRecod() {
        System.out.printf("|CAT    |%-10s|%4d|%4.1f|%4s|%4.1f|\n", name, yob, weight,ribbon, run());
    }
    
    
    
}
