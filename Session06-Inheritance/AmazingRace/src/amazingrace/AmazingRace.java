
package amazingrace;

import data.*;

/**
 *
 * @author 2180358
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        register();
    }
    public static void register() {
        Cat tom = new Cat("TOM", 1950, 10.5, "><");
//        tom.showRecod();
        
        Pet kitty = new Cat("KITTY", 1990, 5.0, "><");
//        kitty.showRecod();
        
        Dog ngao = new Dog("NGAO", 2001, 50.0);
        Pet beTo = new Dog("BE=TO", 2012, 5.0);
        
        Hamster jerry = new Hamster("JERRY", 1960, 0.5);
        Pet jr = new Hamster("NHAT", 2021,0.3);
//        ngao.showRecod();
//        beTo.showRecod();

        Pet race[] = new Pet[] {tom, kitty, ngao, beTo, jerry, jr};
        
        System.out.println("The records table");
        for (Pet x : race) {
            x.showRecod();
        }
        
        // tai thoi deim nay ko sort dc
    }
    
    
}
