import java.util.Scanner;

public class EmployeeManagement {

    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private float rate;
    private double salary;

    public EmployeeManagement() {
    }

    public EmployeeManagement(String employeeId, String employeeName, int age, boolean gen, float rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData(Scanner scanner){
        System.out.println("Input EmployeeID");
        this.employeeId = scanner.nextLine();
        System.out.println("Input Employee Name");
        this.employeeName = scanner.nextLine();
        System.out.println("Input Employee Age");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Employee Gen");
        this.gen = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Input Employee rate");
        this.rate = Float.parseFloat(scanner.nextLine());

    }

    public void displayData(){
        System.out.printf("Thông tin employee: \n" +
                "Employee id: %s" +
                "Employee Name: %s" +
                "Employee age: %d" +
                        "Employee gen: %b" +"Employee salary: %d" +
                "Employee rate: %f",
                this.employeeId,
                this.employeeName,
                this.age,
                this.salary,
                this.gen,
                this.rate
                );
    }

    public void calSalary(){
        this.salary = this.rate * 1300000;
        System.out.println("Salary is: " + this.salary);
    }
}
