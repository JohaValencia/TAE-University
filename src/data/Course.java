package data;
import java.util.ArrayList;
import java.util.List;

/**This class manage the course to the university,
 * with the attributes to create a new course
 * and the methods
 *
 */
public class Course {
    private String courseName;
    private int courseId;
    private int classroom;
    private List<Student> studentList;

    private Teacher teacher;

    /**
     * This the constructor
     * @param courseName
     * @param classroom
     */
    public Course(int courseId, String courseName, int classroom) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.classroom = classroom;
        this.studentList = new ArrayList<>();
        this.teacher = new Teacher();
    }

    /**
     * Methods
     * @return
     */
    public String getCourseName() {
        return courseName;
    }

    public int getClassroom() {
        return classroom;
    }

    public int getCourseId() {
        return courseId;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public String getStudentsAtCourse(){
        String studentsAtCourse = "";

        if(this.studentList.size() == 0) {
            studentsAtCourse = "No students registered in " + this.courseName;
        }
        for (Student student : this.studentList) {
            studentsAtCourse += " Student Id: " + student.getStudentId() + "Student Name: " + student.getStudentName();

        }
        return studentsAtCourse;
    }

    @Override
    public String toString() {
        return "Course Id: " + this.courseId + " Course: " + this.courseName + " Classroom: " + this.classroom;
    }

    public  String addStudentAtCourse(Student student) {
        String addStudentToCourseList = " Student Id: " + student.getStudentId() + " Register to " + this.courseName + " Course";

        if(!this.studentList.contains(student)) {
            this.studentList.add(student);
            addStudentToCourseList = " Student Id: " + student.getStudentId() + "Student Name: " + student.getStudentName();
        }
        return addStudentToCourseList;

    }

    public void addTeacherAtCourse (Teacher teacher) {
        String addTeacherToCourseList = "Teacher Id: " + teacher.getTeacherId() + "Register to " + this.courseName + " Course";
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
