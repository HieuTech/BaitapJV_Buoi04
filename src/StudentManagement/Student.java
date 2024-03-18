package StudentManagement;

public class Student {
    private String studentId;
    private String studentName;
    private Boolean gender;
    private float averageScore ;
    private byte age ;

    public Student() {
    }

    public Student(String studentId, String studentName, Boolean gender, float averageScore, byte age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.averageScore = averageScore;
        this.age = age;
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
//        return String.format(" student id : %s \n" +
//                "student name:  " +
//                "student age " +
//                "student gender " +
//                "student average score ",
//                this.studentId, this.studentName,
//                this.age, this.gender,
//                this.averageScore
//                );
        return String.format( """
                student id: %s 
                student name: %s 
                student age: %d 
                student gender: %s 
                student average score: %f 
                """ ,
                this.studentId,
                this.studentName,
                this.age,
                this.gender ? "Male" : "Female",
                this.averageScore
                );
    }
}
