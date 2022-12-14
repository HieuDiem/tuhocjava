
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
        
        Child c1 = new Child("NHA NHO", "100ETH", "DU THUYEN");
        c1.showProfile();
        // neeu ko co doo rieng, thi xai do cua ba
        // phai theo quy tac cua vha
        //neu muon tu lam thi dung @Override
        //khai con new con, cham so ra phan ke thua cua cha va phan cua con
        
        c1.sayHi();
        
        Parent c2 = new Child("CAN HO CAO CAP", "DOGECOIN", "MOTO");
        c2.showProfile();
        
        //keo gian cai con tro CHa -> xuong en day new Child
        // can con tro tam de chi den day new child
        
        Child x = (Child)c2; // can tro vung new child()
       // c2 van a Parent, tuong duong nha soi day chun
       //ki thuat ep kieu, nhung co su tuong dong 
        x.sayHi();
        
        // cach 2 lay loi hon, xuat phat tu cach 1 nhung ko them xai
        //(Child)c2.   // dau . qua manh, cham sat ai thi cu xu theo type do
        //ep xong roi se cham, thay doi do uu tien
        ((Child)c2).sayHi();
    }
}
