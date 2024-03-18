package StudentManagement;

import java.util.Scanner;

public class StudentManagement {
    private Student[] studentArr = new Student[0];

    public void addNew(Scanner scanner){

        // nhap so luong can them

        System.out.println("how many student you need to add? ");
        byte numberStudentAdd = Byte.parseByte(scanner.nextLine());

        // tao mang moi voi kich , old + new
        byte oldArrLength = (byte) studentArr.length;
        Student[] newArr = new Student[oldArrLength + numberStudentAdd];
        byte newArrLength = (byte) newArr.length;

        //di chuyen nhung phan tu o mang cu sang mang moi
        byte currentIndex = 0;
        for (int i = 0; i < oldArrLength; i++) {
            newArr[i] = studentArr[i];
            currentIndex ++;
        }

        // gan gia tri cho nhhung phan tu can them
        for (int i = 0; i < numberStudentAdd; i++) {
            newArr[currentIndex] = inputInfo(scanner);
            currentIndex ++;
        }

        studentArr = newArr;

    }

    public void displayAllStudent(){
        if(studentArr.length == 0){
            System.out.println("Your Array have no student, choosse another options");
        }
        for (byte i = 0; i < studentArr.length; i++) {
            System.out.printf(studentArr[i].toString());
            System.out.printf("--------------------------------");

        }
    }

    public Student inputInfo(Scanner scanner){
        Student addStudent = new Student();

        System.out.println("input student id");
        String studentId = scanner.nextLine();
        addStudent.setStudentId(studentId);

        System.out.println("input student name");
        String studentName = scanner.nextLine();
        addStudent.setStudentName(studentName);

        System.out.println("input student age");
        byte studentAge = Byte.parseByte(scanner.nextLine());
        addStudent.setAge(studentAge);

        System.out.println("input student gender, type false if youre female, " +
                "type true if youre male");
        boolean studentGender = Boolean.parseBoolean(scanner.nextLine());
        addStudent.setGender(studentGender);

        System.out.println("input student average score");
        float studentAverageScore = Float.parseFloat(scanner.nextLine());
        addStudent.setAverageScore(studentAverageScore);

        return addStudent;
    }

    //nhap vao vi tri can xoa
    //neu vi trí đó vượt quá lengthOfArray, cho user nhập lại
    //tạo 1 mảng mới có do dai = mảng cũ - 1, 1 biến currentIndex
    //quet mảng cũ, nếu vị trí quét == vị tri cần xóa, continous

    public void deleteStudent(Scanner scanner){
        System.out.println("input index you want to delete");
        byte lengOfArray = (byte) studentArr.length;
        Student[] newArr = new Student[lengOfArray - 1];
        Student student;
        byte currentIndex = 0;

        byte deleteIndex = isValid(lengOfArray, scanner) ;

        for (byte i = 0; i < lengOfArray; i++) {
            student = studentArr[i];
            if(i == deleteIndex){
                continue;
            }
            newArr[currentIndex] = student;
            currentIndex ++;
        }
        studentArr = newArr;
    }

    private byte isValid(byte lengOfArray, Scanner scanner){
        System.out.printf("Your index from 1 to %d ", lengOfArray );
        byte index = Byte.parseByte(scanner.nextLine());
        byte programIndex = (byte) (index - 1);
        while(programIndex  >= lengOfArray || index < 0){
            System.out.println("Your input index out of range!, please input again");
            programIndex = Byte.parseByte(scanner.nextLine());
        }

        return programIndex ;
    };




    //nhap vao vi tri can cap nhat
//    Student updateStudent = new Student();
    // neu vi trí đó vượt quá lengthOfArray, cho user nhập lại
    //quet mang do, if i == index -1, {
    //

    // }
    public void updateStudent(Scanner scanner){
        System.out.println("input index you want to update");
        byte lengOfArray = (byte) studentArr.length;
        byte updateIndex = isValid(lengOfArray, scanner);
        Student studentUpdate = inputInfo(scanner);

        for (byte i = 0; i < lengOfArray; i++) {

            if(updateIndex == i){
                studentArr[i] = studentUpdate ;
            }
        }

    }

}
