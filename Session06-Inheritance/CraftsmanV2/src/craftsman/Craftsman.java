
package craftsman;

import data.Disk;
import data.Rectangle;
import data.Square;

/**
 *
 * @author 2180358
 */
public class Craftsman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cutShapes();
        //sortShape();
        playWithChildClass();
    }
    
    public static void playWithChildClass() {
        Square s1 = new Square("TIA", "PINK", 5.0);
        s1.paint();
    }
    
    //sx cac hinh tang dan theo S
    public static void sortShape() {
        Rectangle r1 = new Rectangle("TIA", "PINK", 1.0, 2.0);
        
        Rectangle rectArr[] = new Rectangle[9];
        rectArr[0] = r1;
        rectArr[1] = new Rectangle("MA", "PINK", 3.0, 4.0);
        rectArr[2] = new Rectangle("A HAI", "BLUE", 3.0, 2.0);
        
        
        rectArr[3] = new Square("GHE BE NA", "RAINBOW", 1.0);
        //for (Rectangle x : rectArr) {
        //    x.paint();// coi chung toang vi NULL POINT EXCEPTION
        //}
        System.out.println("Before sort");
        for (int i = 0; i < 4; i++) {
            rectArr[i].paint();
        }
        //sort tang dan theo S
        System.out.println("after sort");
        for (int i = 0; i < 4-1; i++) {
            for (int j = i+1; j < 4; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()){
                    Rectangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }
            }
            
        }
        for (int i = 0; i < 4; i++) {
            rectArr[i].paint();
        }
        
    }
    
    public static void cutShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINK", 1.0, 2.0);
        r1.paint();
        
        Square s1 = new Square("MA", "PINK", 3);
        s1.paint();
        
        Disk d1 = new Disk("BE NA", "RAINBOW","<3", 2.0);
        d1.paint();
    }
}
