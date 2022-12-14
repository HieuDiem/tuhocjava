
package basicarray;

/**
 *
 * @author 2180358
 */
public class BasicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithPrimitiveArray();
        //playWithPrimitiveArrayV2();
        //playWithPrimitiveArrayV3();
        //playWithStudentObject();
        //playWithStudentArray();
        //playWithObjectArray();
        sortWithObjectArray();
        //sortPrimitiveArray();
    }
    
    public static void sortPrimitiveArray() {
        int a = 9;
        int b = 5;
        System.out.println("a: " + a + "|b: " + b);
        //backup a trc khi a = 5
        
        if ( a> b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println("the value sort");
        System.out.println("a: " + a + "|b: " + b);
        
    }
    //sx theo thư tự điểm thấp -> cao
    public static void sortWithObjectArray() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE666789", "An Nguyen", 2001, 8.9);
        arr[1] = new Student("SE666790", "Binh Le", 2001, 5.9);
        //sx mảng obj- mảng của cá biến obj mà trỏ vào obj
        //chẳng qua là đổi vị trí trỏ, thay đổi value,/tọa độ của cùng obj
        // mà đang lưu trg các biến con trỏ
        if (arr[0].getGpa() > arr[1].getGpa()){
            Student x ;
            x = arr[0];
            arr[0] = arr[1];
            arr[1] = x;
        }
        System.out.println("The stud list");  
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
    }
    
    public static void playWithObjectArray() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE666789", "An Nguyen", 2001, 8.9);
        arr[1] = new Student("SE666790", "Binh Le", 2001, 5.9);
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
        //sắp mảng tăng đần theo điểm tb
    }
    
    public static void playWithStudentArray() {
    // lưu 10 bạn sv...
    
        int arr[] = new int[10];
        Student list[] = new Student[10];
        
        list[0] = new Student("SE123456", "An Nguyen", 2001, 7.8);
        list[1] = new Student("SE123457", "Binh Nguyen", 2001, 7.9);
        list[2] = new Student("SE123458", "Cuong Nguyen", 2001, 7.8);
        list[3] = new Student("SE123459", "Dat Nguyen", 2001, 7.9);
        list[4] = new Student("SE123460", "Giang Nguyen", 2001, 7.8);
        
        System.out.println("The list of student");
        for (int i = 0; i < list.length; i++) {
            list[i].showProfile();// có j mà show, lỗi NullPointerException
            
        }
       
        //Z tắc khi chơi với mảng là biến count để cho biết mảng đã gắn value
        // đến đâu for dến đó, ko for dến lenght
        //bị default với primitive, bị null với mảng obj
        
    }
    
    public static void playWithStudentObject() {
        Student x = new Student("SE666789", "An Nguyen", 2001, 8.9);
        x.showProfile();
    }
    
    public static void playWithPrimitiveArrayV3() {
        int arr1[] = {5, 10, 15};//new ngầm
        int arr2[] = new int[5];
        int arr3[] = new int[]{5, 10, 15, 20};
        
        int arr[];
        arr = new int[5];
        //có nhiều biến trùng tên, sd biến theo nhu cầu
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        
        //arr là biến đặc biệt, là biến obj vì trỏ 1 vùng new bự
        //arr.lenght - lưu biến của 1 mnagr có bn ptu. đây là non-static
        
        System.out.println("Array has: " + arr);
        // convert data của các biến thành mã hexa
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        //get(), set() ko có mà thay đổi = thay trực tiếp 
    }
    
    public static void playWithPrimitiveArrayV2() {
        double arr[] = new double[10];//defalult gán hết = 0
                        // new() là phễu để đúc obj
                        // muốn 365 biến double
        
        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;
        System.out.println("The array há value:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThe array has vlaue(for each)");
        for (double d : arr) {
            System.out.print(d + " ");
        }
    // dù là mảng là j, tên mảng là biến j đi nữa thì sẽ trỏ vùng ram new tạo nhiều biến
    //mảng sẽ quản lý nhiều ptu => tên mảng sẽ chấm đc số phần tử
    }
    
    public static void playWithPrimitiveArray() {
        //float vol[365]; java cần khai báo kích thước mảng, số phần tử trg mảng []
        
        float v[] = {0, 5, 10, 15, 20, 25};//mảng có 6 phần tử, có sẵn value
        //7 biến float này nằm trên HEAP,có new ngầm, có malloc()
        System.out.println("The array has value");
        for (int i = 0; i < 6; i++) {
            System.out.print(v[i] + " ");
        }   
        // ta có thể xưm mảng là tập hợp các value trg {} giống toán
        System.out.println("\nThe array v has values:");
        for (float x : v) {
            // với mọi x trg v: x = v[0], x = v[1]
            System.out.print(x + " ");
        }
        
    }
    
}
