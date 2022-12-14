
package parentchild;

import data.Child;
import data.Parent;

/**
 *
 * @author 2180358
 */
public class ParentChild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithParentChild();
    }
    public static void playWithParentChild() {
        Parent p = new Parent("BIET THU", "100BTC");
        p.showProfile();
        // khai cha new cha, xo ra cai j thuoc cua cha
        
        Child c1 = new Child("NHA NHO", "100ETH");
        c1.showProfile();
        // neeu ko co doo rieng, thi xai do cua ba
        // phai theo quy tac cua vha
        //neu muon tu lam thi dung @Override
        //khai con new con, cham so ra phan ke thua cua cha va phan cua con
        
        c1.sayHi();
        Parent c2 = new Child("CAN HO CAO CAP","DOGECOIN");
        c2.showProfile();
        

         
        
    }
}
