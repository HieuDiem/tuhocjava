
package studentmanagement;

import data.Student;
import java.util.*;

/**
 *
 * @author 2180358
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithSet();
        //sortArrayListManually();
        //playWithArrayList();
//        Student xxx = getAStudent("se123457");
//        if ( xxx != null)
//            xxx.showProfile();
//        else
//            System.out.println("NOT FOUND");
        //sortStudentList();
//        List<Student> result = initData();
//        System.out.println("The std list");
//        for (Student st : result) {
//            st.showProfile();
//        }

        List<Student> arr = initData();
        Student xxxx = searchAStudent(arr, "SE888888");
        if (xxxx == null)
            System.out.println("NOT FOUND");
        else{
            xxxx.showProfile();// xxxx đang  trsr vùng new bạn 888
            // update điểm số
            xxxx.setGpa(8.0);
        }
        
        System.out.println("Sau khi thay điểm");
        for (Student st : arr) {
            st.showProfile();
        }
    }
    // đưa vào msv mún tim
    
    //-------------------------
    // TỬ tế hàm search và sort, và update luôn
    //-------------------------
    
    public static List<Student> initData() {
        // hàm trả về 1 cái túi có sẵn bên trg 1 nhóm sv
        // là trả về tọa độ 1 cái túi, cái túi chứa thẻ bài svlà chuyện khác nữa
        List<Student> arr = new ArrayList();
        Student chin = new Student("SE999999", "CHÍN LE", 2001, 9.0);
        arr.add(new Student("SE444444", "BỐN NGUYEN", 2001, 4.4));
        arr.add(chin);
        
        arr.add(new Student("SE555555", "NĂM NGUYEN", 2001, 5.5));
        arr.add(new Student("SE888888", "TÁM LÝ", 2001, 8.8));
        return arr;// initData() = arr; arr ơi m trỏ chỗ nào cho t trỏ vs
    }
    
    public static Student searchAStudent(List<Student> arr, String id) {
        // arr là cái túi new đâu đó, tên biến là con trỏ mà
        // trg túi này có 1 đám sv sẵn rồi, add sẵn rồi
        // ở ddaay result trổ vào
        if (arr.isEmpty()) // túi ko có thẻ bài, ko có sv
            return null; // có sv nào đau, trả về tọa độ
        //cpu chạy xuống đây, túi có thẻ bài rôi
        for (int i = 0; i < arr.size(); i++) {
            Student tmp = arr.get(i);
            if (tmp.getId().equalsIgnoreCase(id))
                return tmp; // return thẻ bài thứ i có trỏ vùng id thấy thẻ bài,
            // con trỏ lưu tọa độ
        }
        // đi hết mfor mà ko thấy hàm yc trả tọa độ vùng new
        return null;
    }
    
    
    //TỬ tế hàm search
    public static void sortStudentList() {
        List<Student> arr = new ArrayList();
        Student chin = new Student("SE999999", "CHÍN LE", 2001, 9.0);
        arr.add(new Student("SE444444", "BỐN NGUYEN", 2001, 4.4));
        arr.add(chin);
        
//        arr.add(chin);// ds thong kê bị trung
        arr.add(new Student("SE555555", "NĂM NGUYEN", 2001, 5.5));
        arr.add(new Student("SE888888", "TÁM LÝ", 2001, 8.8));
        
        System.out.println("The sutdent list");
        for (Student st : arr) {
            st.showProfile();
        }
        
        for (int i = 0; i < arr.size() - 1; i++) 
            for (int j = i + 1; j < arr.size(); j++) 
                if (arr.get(i).getGpa() > arr.get(j).getGpa()){
                    Student t = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, t);
                }// set là thay đổi info của con trỏ, trỏ chỗ khác
                // lấy thẻ bài ra khắc lại tt con trỏ
        System.out.println("SAu khi sx");
        for (int i = 0; i < arr.size(); i++) {   
            arr.get(i).showProfile();
            
        }
    }
    
    
    public static Student getAStudent(String id) {
        List<Student> arr = new ArrayList();
        Student an = new Student("SE123456", "AN NGUYEN", 2001, 8.0);
        arr.add(new Student("SE123457", "BÌNH LÊ", 2001, 7.8));
        arr.add(an);

        Student tmpStudent = arr.get(0);// lấy đc tọa đọ sv 0

        // hỏi xdm id là gì
        String tmpId = tmpStudent.getId();// arr.get(0).getId()
        //if (tmpId == id) return tmpStudent;// arr.get(0)
        
        if (tmpId.equalsIgnoreCase(id))
            return tmpStudent;
        return null;// ko tìm thây 
         
    }
    
    
    //set là  1 loại giỏ, mà ko cho phép đựng trùng
    // set ko chấp nhận con trỏ trùng vùng new
    public static void playWithSet() {
        Set<Student> arr = new HashSet();// mua 1 cái túi Dỏaemon
                                        // mở khóa để thao tác . hàm()
        Student an = new Student("SE123456", "AN NGUYEN", 2001, 8.0);
        
        arr.add(an);
        arr.add(an);
        arr.add(new Student("SE123457", "BÌNH LÊ", 2001, 7.8));
        
        // ko có hàm get() vì loại giỏ này đưa con trỏ vào có 2 th xảy ra
        // thẻ bài đưa vô ko giữ nguyên ttu như lúc đưa vào
        // lấy thì for each quét toàn bộ
        // HAshSet: để lôn xộn thẻ bài. 2 là đẻ có ttu theo cách riêng
        // giỏ chứa mấy thẻ bài
        System.out.println("Số lượng thẻ bài co");
        for (Student st : arr) {
            st.showProfile();
            
        }
    }
    
    public static void sortArrayListManually() {
        List<Student> arr = new ArrayList();
        Student binh = new Student("SE123457", "BINH LE", 2002, 8.0);
        
        arr.add(new Student("SE123456","AN NGUYEN", 2003, 9.0));
        arr.add(binh);
        // co 2 con tro trg túi
        // get() từng thẻ bài thì đc tọa độ vùng new
        //[i] đc toaj độ vùng new, mooic ptu la 1 tọa độ
        
        System.out.println("The std list");
        
        for (Student st : arr) {
            st.showProfile();
        }
        
        System.out.println("The std list using for i");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
        
        Student tmp = arr.get(0);// tmp trỏ cùng vào an 
        arr.set(0, arr.get(1)); // con trỏ thứ 0 trg giỏ phải chỉ vào bình
        arr.set(1, tmp); // con trỏ 1 thay cách trỏ, trỏ vào vùng tmp dang trỏ
        // tmp đang trỏ an 9.0
        // vùng new Std() vẫn nằm im , chỉ có con trỏ trg giỏ trỏ vào vùng new
        
        System.out.println("SX ds hs");
        for (Student st : arr) {
            st.showProfile();
        }
    }
    
    public static void playWithArrayList() {
        
        // List arr = new ArrayList();
        // đựng j cũng đc, dduengj tham chiếu hoy nha
        // nhét được NV, GV, HS< Animal, Dog...
        
        //arr là 1 cái túi chứa vô hạn con trỏ
        List<Student> arr = new ArrayList();
        // List<Student> arr = new ArrayList<>();
        // List<Student> arr = new ArrayList<Student>();
        //nhét đồng nhất món đồ dể dễ chấm chung
        
        // MỞ NGĂN TỦ, NHÉT ĐỒ VÔ
//        arr[i] = new Student(...) ;// mảng
//        arr.add(new Student(...));// lưu con trỏ thôi
           // bên ngoài, vùng HEAP
           
        Student s1 = new Student("SE123456", "AN NGUYEN", 2001, 7.8);
        Student s2 = new Student("SE123457", "BÌNH Lê", 2001, 7.9);
           
        arr.add(s1); // giỏ vùng new ArrayList, tủ có thêm 1 con trỏ
        arr.add(s2);// sinh ra thêm 1 con trỏ nữa[1],
                        // add() vô tận, mảng [lenght -1] hết mức
                        // new cứ nằm HEAP, SV cứ ở nhà
                        // add() mở khóa kéo, nhét đồ vô, nhét tham chiếu
        arr.add(s1);// add trùng nè,
        // Set ko báo lỗi, chỉ lấy 1... đừng đi vào chi tiết vội vã!!!
        arr.add(new Student("SE999999", "CHÍ MẠNG", 2001, 7.9));
        // 1 con trỏ nữa lại đc add vào
        
        // ? xem túi có bn đồ
        // arr.length hỏi túi mà
        System.out.println("The bag has: " + arr.size() + " món đồ");
        //4 sv nhưng thực ra là 3sv vì đếm trùng
        // in mn ra, chứa bên trg 1 đống con trỏ
        // mange [i].showProfile()
        
        // add() đẩy vào 1 con trỏ
        //get(vị trí muốn lấy) trả về tọa độ con trỏ thứ i
        
        //[i] lấy đc tham chiếu bạn thứ i
        // gét(i) lấy đc chỗ ngồi tham chiếu con trỏ thẻ bài thứ i
        // a thẻ này trỏ bạn sv kia
        // in bạn sv đầu tiên
        // arr[i].showProfile() phần tử đầu tiên của mảng
        Student x = arr.get(0);// trả về tọa độ con trỏ thẻ bài thứ 0
        // trả về tọa độ gán vào biến khác nằm cùng tọa độ ok
        System.out.println("The Student list");
        x.showProfile();
        
        // bạn 1 get(1) có tọa độ chấm luôn
        arr.get(1).showProfile();
        
        System.out.println("In XỊn Xò");
        for (Student st : arr) {// éo sợ NULL POINTER
            // add đến dâu thêm con trỏ dến đó
            // st = arr.get(i) = arr[i]
            st.showProfile();
            
        }
        
        System.out.println("In xịn xò for truyền thống");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
        
        // có hành động xóa 1 con trỏ, loại bỏ 1 ng khỏi ds
        // vùng new Student có bị mất hay ko tùy vào vị trí mấy con trỏ
        // size() giảm liền, mảng ko có fix cứng số con trỏ
        // set() đảo con trỏ, trỏ sang vùng khác(get() hàm set() xưa nay của các obj
    }
}
