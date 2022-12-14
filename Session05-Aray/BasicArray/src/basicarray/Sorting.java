
package basicarray;

/**
 *
 * @author 2180358
 */
public class Sorting {
    // thêm 1 main() ngoài main() ban đầu, main() phải mở lên shift F6
    //F6 đứng class nào cũng đc, sẽ ưu tiên/ default main() đầu tiên tạo ra
    //có tehr đổi main default đc nếu muốn
    // phải chuột/property/run/...
    public static void main(String[] args) {
        //sortPrimitiveArray();
        sortStudentList();
    }
    
    public static void sortStudentList() {
        Student arr[] = new Student[]{
            new Student("SE123456", "An Nguyen", 2001, 8.9),
            new Student("SE123457", "Binh Nguyen", 2001, 5.9),
            new Student("SE123458", "Cuing Nguyen", 2001, 6.9),
            new Student("SE123459", "Dung Nguyen", 2001, 7.9),
            new Student("SE123460", "Duong Nguyen", 2001, 8.5),
        
        };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()){
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("The student lít before sorting ");
        for (Student std : arr) {
            std.showProfile();
        }
    }
    
    public static void sortPrimitiveArray() {
        int[] arr = new int[]{5,0,30,15,20};
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("sx:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    
    }
}
