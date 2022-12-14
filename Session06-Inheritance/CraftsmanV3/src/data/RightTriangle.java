
package data;

/**
 *
 * @author 2180358
 */

// tam giac vuong la phien ban db cua tgiac
public class RightTriangle extends Triangle {
    
    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b));
    }
    
    @Override
    public void paint() {
        System.out.printf("|RIGHTTRIANGLE |%-15s|%-10s|%4.1f|%4.1f|  - |%7.2f|\n", owner,color, a, b,getArea() );
    }
}
// con thoi xai lai tat ca nhung j cha co, cha bot-conbot => ke thua, di truyen
//bien di: con them moi ma cha ko co, ko phai override(ham giong, de con phat ngon thay)