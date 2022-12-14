
package data;

/**
 *
 * @author 2180358
 */

// ke thua tu cha
public class Child extends Parent {
    
    public Child(String assetOne, String asserTwo) {
        super(assetOne, asserTwo);
    }
 
    @Override
    public void showProfile() {
        System.out.println("PARENT asset1: " + assetOne + "; Aseet2: " + asserTwo);
    }
    
    // ham moi cua con khac cha
    public void sayHi() {
        System.out.println("Hey, I am a rich kid");
        
    }
}
