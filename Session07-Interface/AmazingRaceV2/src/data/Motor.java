
package data;

import java.util.Random;

/**
 *
 * @author 2180358
 */

// la 1 dua thu nen dung implements chu ko phai ke thua(extends)
// cu co hanh dong nao thi co them hanh dong cua clb do -> `@override
// trg java . 1 con co toi da 1 cha, don ke thua
//            1 con tham gia n club, vay se co hanh dong cua n clb

public class Motor implements DeathRacer {
    public static final double MAX_SPEED = 180;
    private String model;
    private String volume; // so phan khoi 125.0cm3
    private String vin;

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", volume=" + volume + ", vin=" + vin + '}';
    }
    
    // hvi cua moto la chay, co toc do dc ghi nhan
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }
    
    // quay video va gay toc do
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%-8s|%-11s|%5.1f|\n", "MOTOR", model, volume, vin, run() );
    }

    @Override
    public double runToDead() {
        return run() * 3;
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-10s|%-8s|%11s|%5.1f|\n", "MOTOR=RACER", model, volume, vin, runToDead());
    }
}
