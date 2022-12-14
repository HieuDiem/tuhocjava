
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
        sortShape();
    }
    
    //sx cac hinh tang dan theo S
    public static void sortShape() {
        Rectangle r1 = new Rectangle("TIA", "PINK", 1.0, 2.0);
        
        Rectangle rectArr[] = new Rectangle[9];
        rectArr[0] = r1;
        rectArr[1] = new Rectangle("MA", "PINK", 3.0, 4.0);
        rectArr[2] = new Rectangle("A HAI", "BLUE", 3.0, 2.0);
        //for (Rectangle x : rectArr) {
        //    x.paint();// coi chung toang vi NULL POINT EXCEPTION
        //}
        
        
        //hinh vuong , tron sx luon
        
        //rectArr[3] = new Square("G.A. HAI", "BLUE", 5.0);
        //ko cungf kieeu, ko cung datatype, ko chung mang
        // 2 khuoon doc lap, 2 mang doc lap
        
        System.out.println("Before sort");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
        //sort tang dan theo S
        System.out.println("after sort");
        for (int i = 0; i < 3-1; i++) {
            for (int j = i+1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()){
                    Rectangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }
            }
            
        }
        for (int i = 0; i < 3; i++) {
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
