
package studentprofile;

import java.util.Scanner;

/**
 *
 * @author 2180358
 */
public class StudentProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputProfile();
    }
    // nhập thông tin sinh viên và in ra
    public static void inputProfile() {
        // ko OOP, chỉ cân hiểu về việc nhập info trc dã, ko chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        System.out.print("Input yob: ");
//        yob = sc.nextInt();// convert dâta tư bàn phím -là chuỗi thành số
      // nextInt() trc nextLine() sẽ bị lạc trôi lệnh nhập ngay sau đó
      //nếu viết liền sau khi nhập chuỗi thì rác của thàng trc sẽ bị dè vào dl lệnh sau
      // để lại rác tring buffer, tệ nhất là enter, rác dấu cách + enter
      //xóa bộ đệm trc khi nhập chuỗi
        //sc.nextLine();
        yob = Integer.parseInt(sc.nextLine());
      //nextLine() hố sạch buffer, loại bỏ enter, còn chuỗi số -> số
      
      
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
  
        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }
    
}
