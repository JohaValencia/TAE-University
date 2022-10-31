package data;

public class Student {
    private int studentId;
    private String studentName;
    private int age;

    public Student(int studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student Id: " + this.studentId + " Name: " + this.studentName + " Age: " + this.age;
    }
}
