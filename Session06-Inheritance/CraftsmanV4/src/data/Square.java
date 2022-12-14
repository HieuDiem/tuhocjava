
package data;

/**
 *
 * @author 2180358
 */


public class Square extends Rectangle {

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    
    @Override
    public void paint() {
        System.out.printf("|SQUARE   |%-10s|%-10s|%-10s|%4.1f|%7.2f|%7.2f|\n", owner, color, borderColor, a, getArea(), getPerimeter());
    }
}
