
package data;

/**
 *
 * @author 2180358
 */
public class Rectangle extends Shape {
    protected double weight;
    protected double height;

    public Rectangle(String owner, String color, String boderColor, double weight, double height) {
        super(owner, color, boderColor);
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return weight * height;
    }

    @Override
    public double getPerimeter() {
        return ( weight + height) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|%4.1f|%-4s|%7.2f|%7.2f|\n", "Rectangle", owner, color, boderColor,weight, height, " ",getArea(), getPerimeter() );
    }
    
    
    
}
