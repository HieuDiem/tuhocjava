
package main;

import data.Shelf;
import data.Student;
import java.util.Scanner;

/**
 *
 * @author 2180358
 */
public class Stage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ráp menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf tuSe = new Shelf("PINK", "SE");
        do {
            printMenu();
            System.out.println("Input your choice (1...6");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    tuSe.addAStudent();
                    break;
                case 2:
                    tuSe.printStudentList();
                    break;

                case 6:
                    System.out.println("(bye, bye, see you next time");
                    break;
                default:
                    System.out.println("Please choose 1...6");
            }
        } while(choice !=6);// chưa đúng thì lặp lại
        // chọn 6 để kết thúc 
    }
    
    public static void printMenu(){
        System.out.println("Welcome to FAP");
        System.out.println("Chooce the following func to play with ");
        System.out.println("1. Add a new std profile");
        System.out.println("2. Print the stud list");
        System.out.println("3. Search a stud by id");
        System.out.println("4. Update a std profile");
        System.out.println("5. Remove a std profile");
        System.out.println("6. Quit");
    }
    
    public static void testSheft() {
        //OOP
         Shelf tuSe = new Shelf("PINK", "SE");
         tuSe.inputAStudent();
         tuSe.printStudentList();
        //inputStudentList();
    }
    
    public static void inputStudentList() {
        
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob, count;
        double gpa;
        
        System.out.print("How many Student do u want to input:");
        count = Integer.parseInt(sc.nextLine());
        Student[] arr = new Student[count];
        
        for (int i = 0; i < count; i++) {
            System.out.println("Input stud #" + (i + 1) + "/" + count);
            
            System.out.print("Input id: ");
            id = sc.nextLine();
            
            System.out.print("Input name: ");
            name = sc.nextLine();
            
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            
            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());
            
            arr[i] = new Student(id, name, yob, gpa);
            
        }
        System.out.println("The stud list ");
        for (Student std : arr) {
            std.showProfile();
        }
    }

    
}
