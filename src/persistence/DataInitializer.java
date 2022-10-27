package persistence;
import data.Course;
import data.Student;
import data.Teacher;
import data.University;

public class DataInitializer {
    public static University loadUniversity() {
        University myUniversity = new University("TAE University");
        loadTeachersIntoUniversity(myUniversity);
        loadStudentsIntoUniversity(myUniversity);
        loadCoursesIntoUniversity(myUniversity);
        return myUniversity;
    }

    private static void loadTeachersIntoUniversity(University university) {
        Teacher teacher1 = new Teacher(01, "Felipe Jímenez", 250000);
        Teacher teacher2 = new Teacher(02, "Juan Castiblanco", 250000);
        Teacher teacher3 = new Teacher(03, "Lucho Bermudez", 250000);
        Teacher teacher4= new Teacher(04, "Tito Puentes", 250000);
        university.admittedTeacher(teacher1);
        university.admittedTeacher(teacher2);
        university.admittedTeacher(teacher3);
        university.admittedTeacher(teacher4);
    }

    private static void loadCoursesIntoUniversity(University university) {
        Course course1 = new Course("Math", 501);
        Course course2 = new Course("Java", 101);
        Course course3 = new Course("Quality", 202);
        Course course4 = new Course("Automation", 301);
        university.admittedCourse(course1);
        university.admittedCourse(course2);
        university.admittedCourse(course3);
        university.admittedCourse(course4);
    }

    private static void loadStudentsIntoUniversity(University university) {
        Student  student1 = new Student(0001, "Jordan", 28);
        Student  student2 = new Student(0002, "Marge", 32);
        Student  student3 = new Student(0003, "Jhon", 37);
        Student  student4 = new Student(0004, "Laura", 29);
        Student  student5 = new Student(0005, "Emilio", 25);
        Student  student6 = new Student(0006, "María", 27);
        university.admittedStudent(student1);
        university.admittedStudent(student2);
        university.admittedStudent(student3);
        university.admittedStudent(student4);
        university.admittedStudent(student5);
        university.admittedStudent(student6);

    }



}
