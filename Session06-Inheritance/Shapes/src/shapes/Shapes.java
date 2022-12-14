
package shapes;

import data.*; // import het cac class trg data


/**
 *
 * @author 2180358
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sortshapes();
    }
    
    public static void sortshapes() {
        // sort mang chi choi cung kieu
        
        Rectangle r1 = new Rectangle("TIA", "PINK", "MAG", 4.0, 5.0);
        Shape r2 = new Rectangle("TIA", "PINK", "MAG", 6.0, 5.0);
        
        Square s1 = new Square("MA", "PINK", "CIG", 4.0);
        Rectangle s2 = new Square("MA", "PINK", "CIG", 5.0);
        Shape s3 = new Square("MA", "PINK", "CIG", 6.0);
        
        Disk d1 = new Disk("BE NA", "RAINBOW", "CIG", 5.0);
        Shape d2 = new Disk("BE NA", "RAINBOW", "CIG", 6.0);
        
        Triangle tr1 = new Triangle("A HAI", "BLUE", "MAG", 4.0, 5.0, 6.0);
        Shape tr2 = new Triangle("A HAI", "BLUE", "MAG", 6.0, 7.0, 8.0);
        
        Shape arr[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2, tr1, tr2};
        
        System.out.println("The list of shape");
        for (Shape x : arr) {
            x.paint();// tinh da hinh, cha bi con qua mat
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()){
                    Shape tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    
                }
            }
        }
        
        System.out.println("The list of shape sorting by Area");
        for (Shape x : arr) {
            x.paint();// tinh da hinh, cha bi con qua mat
        }
        
    }
}
