
package data;

/**
 *
 * @author 2180358
 */
//phien ban dung ke thua tu HCN

public class Square extends Rectangle {
    
    public Square(String owwner, String color, double edge) {
        super(owwner, color, edge, edge);
        // super --- new Rectangle
    }  
    
    @Override
    //the hien ban sac cua con, de con lam, cha ngoi im, qua mat cha
    public void paint() {
            System.out.printf("|SQUARE    |%-15s|%-10s|%4.1f|  - |%7.2f|\n", owwner,color, weight, getArea() );
                
    }
    
}

