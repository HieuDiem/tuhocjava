
package studentmanagementv2;

import data.Cabinet;

/**
 *
 * @author 2180358
 */
public class StudentMAnagementV2 {
    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        se.addAStudent();
        se.addAStudent();
        
        se.printStudentList();
        se.updateAStudent();
        
        System.out.println("The sutdent after update");
        se.printStudentList();
                
        //search ko thấy
        //se.searchAStudent();
        //co thây
        //se.searchAStudent();
    }
}

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Cabinet ia = new Cabinet();
//        Cabinet se  = new Cabinet();
//        
//        
//        System.out.println("INPUT IA STUDENT");
//        ia.addAStudent();
//        ia.addAStudent();
//        
//        System.out.println("INPUT SE STUDENT");
//        se.addAStudent();
//        
//        System.out.println("IA MARJOR");
//        ia.printStudentList();
//        
//        System.out.println("SE MAJOR");
//        se.printStudentList();
//    }
//    
//}
