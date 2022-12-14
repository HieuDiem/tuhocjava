
package data;

import java.util.Scanner;

/**
 *
 * @author 2180358
 */


public class Shelf {
    private String color;
    private String label;
    
    // chưa cái j?
    //1.đóng tủ sẵn kích thước
    //2. theo yc
     
    private Student[] ds = new Student[300];
    
    //bản chất non-static
    private Scanner sc = new Scanner(System.in);
    private int count = 0;
    
    //cónstructor làm nhungex việc j: đổ info vào
    // bài này đổ màu sắc, tủ đựng cho việc j (label)
    //đặt hàng dung lượng, hoặc fix dung lượng
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;  
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    //hành động add mới hồ sơ lặp lại cho mỗi cái tủ,1 cái kệ
    public void addAStudent() {
    //chơi for là vỡ mặt, phải lam từ từ, vì sẽ đc liên tục bổ sung.
    //theo quy trình cty, cách bạn qly
        String id, name;
        int yob;
        double gpa;
        
        System.out.println("Input stud #" + (count + 1) + "/" + ds.length);

        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        ds[count] = new Student(id, name, yob, gpa);
        count++;// đã xong 1 dso, phải sẵn sàng cho hồ sơ tiếp theo
        // bao nhiêu lần mở tủ là bấy nhiêu lần count tăng
    }
    
    public  void inputAStudent() {  
        String id, name;
        int yob;
        double gpa;

         System.out.println("Input stud #" + (count + 1) + "/" + ds.length);

         System.out.print("Input id: ");
         id = sc.nextLine();

         System.out.print("Input name: ");
         name = sc.nextLine();

         System.out.print("Input yob: ");
         yob = Integer.parseInt(sc.nextLine());

         System.out.print("Input gpa: ");
         gpa = Double.parseDouble(sc.nextLine());

         ds[count] = new Student(id, name, yob, gpa);
         count++;
        }
    public void printStudentList() {
        System.out.println("There are :" + count +"student in the list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();
            
        }
    
    }
}
