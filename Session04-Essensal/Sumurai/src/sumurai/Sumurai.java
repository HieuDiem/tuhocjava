
package sumurai;

import java.util.Scanner;

/**
 *
 * @author 2180358
 */
public class Sumurai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inputProfileXinXo();
        //inputProfile();
    }
    
    public static void inputProfileXinXo() {
        // ko OOP, chỉ cân hiểu về việc nhập info trc dã, ko chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        while (true){
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
                // alt + shift + f
            } catch (Exception e) {
                System.out.println("do cu biet input a positive numb: ");
            }
        }
         

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
  
        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }
        public static void inputProfile() {
        // ko OOP, chỉ cân hiểu về việc nhập info trc dã, ko chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        // mặc định JVM J sẽ giết app nếu cà chớn xảy ra để đảm bảo an toàn cho app
        //đưa co ta tự xử lý
        try {
            //lệnh cà chớn nằm ở đây
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
        
        // alt + shift + f
            
        } catch(Exception e) {
            // CPU chạy đến chỗ này, khi có cà chớn xảy ra
            // chỗ này là chỗ xử lý hậu quả của cà chơn
            // koo có cà chớn thì ko vào đay
            // Exception e = new Exception;
            // về lý e.xem lỗi, xử lý tự mình
            // mình chỉ tập trung phần xử lý lõi, 
            
            // xử lý sao?? nhiều cách  default value
            yob = 69;
        }
         

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
  
        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }
    
}
