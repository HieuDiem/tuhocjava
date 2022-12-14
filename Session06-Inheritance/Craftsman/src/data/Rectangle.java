
package data;

/**
 *
 * @author 2180358
 */
public class Rectangle {
    private String owwner;
    private String color;
    private double weight;
    private double lenght;
    //private double acreage;//dien tich/ dac diem dc tinh tu cac dac tinh khac
    // = w*l ->dac tinh dan xuat - derived
    // ham thuoc ve co ke nhieu info

    public Rectangle(String owwner, String color, double weight, double lenght) {
        this.owwner = owwner;
        this.color = color;
        this.weight = weight;
        this.lenght = lenght;
    }

    public String getOwwner() {
        return owwner;
    }

    public void setOwwner(String owwner) {
        this.owwner = owwner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "owwner=" + owwner + ", color=" + color + ", weight=" + weight + ", lenght=" + lenght + '}';
    }
    
    // viet ham tinh S o day
    public double getArea() {
        return weight * lenght;
    }
    
    public void paint() {
        System.out.printf("|RECTANGLE |%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n", owwner,color, weight, lenght,getArea() );
    }
}
