
package studentmanagement;

import data.Student;// muon do de dung , tim noi cat
import java.util.Scanner;

/**
 *
 * @author 2180358
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        saveStudent();
        //inputAStudent();
    }
    
    // can nhap thong tin tu ban phim
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: ");
        name = sc.nextLine();
        
        System.out.print("Input yob: ");
        yob = sc.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
    
    public static void saveStudent() {
        Student cuong = new Student("SE666821", "Cường Võ", 2000, 6.9);
        Student binh = new Student("SE666800", "Binh Le", 2001, 7.9);
        Student an = new Student("SE666789", "An Nguyen", 2001, 8.9);
       
        an.showProfile();
        binh.showProfile();
        
        //cham xo gi, Access Modifiler, Access Specifier
        System.out.println("An name: " + an.name);// cau thu gan ten sau lung
        System.out.println("An name: " + an.getName());
        
        //vi so dc truc tiep cai bien/instance variable, ta có thẻ get() và set()
        an.name = "Không học bài";
        
        System.out.println("Binh name: " + binh.name);
        System.out.println("AN  name again: " + an.name);
        
        
        an.showProfile();
        cuong.showProfile();
        //sayHi() static
        Student.sayHi();
        
        //có 2 laoij dấu chấm:
        // chấm trực tiếp qua tên class tức là chạm sờ STATIC
        //chấm qua con đường new tức là đang hàm ý chơi với non-static đồ của riêng từng obj
    }
}

// STATIC ĂN THRO THẰNG CUỐI CÙNG
