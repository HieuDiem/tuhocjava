package main;

import data.Student;

/**
 *
 * @author 2180358
 */
public class Stage {

    public static void main(String[] args) {
        //checkObject();
        //checkObjectV1();
        //checkObjectV2();
        //checkObjectV3();
        //checkObjectV4();
        //checkObjectV5();
        //checkObjectV6();
        Student ahihi = checkObjectV7();
        //ahihi lưu tọa độ của an trg hàm thảy ra ngoài
        ahihi.showProfile();
        
    }
    //hàm trả về 1 obj?-> ko
    // độc chuẩn: hàm trả về 1 tọa độ của obj nào đó, vị trí tọa độ
    //nghĩa là có tọa độ . tới obj
    public static Student checkObjectV7() {
        // student x = sẽ là 1 vùng new
        Student x;// khai báo biến, con trỏ, nhưng chưa trỏ ai
        x = new Student("SE666789", "An Nguyen", 2001, 8.9);
        return x;// x lưu tọa độ vùng clone an, hướng 6M
                   // thảy tọa độ đó cho tên hàm, tên hàm là 6M
        // à, nó đây nè
          
    }
    
    public static void checkObjectV6() {
        
        Student x;// khai báo biến, con trỏ, nhưng chưa trỏ ai
        x = new Student("SE666789", "An Nguyen", 2001, 8.9);
        // à, nó đây nè
          
    }
    
    public static void checkObjectV5() {
        
        //câu chuyện của sinh ra rồi chết non
        //obj ko có tên gọi
        Student s1 = new Student("SE666789", "An Nguyen", 2001, 8.9);
        //           đã tuong đương tọa độ, cho obj nòa giữ dùm
        //biến đó mà chấm(.) nghĩa là tọa độ chấm,-> chốt hạ: New chấm tọa độ
        //chấm là vào trg tọa độ xem có cái gì
        new Student("SE666789", "An Nguyen", 2001, 8.9).showProfile();
        //ko thèm ặt tên cho obj để giao tiếp, obj tự giao tiếp
        //obj vô danh, anonymous obj
        // xuất hiện xong phát hiện ko con trỏ
        //giết, clear
       // muốn re-use lại vùng new, tối thiểu ít nhất 1 tên gọi, 1 biến obj
       // để còn chấm tiếp
        
     
    }
    
    public static void checkObjectV4() {
        
        //câu chuyện của 2 chàng 1 nàng
        Student s1 = new Student("SE666789", "An Nguyen", 2001, 8.9);
        Student x = s1;
        
        s1.showProfile();
        x.showProfile();//back up tọa độ new An ở trên,thêm 1 con trỏ cùng
        
        //cahngf 1 tát, chàng 2 thấy
        s1.setName("MÌnh chơi ú tìm");// trg vùng clone new An thay đổi tên thành Mình..
        System.out.println("After change: ");
        x.showProfile();
        
        // nhiều tên cùng tham chiếu đến 1 obj/ đối tượng 
        
        //cùng tên ấm chỉ nhiều obj -> thay đổi value của biến
        
        //1 obj có nhiều ng ngước nhìn -> tham chiếu
        
    }
    
    public static void checkObjectV3() {
        Student s1 = new Student("SE666789", "An Nguyen", 2001, 8.9);
        Student x = s1;// biến lưu tọa độ vùng lưu 
                        // nếu tự lưu, ra vùng cloen mớ, muốn lấy value cuar s1
        // trc lkhi s1 trỏ tọa độ mới , backup tọa ffooj cũ
        s1 = new Student("SE666785", "Lộc Phát", 2000, 8.8);
        
        s1.showProfile();
        x.showProfile();// back up tọa độ new vào 1 biến khác cùng kiểu
        
    }

    public static void checkObjectV2() {
        Student s1 = new Student("SE666789", "An Nguyen", 2001, 8.9);
        
        s1 = new Student("SE666785", "Lộc Phát", 2000, 8.8);
        //s1 li dị vùng clone An chuyển sang kết nói với lộc
        //
        //s1 là biến obj
        // tôi cần 1 tọa độ vùng new, vùng clone Student
        //gần nhấ
        s1.showProfile();
        //mất tọa độ vùng clone An
        //vùng ram ko ai trỏ tới, thì định kì khi chayl app, 
        //sẽ giết /clear vùng clone ko có o nt
        System.gc();//gom rác HEAP 
        
        //ngoài đời có gán lại biến con trỏ
        
        //1 new 1 clone, 2 sv khac nhau vì 2 vùng ram khác nhau
    }

    public static void checkObjectV1() {
        Student s1 = new Student("SE666789", "An Nguyen", 2001, 8.9);
        Student s2 = new Student("SE666789", "An Nguyen", 2001, 8.9);

        s1.setName("AI RỒI SẼ KHÁC");

        s1.showProfile();
        s2.showProfile();
        //1 new 1 clone, 2 sv khac nhau vì 2 vùng ram khác nhau
    }

    public static void checkObject() {
        Student an = new Student("SE666789", "An Nguyen", 2001, 8.9);
        //reference var          Obj
        // obj var           ínstance, thể hiện, hiện thân 
        an.showProfile();

        //an là biến, vậy nó có thể thay đổi vakue
        // biến có thể tham chiếu ng này, ng kia
        Student x = an;
        an = new Student("SE666790", "Binh Le", 2001, 7.9);
        System.out.println("Đây là bình: ");
        an.showProfile();

        System.out.println("An sau khi ");// an vẫn là an
        x.showProfile();
        // an ko còn cách nào lấy lại vùng ram này
        // tọa độ cũ ta ko lấy lại

        //biến obj là tay cầm con diều, new chính là con diều
        //khi tay cầm nối dây con diều mới, con diều cũ ko còn chơi nữa, đứt sợi dây, bay mất
        //1 vùng ram new obj mà ko còn ai trỏ tới, JVM có ctrinh ngầm gọi là garbage collector
        //gom những vùng new mồ côi ko có con trỏ, dọn free ram trả lại ram ko xài tới cho new sau này
        new Student("SE666789", "ĐẠI GIA", 2001, 9.9).showProfile();

    }
}
