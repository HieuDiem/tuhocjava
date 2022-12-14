
package data;

/**
 *
 * @author 2180358
 */
public class Disk extends Shape {
    public static final double PI = 3.14;
    
    private double radius;

    public Disk(String owner, String color, String boderColor, double radius) {
        super(owner, color, boderColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Disk.PI * Math.pow(radius, 2) ;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Disk.PI * radius;
    }
    
    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|%-4s|%-4s|%7.2f|%7.2f|\n","DISK", owner, color, boderColor, radius," ", " ",getArea(), getPerimeter());
    }
}

