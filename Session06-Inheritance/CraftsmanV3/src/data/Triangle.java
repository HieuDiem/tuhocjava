
package data;

/**
 *
 * @author 2180358
 */
public class Triangle {
    protected String owner;
    protected String color;
    protected double a, b, c;

    // trong tgiac, tong 2 cach bki > canh con lai
    // neu a,c,b ko thoa man thi phai lam sao?
    // co 2 cah: dua default, va nem ngaoi le(try-catch)
    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "owner=" + owner + ", color=" + color + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    //co 1 class khac dua vao dung kem, giong scanner giup ko lam cac thao tac tren, tu no lam cho
    //thu vien mang ten LOMBOK
    
    public double getPerimeter() {
        return a + b+ c;
    }
    
    public double getArea(){
        // sd ct Heron , sqrt(p* ...) p = 1/2 cv
        double p = getPerimeter() /2;
        return Math.sqrt(p * (p -a) * (p - b) * ( p- c));
    }
    
    public void paint() {
        System.out.printf("|TRIANGLE      |%-15s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f|\n", owner,color, a, b, c,getArea() );
    }
    
}
