package StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            StudentManagement studentManagement = new StudentManagement();
        while(true){
            System.out.println("STUDENT MANAGEMENT PROGRAM");
            System.out.println("1.Display All Student");
            System.out.println("2.Add Student");
            System.out.println("3.Delete Student");
            System.out.println("4.Update Student");
            System.out.println("5.Sign Out");
            try{
                byte choice = Byte.parseByte(scanner.nextLine());
                switch (choice){
                    case 1 :
                        studentManagement.displayAllStudent();
                        break;
                    case 2 :
                        studentManagement.addNew(scanner);
                        break;
                    case 3 :
                        studentManagement.deleteStudent(scanner);
                        break;
                    case 4 :
                        studentManagement.updateStudent(scanner);
                        break;
                    case 5 :
                        return;
                    default:
                        System.out.println("Option mismatch");
                        break;

                }
            }catch (NumberFormatException exception){
                System.out.println("Your have to type number");
            }


        }



    }
}
