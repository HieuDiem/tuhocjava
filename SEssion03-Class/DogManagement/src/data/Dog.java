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
    
    //khuon phai co do dung vl vao -> pheu -> tao ra construct ai obj
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;   
    }
    // pheu(contructor) la contructor ham khoi tao ra obj
    // moi lan goi cont tuc la dua dl vao la co 1 obj moi
    // cont la ham db ko co gtri tra ve, ko void luon
    // ten giong ten class
    // viet cac ham xu ly data vd nam sinh
    // obj thi goi la hanh dong, xu ly tinh toan tren cac bien do value
    
    
    //ham goi nhiue lan, ca hnah dong ma obj nao do lap di lap lai
    // hanh dong se xu li nhieu lan tren obj do
    public void bark() {
        System.out.println("Gogogoggogo... my name is : " + name);
        System.out.println("Gogogoggogo... my age is : " + yob);
        System.out.println("Gogogoggogo... my weight is : " + weight);
    }
    
    // thay doi info ban dau
    public void setNewWeight(double newWeight) {
        weight = newWeight;
    }
    
    //mac dinh info la giau khi minh gaio tiep ms bat ra no
    // chia se info khi dc hoi, do la mehtod ham hanh dong get()
    public int getYob() {
        return yob;
    }
}
