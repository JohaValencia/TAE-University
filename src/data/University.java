package data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    private String name;
    private List<Course> courseList;
    private List<Teacher> teacherList;

    private List<Student> studentList;
    private List<University> memberList;

    public University(String name) {
        this.name = name;
        this.teacherList = new ArrayList<>();
        this.courseList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        this.memberList = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    /**
     * Methods to order Course in a list, take its index and id
     * @return
     */
    public List<Course> getCourseList() {
        return courseList;
    }

    public Course getCourseByIndex(int index) {
        return courseList.get(index);
    }

    public Course getCourseById(int id){
        for (int i = 0; i < courseList.size(); i++){
            Course courseById = courseList.get(i);
            if(courseById.getCourseId() == id) {
                return courseById;
            }
        }
        return null;
    }

    /**
     * Methods to order Teacher in a list, take its index and id
     * @return
     */

    public Teacher getTeacherByIndex(int index) {
        return teacherList.get(index);
    }

    public Teacher getTeacherById(int id){
        for (int i = 0; i < teacherList.size(); i++){
            Teacher teacherById = teacherList.get(i);
            if(teacherById.getTeacherId() == id) {
                return teacherById;
            }
        }
        return null;
    }

    /**
     * Methods to order Student in a list, take its index and id
     * @return
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    public Student getStudentByIndex(int index){
        return studentList.get(index);
    }

    public Student getStudentById(int id) {
        for (int i = 0; i < studentList.size(); i++){
            Student studentById = studentList.get(i);
            if(studentById.getStudentId() == id){
                return studentById;
            }

        }
        return null;
    }

    /**
     * Methods to create new teacher, course and student and to add to each list
     * @param university
     */
    public void addMember(University university) {
        this.memberList.add(university);
    }

    public void admittedTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public void admittedCourse(Course course) {
        this.courseList.add(course);
    }

    public void admittedStudent(Student student) {
        this.studentList.add(student);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
}
