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
        for (byte i = 0; i < studentArr.length; i++) {
            System.out.printf("Thông tin sinh viên thứ %d \n" +
                    "Student ID  %s\n " +
                    "Student Name %s \n" +
                    "Student Age %d \n" +
                    "Student gender %b \n" +
                    "Student Average Score %f \n ",
                    i + 1,
                    studentArr[i].getStudentId(),
                    studentArr[i].getStudentName(),
                    studentArr[i].getAge(),
                    studentArr[i].getGender(),
                    studentArr[i].getAverageScore()
                    );
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

        System.out.println("input student gender");
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
        byte deleteIndex = Byte.parseByte(scanner.nextLine());
        byte lengOfArray = (byte) studentArr.length;

        Student[] newArr = new Student[lengOfArray - 1];

        Student student;
        byte currentIndex = 0;
        while(deleteIndex > lengOfArray || deleteIndex < 0){
            System.out.println("Your input index out of range!, please input again");
            deleteIndex = Byte.parseByte(scanner.nextLine());
        }

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

    //nhap vao vi tri can cap nhat
//    Student updateStudent = new Student();
    // neu vi trí đó vượt quá lengthOfArray, cho user nhập lại
    //quet mang do, if i == index -1, {
    //

    // }
    public void updateStudent(Scanner scanner){
        System.out.println("input index you want to update");
        byte updateIndex = Byte.parseByte(scanner.nextLine());
        byte lengOfArray = (byte) studentArr.length;
        Student[] newArr = new Student[lengOfArray];
        Student studentUpdate = new Student();


        while(updateIndex > lengOfArray || updateIndex < 0){
            System.out.println("Your input index out of range!, please input again");
            updateIndex = Byte.parseByte(scanner.nextLine());
        }

        for (byte i = 0; i < lengOfArray; i++) {
            if(updateIndex == i){
                System.out.println("please input student Name want to update");
                studentUpdate.setStudentName(scanner.nextLine());
                System.out.println("please input student average score want to update");
                studentUpdate.setAverageScore(Float.parseFloat(scanner.nextLine()));
                System.out.println("please input student age want to update");
                studentUpdate.setAge(Byte.parseByte(scanner.nextLine()));
                System.out.println("please input student gender want to update");
                studentUpdate.setGender(Boolean.parseBoolean(scanner.nextLine()));
            }
            newArr[i] =studentUpdate;
        }

        studentArr = newArr;
    }

}
