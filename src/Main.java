import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
//-----------BAI TAP HINH TRON------------
//        Circle circle = new Circle();
//
//        circle.inputData(scanner);
//        circle.printData();
//        circle.chuViHinhTron();
//        circle.dienTichHinhTron();
//-----------BAI TAP Phuong TRINH BAC 2------------
//        QuadracticEquation quadracticEquation = new QuadracticEquation(1,4,4);
//        quadracticEquation.getDiscriminant();

        //-----------BAI TAP FAN------------
//        Fan fan = new Fan(10, 3, true, "yello" );
//        Fan fan2 = new Fan(5, 2, false, "blue" );
//
//        System.out.println(fan);
//        System.out.println(fan2);

        //----------BAI TAP STOP WATCH---------------

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 220000; i++) {
           stopWatch.end();
        }
        System.out.printf("Your time: %f", stopWatch.getElapsedTime());

        //-----------BAI TAP STUDENT MANAGEMENT------------

//        System.out.println("Student Management Program");
//
//        Student studentList[] = new Student[100];
//        boolean flag = false;
//
//        while(true){
//            System.out.println("1. Display all student");
//            System.out.println("2. Add student");
//            System.out.println("3. Update student");
//            System.out.println("4. Remove student");
//            System.out.println("5. Sign out");
//            System.out.println("Please select option");
//            byte choice = Byte.parseByte(scanner.nextLine());
//            switch (choice){
//                case 1 :
//
//                    break;
//
//                case 2 :
//                Student student = new Student();
//                student.inputData(scanner);
//
//                    break;
//
//                case 5:
//                    flag = true;
//                    System.out.println("Program Stopped");
//
//                    break;
//                default:
//                    System.out.println("Your options is not exits");
//                    break;
//
//            }
//            if(flag) {
//                break;
//            }
//
//        }

        //-----------BAI TAP EMPLOYEE MANAGEMENT------------
//        EmployeeManagement employeeManagement = new EmployeeManagement();
//        EmployeeManagement employeeManagement1 = new EmployeeManagement();
//        EmployeeManagement employeeManagement2 = new EmployeeManagement();
//
//        employeeManagement.inputData(scanner);
//        employeeManagement1.inputData(scanner);
//        employeeManagement2.inputData(scanner);
//
//        employeeManagement.calSalary();
//        employeeManagement1.calSalary();
//        employeeManagement2.calSalary();
//
//        employeeManagement.displayData();
//        employeeManagement1.displayData();
//        employeeManagement2.displayData();
        //-----------BAI TAP Edit Private------------
//        EditPrivate editPrivate = new EditPrivate("hello String");
//
//
//        System.out.println(   editPrivate.getMySring());
//        System.out.println("New value ");
//        editPrivate.setMySring("New value String");
//        System.out.println(editPrivate.getMySring());

        //-----------BAI TAP Build static method------------

//        BuildStaticMethod.calCircleArea(3.5);
//        BuildStaticMethod.calCircleArea(6);
//        BuildStaticMethod.calRectangleArea(2.5,6);
//        BuildStaticMethod.calRectangleArea(4,7);
//        BuildStaticMethod.calTriangleArea(3,4,5);
//        BuildStaticMethod.calTriangleArea(4.5,7,6);

        //-----------BAI TAP Build static method------------

//        AccessModifier accessModifier = new AccessModifier();
//        accessModifier.getRadius();
//        accessModifier.getAres();


        //ket qua la ko có gì thay đồi, vì non-static method mặc định
        //tạo ra là để ng khác truy cập vào

        //-----------BAI TAP ONLY WRITE METHOD------------
//        Test test = new Test();
//        test.setClasses("hello");
//        test.setName("ddemoo");
        //thay đổi access modifier sẽ lỗi vì mặc định getter setter
        //dc tạo ra là để ng khác truy cập vào, nếu private thì có khác gì thuộc tính?


    }
}