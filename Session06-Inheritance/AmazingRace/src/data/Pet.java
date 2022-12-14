
package data;

/**
 *
 * @author 2180358
 */
public abstract class Pet {
    
    // chua chung nhantu cua dam con
    protected String name;
    protected int yob;
    protected double weight;

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Hamster{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
    }
    
    // hnah dong cua moi con thu cu the
    // abstrac methid: cai j do ko cu the khi de cap ve no
    // chay la hd chung chung pet can co
    public abstract double run();
    // moi loai dv se co cach run khac nhau
    public abstract void showRecod();
    
}
