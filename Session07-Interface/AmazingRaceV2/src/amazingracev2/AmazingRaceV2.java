/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingracev2;
import data.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
/**
 *
 * @author 2180358
 */
public class AmazingRaceV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        runToDead();
    }
    
    public static void playAnonymous() {
        //List list = new ArrayList();
        // day la abs, interface
        List list = new List() {
            @Override
            public int size() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isEmpty() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean contains(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Iterator iterator() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object[] toArray() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object[] toArray(Object[] a) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean add(Object e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean remove(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean containsAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean addAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean addAll(int index, Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean removeAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean retainAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object get(int index) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object set(int index, Object element) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void add(int index, Object element) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object remove(int index) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int indexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int lastIndexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public ListIterator listIterator() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public ListIterator listIterator(int index) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public List subList(int fromIndex, int toIndex) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
    }
    
    public static void runToDead() {
        
        // neu co them 1 class Mermaid thi phai chout tao class moi, viet code bt
        //nhung ko phu hop vi class moi ko thich di dua
        //neu class ko theo logic chung, nhu vay obj le ko nhap chung doan Mermaid truyen htong
        // ko bat Mermaid implements DathRacer
        //ko can Anomymous Class, ko them clas roi , ma chi can tham gia hd, 
        // implements all abstract method on the go, take-away
        // lam class rieng re de nhan ban nhieu menber
        // lam on the go cho vang lai ghe tham
        // ca 2 deu implements, `Overrride vi cha va clb ko hoan hao
        // OBJECT ON THE GO< CAN CO HAM DUA< KO CAN CLASS CO SAN DE NHAN BAN
        //MUON CLB nhu MUON GIO BE MANG AY,
        // ko co khuon nen phai code tu dau, tao khuon
        
        DeathRacer mnnCTT = new DeathRacer() {
            // VUNG KO GIAN ROI CUA CLASS ROI MA TA LAM RIENG
            //VUNG NAY CHINH LA PHAN MO RONG CUA CLB
            public static final double MAX_SPEED = 50.0;
            
            @Override
            public double runToDead() {
                return new Random().nextDouble() * MAX_SPEED  * 3;
            }
            
            @Override
            public void showHowToDead() {
                System.out.printf("|%-20s|%-10s|2015|%5.1f|\n", "MER_RACER","MNN_CTT", runToDead());
            }
        };
        
        
        Dog d1 = new Dog("NGAO DA" , 2021, 50.0);
        Pet d2 = new Dog("VANG OI" , 1950, 10.0);
        DeathRacer d3 = new Dog("NANH TRANG" , 1901, 20.0);
        
        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3","56F6-67889");
        
        DeathRacer racer[] = {d1, (Dog)d2, d3, m1, m2, mnnCTT};
        
        System.out.println("The racing record");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
    }
}
