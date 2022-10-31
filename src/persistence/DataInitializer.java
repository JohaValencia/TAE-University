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
        Teacher teacher1 = new Teacher(123, "Felipe Jímenez", 250000);
        Teacher teacher2 = new Teacher(456, "Juan Castiblanco",250000);
        Teacher teacher3 = new Teacher(789, "Lucho Bermudez", 250000);
        Teacher teacher4= new Teacher(101, "Tito Puentes", 250000);
        university.admittedTeacher(teacher1);
        university.admittedTeacher(teacher2);
        university.admittedTeacher(teacher3);
        university.admittedTeacher(teacher4);
    }

    private static void loadCoursesIntoUniversity(University university) {
        Course course1 = new Course(321, "Math", 501);
        Course course2 = new Course(231,"Java", 101);
        Course course3 = new Course(123,"Quality", 202);
        Course course4 = new Course(213,"Automation", 301);
        university.admittedCourse(course1);
        university.admittedCourse(course2);
        university.admittedCourse(course3);
        university.admittedCourse(course4);
    }

    private static void loadStudentsIntoUniversity(University university) {
        Student  student1 = new Student(112233, "Jordan", 28);
        Student  student2 = new Student(223344, "Marge", 32);
        Student  student3 = new Student(334455, "Jhon", 37);
        Student  student4 = new Student(445566, "Laura", 29);
        Student  student5 = new Student(556677, "Emilio", 25);
        Student  student6 = new Student(557766, "María", 27);
        university.admittedStudent(student1);
        university.admittedStudent(student2);
        university.admittedStudent(student3);
        university.admittedStudent(student4);
        university.admittedStudent(student5);
        university.admittedStudent(student6);

    }



}
