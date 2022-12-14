
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
    }
    // co 2 vung name danh cho 2 obj
    // ngao da ko de len data cua chihuhu
    
    
}
