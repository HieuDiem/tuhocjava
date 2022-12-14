
package data;

import java.util.*;

/**
 *
 * @author 2180358
 */
public class Cabinet {
    private List<Student> arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);
    
// default, empty contructor. ko làm j cả
    public Cabinet() {
    }
    
    // hđ của cái túi là thêm hs, sx, xóa, update hs
    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;
        
        System.out.println("Input student profile # " + (arr.size() + 1) + ": ");
        
        // dùng lại hàm search để ktra xem có trùng ko? dùng vòng lặp 
        
        while (true) {
            System.out.print("Input id: ");
            id = sc.nextLine().trim().toUpperCase();// cắt ktróng sau đó đổi chữ hoa
            
            Student xxxx = searchAStudent(id);
            if (xxxx == null)// id éo tòn tại
                break;
            else
                System.out.println("Duplicated id, try with another one!!!");
        }
        
        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();
        
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        arr.add(new Student(id, name, yob, gpa));
        
        System.out.println("The new student hás been added successfully");
    }
    
    public void printStudentList() {
        if ( arr.isEmpty()){
            System.out.println("The std í nothing");
            return;
        }
        
        System.out.println("The is/are " + arr.size() + " std(s)");
        for (Student st : arr) {
            st.showProfile();
        }
    } 
    
    // ta làm hàm tìm liếm sv vs 2 mđ:
    // mdd11; tìm kiếm sv theo id
    //2. là phục vụ xem sv có trùng hay ko khi thêm vào
    // hàm search có 2 cách trả về là trả về vị trí hoặc 1 tọa độ of obj
    public Student searchAStudent(String id) {
        if (arr.isEmpty())
            return null;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id))
                return arr.get(i);
        }// nếu thấy sv thì tìm ra ngay hter thứ i tìm thấy
        
        // đi hết for ko thấy thì trả null
        return null;
    }
    
    // hàm bao hàm search trên
    public void searchAStudent() {
        String keyword;
        System.out.print("Input id ò a std do yu want: ");
        keyword = sc.nextLine();
        Student xxxx = searchAStudent(keyword);
        if (xxxx == null)
            System.out.println("NOT FOUND!!!");
        else {
            System.out.println("FOUND. here she/he is");
            xxxx.showProfile();
        }
    }
    
    //c1
    public void updateAStudent(String id, double newGPA) {
        Student xxxx = searchAStudent(id);
        if (xxxx == null) {
            System.out.println("NOT FOUND");
            return;
        }
        xxxx.setGpa(newGPA);
        //updateAStudent("xxxx", newGPA);
    }
    
    public void updateAStudent() {
        String keyword;
        double newGPA;
        System.out.print("Input id of a std do yu want update: ");
        keyword = sc.nextLine();
        Student xxxx = searchAStudent(keyword);
        if (xxxx == null)
            System.out.println("NOT FOUND!!! NOTHING TO UPDATE");
        else {
            System.out.println("Input a new gpa: ");
            newGPA = Double.parseDouble(sc.nextLine());
            updateAStudent( "xxxx" , newGPA);
        }
    }
}
    
