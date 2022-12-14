package varnfun;

import java.util.Scanner;

/**
 *
 * @author 2180358
 */
public class VarNFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        boolean result = isPrime(0);
        System.out.println("0: " + isPrime(0));
        printPrimeList();
        solve();
//        int n = getAPositiveInteger();
//        System.out.println("Your number: " + n);
//        printInterList(n);//truyen tham tri,  pass by value
                            // value tu n cua ham main() se dc dua sang n cua ham print
                            // OOP pass by reference - truyen tham chieu(con tro, dia chi)
        //printInterList();
        //playWithBooleans();
        //playWtithCharacters();
        //playWtithDoubles();
        //playWithIntegers();
        //playWithVarriables();
    }
    // ktra so nguyen to
    public static boolean isPrime(int m) {
        if (m < 2)
            return false;
        // kiem tra xem 2 ... can(m) co chia het cho so nao ko?
        if ( m == 2)
            return true;
        //for tu 2...can(n)
        for (int i = 2; i <= Math.sqrt(m); i++) 
            if (m % i == 0)
                return false;
                  
        return true;
    }
    // in cac so nguyen to
    public static void printPrimeList() {
        System.out.println("cac so nguyen to tu 1 den 1000");
        for (int i = 0; i < 1000; i++) {
            if (isPrime(i) == true)
                System.out.print(i + " " );
        }
    }
    // viet ham nhap vao tu ban phim roi giai pt bac 1
    public static void solve() {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("input value a: " );
        int a = sc.nextInt();
        System.out.print("input value b: " );
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }
            else
                System.out.println("phuong trinh vo nghiem");
        }else
            System.out.println("phuong tring co nghiem duy nhat: " + (-b/a));
    }
    
    public static int getAPositiveInteger() {
        int n;
        // nhap tu ban phim, xai ki thuan OOP, n.
        Scanner sc = new Scanner(System.in);
        System.out.print("input a poditive integer: ");
        n = sc.nextInt();
        
        
        return n; // getAPositiveInteger() = n
    }
    //hien tuong 1 class bat ki chua nhie hmam trung ten nhung khac phan tham so  
    //dau vao, ma phai khac tren data type chu ko phai khac ten bien
    // duoc goi la OVERLOAD/ OVERLOADING - qua tai ham
    public static void printInterList(int n) {
        for (int i = 0; i <= n; i++) 
            System.out.printf("%d ", i);
        System.out.println("\n");
    }
    // in tu 1 den 100
    public static void printInterList() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
    public static void playWithBooleans() {
        boolean marriedStatus = true;
        if (marriedStatus == true)
            System.out.println("Vuon hong co loi nhung ko cho vao");
        else
            System.out.println("Danh don co dich moi vui");
        
    }
    
    public static void playWtithCharacters() {
        // 2byte cho kieu char
        char m = '$';
        String name  = " NGuyen Thi Diem";
        System.out.println("my name is :" + name);
        System.out.println("1st letter of my name: " + name.charAt(0));
        System.out.println("my name as in a uppercase: " + name.toUpperCase());
    }
    // uu tien double hon float
    public static void playWtithDoubles() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        
        float vat = 0.1F;
        System.out.println("vat: " + vat);
    }
    
    public static void playWithIntegers() {
        int n = 39;
        System.out.println("n: " + n);
        
        int status = 0xFA; //he 16 = 250
        System.out.println("status: " + status);
        
        
        
    }
    //static thi choi voi static - OOP
    public static void playWithVarriables() {
        //bien la 1 vung ram dc dat ten cchua 1 so byte nhat ding tuy loai dl no chua
        // bien la 1 dai luong dat ten cho 1 dai luong,1 gia tri- don, phuc
        int age = 20;
        int a = 10, b;
        b = 100;
        //ton 12 byte trong RAM ( chon tu ctr + space)
        System.out.println("age: " + age);
        int yob = 2001; 
        age = 2022 - yob;
        System.out.println("age again: " + age);
        
        System.out.printf("age printed by using %% as in C: %d\n", (2022-yob));
        
    }
    
}
