
package diem.util;

import java.util.Scanner;

/**
 *
 * @author 2180358
 */

// đây là class, khuôn chứa các đồ chơi dùng chung cho mọi nơi,
// vì nó ko nhớ cái gì chứa riêng tư của nó
// lib: chứa cá hàm biến dùng chung cho nhiều cv khác nhau của các proj khác nhau

public class MyToys {
    // đăc điểm hành vi là static, cho ngta biết thì dùng thêm public
    // ko nhớ cái j của riêng mình
    // 1 class bt vẫn co thể vừa static vauwf non-
    // Math hâu fhrts là static
    //String: vauwf có static vừa non-static
    //System: hầu hêt static
    
    public static final double PI = 3.1415;
    // biến ko cho thay đổi value, trừ lần dầu tiên khai báo
    // hằng số
    
    // đẩy scanner ra ngoài để xài xhung cho các hàm
    private static Scanner sc = new Scanner(System.in);
    // dùng nội bộ bên trg
    
    public static int getAnInteger(String inputMsg) {
        int n;
        do {
            try {
                System.out.print("InputMsg: ");// tb nhập, err, gtri max, min
               // n = sc.nextInt();//để lại rác
               n = Integer.parseInt(sc.nextLine());
               //if để chửi ngoài biên
               return n;
            }catch(Exception e) {
                System.out.println("DO u know how to input an integer?");
            }
        }while (true);
                     
    }
    
    public static int getAnInteger() {
        int n;

        do {
            try {
                System.out.print("Input an integer: ");
               // n = sc.nextInt();//để lại rác
               n = Integer.parseInt(sc.nextLine());
               //if để chửi ngoài biên
               return n;
            }catch(Exception e) {
                System.out.println("DO u know how to input an integer?");
            }
        }while (true);
                     
    }
      
}
