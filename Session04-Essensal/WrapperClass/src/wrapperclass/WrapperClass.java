/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;

/**
 *
 * @author 2180358
 */
public class WrapperClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithInteger();
        //playWithPointers();
        playWithPools();
    }
    
    // Hồ bơi; nhieeufchangf trỏ 1 nàng, share chung vùng new Wrapper
    public static void playWithPools() {
        Integer n1 = new Integer("2003");
        
        Integer n2 = 2003;
        Integer n3 = 2003;
        
        //n1 == n2? n2 = n3?
        if (n1 == n2)
            System.out.println("n1 bằng n2");
        else
            System.out.println("n1 éo bằng n2");
        System.out.println("n2 vs n3:" + (n2 == n3));
        
        Integer n6 = 127;
        Integer n7 = 127;
        System.out.println("n6 vs n7:" + (n6 == n7));
    }
    
    public static void playWithPointers() {
        Integer num0 = 2000;// t trr vùng new có lõi 2k
        Integer num1 = 2000;// t trỏ vung new khác có lõi 2k
        // sđi so 2 địa chỉ có mà điên
        // CHỐT: cấm tuyệt đối > >= < <= == != cho biến obj
        // vì nó mang ý nghĩa so sánh 2 số nhà, 2 địa chỉ -> vô nghĩa
        
        // phải hỏi là bên trg num1 vadf num2 có bằng nahu ko?
        // muốn ss 2 obj phải vào vùng new, phải .
        
        if ( num0.intValue() == num1.intValue())
            System.out.println("2 đứa bằng nhau");
        else
            System.out.println("2 đứa ko bằng nhau");
        
        System.out.println("so sáng 2 số num1 vs num2: " + num0.equals(num1));
    }
    
    // colection, list/set/map chỉ chơi với obj
    public static void playWithInteger() {
        int num0 = 2003;
        Integer num1 = new Integer("2003");
        Integer num2 = new Integer(2003); //đừng chơi trò nay
        Integer num3 = 2003; // new ngầm, nhưng bản chất vẫn new 2003
        
        // in thử xem sao
        System.out.println("num0: " + num0);// xài luuoon vùng ram
        System.out.println("num1: " + num1);// biến con trỏ, gọi thầm tên e
        System.out.println("num2: " + num2);//.toString()
        System.out.println("num3: " + num3);//.intValue()
        // vào bên trg lấy value ra mà xài, lõi chính là 4byte
        // BOXING là hiện tượng PRIMITIVE -> OBJECT
        // gán Primitive vào biến obj -> new trc roiof nhét value vào trg hạt nhân
        
        int num4 = num3;// con trỏ mà chơi với primitive??
                        // vào vùng new num3 lôi ra cái lõi chính là con int value
                        // lôi sang num4-> KHUI HOP LAY LOI THAY SANG PRIM
            // UNBOXING: gán từ Wrraper obj sang pri
        System.out.println("num4: " + num4);
        
        num3 = 2002; // điều j diễn ra trg ram? vùng new mới integer 2002 đổ vào
        // vùng new cũ 2003 bị cty mtruong dọn dẹp
        // WRAPER CLASS méo có hàm set chỉ có hàm get
        // CLASS này obj này gióng read only tức là 1 khi dã new ra ko cho sửa lại
        // ng ta gọi là IMMUTABLE CLASS: class ko cho sửa info,
        // MUTABLE là class có hàm sêt() sửa đc value vaf đạc điểm
        
    }
    // Wrapper Class là những class dc sinh ra để bao cái pri lại thành 1 obj
    // lôi của obj này chính là chỉ có 1 biến hoy, biến pri
    // chứa các con số, 1 mình con số, theo kiểu trỏ vào vùng new wrapper class
    // lõi chính là số cần new
    // khác mảng [] 2 loại mảng pri và mảng obj
    
    // Wrapper class : Byte, Short, Integer, Long, Float, Double, Boolean, Charater
    //lõi              byte  short  int      long  float  double  boolean char
}
