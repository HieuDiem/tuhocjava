
package data;

/**
 *
 * @author 2180358
 */
public class Square extends Rectangle {

    public Square(String owner, String color, String boderColor, double edge) {
        super(owner, color, boderColor, edge, edge);
    }
    
    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|    |    |%7.2f|%7.2f|\n","SQUARE" ,owner, color, boderColor, weight,getArea(), getPerimeter());
    }
}
