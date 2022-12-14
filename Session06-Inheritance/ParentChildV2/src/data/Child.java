
package data;

/**
 *
 * @author 2180358
 */

// ke thua tu cha
public class Child extends Parent {
    
    private String assetThree; //
    // li thuyet con co 3 thu phai do ca 3, ke thua cha giu dum 2
    // new con chinh la new cha

    public Child(String assetOne, String asserTwo, String assetThree ) {
        super(assetOne, asserTwo);
        this.assetThree = assetThree;
    }

    /**
     *
     * @param nha_nho
     * @param eth
     */


    
//    public Child(String assetOne, String asserTwo, String assetThree ) {
//        super(assetOne, asserTwo);
//        this.assetThree = assetThree;
//    }// phai c cha thi moi co khong gian mo rong
    // bat bc phai new cha trc moi extend dc, co them cho mo rong
    // de luu them phan khac biet

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }
    
    @Override
    public void showProfile() {
        System.out.println("PARENT asset1: " + assetOne + 
                                  "; Aseet2: " + asserTwo + 
                                    "; asset3: " + assetThree);
    }
    
    // ham moi cua con khac cha
    public void sayHi() {
        System.out.println("Hey, I am a rich kid");
        System.out.println("By the way,my 3dr asset is  " + assetThree);
        
    }
     
}

// con co quyen khac tren dac diem va hanh vi cua cha
// dau .  thi sao
// khai con new co thi xo tat
// khai cha new con, chi xo cua cha ko chiu khac bie, dung danh nghia ng lon
//phai hanh xu nhu nguooi lon
// muon xo tat ki thuat to lai con tro