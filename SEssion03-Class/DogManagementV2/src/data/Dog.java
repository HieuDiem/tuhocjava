/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 2180358
 */
// khuon dung de duc ra oject, doi tuong luu tru info...
// khuon phai kin co cho de hung vao data
public class Dog {
    // chua dac diem, chi tiet ma cac obj co 
    private String name;
    private int yob;
    private double weight;

    public Dog(String name, int yob, double weight) {
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
    
    // ta chu dong dua info cua ta ra
    public void bark() {
        System.out.println("Gogogoggogo... my name is : " + name);
        System.out.println("Gogogoggogo... my age is : " + yob);
        System.out.println("Gogogoggogo... my weight is : " + weight);
    }
    public void setNewWeight(double newWeight) {
        weight = newWeight;
    }

    @Override// dinh den ke thua nhung cs hai deu lien quan den kn la POLIMORPHISm-50 sac thai khac nhau
    public String toString() {
        //turn "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        
        String tmpMsg = String.format("|GoGo|%-10s|%4d|%4.1f|", name, yob, weight);
        //tra chuoi tho ko xuong hang
        return tmpMsg;
    }
     // Ham gan lien viec xu lys info cua chinh obj, ai giau info, ga do nen xu ly
    public int getAge() {
        return 2021-yob;
    }
    
}
