package data;




/**
 *
 * @author 2180358
 */
public class Student {
    private  String id;
    private  String name;// nằm ở 1 vùng nhớ riêng mà ai cungx xài đc
                                // vùng nhớ xài chung cho các obj cùng nhóm, class
                                 // dl đổ vào chỉnh theo thangef cuối cùng
    // CHỐT HẠ: KO DÙNG STATIC CHO NHỮNG HÀM MÀ DÙNG RIÊNG CHO TỪNG OBJ
    // chung đặc điểm, khác value, vậy phải có biến clone riêng,  NON-STATIC
    
    private int yob;
    private double gpa;// non -static

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getPga() {
        return gpa;
    }

    public void setPga(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    }
    
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    }
    //NON-STATIC CHƠI VỚI NON - dĩ nhiên cùng obj, và STATIC luôn, đồ riêng thành chung
    public int getAge() {
        return 2022 - yob;
    }
    
}
