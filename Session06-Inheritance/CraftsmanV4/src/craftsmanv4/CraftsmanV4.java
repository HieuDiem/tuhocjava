
package craftsmanv4;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

/**
 *
 * @author 2180358
 */
public class CraftsmanV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithShape();
        sortShape();
    }
    
    public static void sortShape() {
        Rectangle r1 = new Rectangle("TIA", "PINK", "MAGENTA", 5, 4);
        Shape r2 = new Rectangle("TIA", "PINK", "MAGENTA", 5, 6);
        
        Square s1 = new Square ("MA", "PINK", "MAGENTA", 5 );
        Rectangle s2 = new Square ("MA", "PINK", "MAGENTA", 6 );
        Shape s3 = new Square ("MA", "PINK", "MAGENTA", 7 );
        
        Disk d1 = new Disk("A Hai", "Rainbow", "MAGENTA", "<3", 6);
        Shape d2 = new Disk("A HAI", "RAINBOW", "MAGENTA", ":x", 10);
        
        Triangle tr1 = new Triangle("BE NA", "BLUE", "MAGENTA", 4, 5, 6);
        Shape tr2 = new Triangle("BE NA", "BLUE", "MAGENTA", 6, 8, 10);
        
        // in kq trc khi sx
//        r1.paint();
//        r2.paint();
//        
//        s1.paint();
//        s2.paint();
//        s3.paint();
//        
//        d1.paint();
//        d2.paint();
//        
//        tr1.paint();
//        tr2.paint();
        // paint() chi co 1 ham ten paint(), nhiung da dang paint()
        // luc chay hcn, kuc chay hv...
        // cung ham ong noi, cha, con, nhung con biet override dung luc
        // tinh a nhiem, da xa, da hinh 
        
        
       
        Shape[] box = new Shape[ ]{r1, r2, s1, s2, s3, d1, d2, tr1, tr2};
        for (Shape s : box) {
            s.paint(); 
        }
         // sx theo thu tu
        for (int i = 0; i < 8; i++) {
            
            
        }
        
    }
    
    public static void playWithShape() {
        Rectangle r1 = new Rectangle("TIA", "PINK", "MAGENTA", 5, 4);
        Shape r2 = new Rectangle("TIA", "PINK", "MAGENTA", 5, 6);
        
        Disk d1 = new Disk("MA", "PINK", "MAGENTA", "<3", 6);
        Shape d2 = new Disk("MA", "PINK", "MAGENTA", ":x", 6);
        
        r1.paint();// con
        r2.paint();// cha, nhung chay uu tien con, code cha ko co anh huong
        d1.paint();
        d2.paint();// do code cha ko hoan hao, ko day du -> new cha chua thay
        
       //.paint() la tinh da hinh
    }
}
