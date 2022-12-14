
package data;

/**
 *
 * @author 2180358
 */
public class Parent {
    protected String assetOne;
    protected String asserTwo;

    public Parent(String assetOne, String asserTwo) {
        this.assetOne = assetOne;
        this.asserTwo = asserTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAsserTwo() {
        return asserTwo;
    }

    public void setAsserTwo(String asserTwo) {
        this.asserTwo = asserTwo;
    }

    @Override
    public String toString() {
        return "Parent{" + "assetOne=" + assetOne + ", asserTwo=" + asserTwo + '}';
    }
    
    public void showProfile() {
        System.out.println("PARENT asset1: " + assetOne + "; Aseet2: " + asserTwo);
    }
}
