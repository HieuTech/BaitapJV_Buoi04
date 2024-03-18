import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private String address;
    private String phoneNumber;
    private boolean sex;
    private int age;

    public Student(String studentId, String studentName, String address, String phoneNumber, boolean sex, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.age = age;
    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inputData(Scanner scanner){
        System.out.println("Please input studentId");
        this.studentId = scanner.nextLine();
        System.out.println("Please input studentName");
        this.studentName = scanner.nextLine();
        System.out.println("Please input phone number");
        this.phoneNumber = scanner.nextLine();
        System.out.println("Please input address");
        this.address = scanner.nextLine();
        System.out.println("Please input age");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input gender");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
    }
    public void displayData(){
        System.out.printf("Student info:　\n " +
                "student id: %s \n" +
                "student name: %s \n" +
                "student age: %d \n" +
                "student address: %s \n" +
                "student gender: %b \n" +
                "student phone number: %s \n",
                studentId, studentName,age, address,sex, phoneNumber
                );
    }

    public void displayAllStudent(){
        
        
    }
    
    public void addStudent(){


    }
}
