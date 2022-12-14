
package data;

/**
 *
 * @author 2180358
 */

// kn chung cho moi khai niem nao do: V, T, TG, 
public abstract class Shape {
    protected String owner;
    protected String color;
    protected String boderColor;

    public Shape(String owner, String color, String boderColor) {
        this.owner = owner;
        this.color = color;
        this.boderColor = boderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBoderColor() {
        return boderColor;
    }

    public void setBoderColor(String boderColor) {
        this.boderColor = boderColor;
    }
    
    // tinh S, CV, tuy vao tung hinh
    // o day chi dung abstract vi noi chung cu the
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();
}
