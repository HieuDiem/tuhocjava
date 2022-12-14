
package diem.main;

import diem.util.MyToys;

/**
 *
 * @author 2180358
 */
public class Stage {
    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
        
        int n = MyToys.getAnInteger();
        System.out.println("n: " + n);
        
        int choice = MyToys.getAnInteger("Mời nhập lựa chọn của bạn là từ 1..7: ");
        System.out.println("your choice: " + choice);
        
       
    }
}
