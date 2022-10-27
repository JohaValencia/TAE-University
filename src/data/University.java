package data;
import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Course> courseList;
    private List<Teacher> teacherList;
    private List<Student> studentList;

    public University(String name) {
        this.name = name;
        this.teacherList = new ArrayList<>();
        this.courseList = new ArrayList<>();
        this.studentList = new ArrayList<>();

    }

    public void admittedTeacher (Teacher teacher){
        this.teacherList.add(teacher);
    }
    public void admittedCourse (Course course) {
        this.courseList.add(course);
    }
    public void admittedStudent (Student student) {
        this.studentList.add(student);
    }
}
