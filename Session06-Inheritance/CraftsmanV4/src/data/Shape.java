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
public abstract class Shape {
    protected String owner;
    protected String color;
    protected String borderColor;
    
    // cac canh de sao
    // ban kinh va canh la rineg cua tung dua con-> phan di biet
    
    // S, cv ddc tinh tu thang khac, ko nen de day

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }
    
    //S va cv ko dc xem la dac tinh ma la dan xuat-> nen de o con hay cha?
    // de ca 2 ben
    // cha la nhan tu chung cua con
    // ABSTRACT: kn noi thoy, chua can cu the
    //          CLASS: la su phan loaitrg cuoc song, trg tu nhien de de dang noi ve cac obj
    public abstract double getArea();
    public abstract double getPerimeter();
//    public double getArea(){
//        //tinh tn?
//    }
//    
//    public double getPerimeter() {
//        
//    }
    public void paint() {
        
    }
}
