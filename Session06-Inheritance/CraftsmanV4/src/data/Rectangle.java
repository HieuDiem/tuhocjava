
package data;

/**
 *
 * @author 2180358
 */

// vi cha la abstract(chi noi chu chua lam)
// nen neu con chua chiu lam thi con cung chi noi thoi, con cung la abstract
//1 class chua ham abstract thi class do cung la abstract, du ben trg no co vai ham co code

//neu con thua ke abstract class, chi co 2 huong lua chon:
// hoac la abstract, neu ko chiu vet code cho cha, 
//hoac la viet code cho ham abstract cua cha, vi co du info de lam
// CON VIET CODE CHO HAM CUA CHA, CHA NOI CON LAM,IMPLEMENT ABSTRACT METHODS
// cha noi y tuong, con thuc hien
public class Rectangle extends Shape {
    protected  double a, b;

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);// cha phai co trc
        this.a = a;
        this.b = b;
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
    
    @Override
    public double getArea() {
        return a * b;
    }
    
    @Override
    public double getPerimeter(){
        return (a + b) * 2;
    }
    
    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|%7.2f|\n", owner, color, borderColor, a, b, getArea(), getPerimeter());
    }
}

