package data;
import java.util.ArrayList;
import java.util.List;
public class Course {
    private String courseName;
    private int classroom;
    private List<Student> studentList;
    private class Teacher{ }

    public Course(String courseName, int classroom) {
        this.courseName = courseName;
        this.classroom = classroom;
        this.studentList = new ArrayList<>();
    }
}
