
package dogmanagement;

import data.Dog;

/**
 *
 * @author 2180358
 */
public class DogManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // lay khuon Dog ra de bat dau do info
        // dat ten tat cho obj de tham chieu den
        Dog chiHu = new Dog("Chi Hu Hu", 2021, 52.2);
        // bien        obj
        // co obj thi obj se biet lam j do
        chiHu.bark();
        
        Dog ngaoDa = new Dog("Ngao Da", 2020, 50.0);
        ngaoDa.bark();
        
        int yob = 2021;
        System.out.println("yob: " + yob);//2001
        yob = 2022;
        System.out.println("yob again: " + yob);//2002
        
        System.out.println("chi huhu sua again");
        chiHu.bark();
        
        System.out.println("after overweight: ");
        chiHu.setNewWeight(55);
        chiHu.bark();
        
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        
        // show tat ca info theo toString()
        System.out.println("Show all info");
        String chDetail = chiHu.toString();
        System.out.println("CHIHU DETAIL: " + chDetail);
        
        System.out.println("NGAO DA: " + ngaoDa.toString());
        // ham toString rat db, vi muc tieu la sho ra all of info minh co
        
        System.out.println("play with toString - Goi tham ten em");
        System.out.println(chiHu);// chiHu la ten bien 
        System.out.println(ngaoDa);
        
        // neu khuan ko co ham toString() thi mca nhien khi no bi goi 
        // no se auto tra ve vung RAM cua obj thanh con so HEXA
        
        //xem tuoi cua 1 obj - tuong tac, hoi dap, giaotiep vs obj qua dau cham
        System.out.println("ND Age" + ngaoDa.getAge());
        
    }
    // co 2 vung name danh cho 2 obj
    // ngao da ko de len data cua chihuhu
    
   
}
