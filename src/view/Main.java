package view;
import com.intellij.testFramework.TeamCityLogger;
import data.Course;
import data.Student;
import data.Teacher;
import data.University;
import persistence.DataInitializer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University myUniversity = DataInitializer.loadUniversity();
        Scanner scan = new Scanner(System.in);
        int exitOption = 0;
        while (exitOption != 9) {
            System.out.println("Bienvenidx a " + myUniversity.getName());

            System.out.println("A continuación las opciones para ejecutar el programa: \n" +
                    "Elija 1 para conocer la lista de profesores \n" +
                    "Seleccione 2 para conocer la lista de estudiantes \n" +
                    "Seleccione 3 para ver los cursos disponibles en la universidad \n" +
                    "Seleccione 4 para registrar un nuevo estudiante \n" +
                    "Seleccione 5 para registrar un nuevo curso\n" +
                    "Seleccione 6 para asignar estudiantes a un curso\n" +
                    "Seleccione 7 para asignar un profesor al curso\n" +
                    "Selecciona 8 para ver toda la información de un cursos seleccionado\n" +
                    "Seleccione 9 para salir");
            String option = scan.nextLine();
            scan = new Scanner(System.in);
            switch (option) {
                case "1":
                    printTeacherList(myUniversity);
                    break;
                case "2":
                    printStudentList(myUniversity);
                    break;
                case "3":
                    printCourseList(myUniversity);
                    break;
                case "4":
                    System.out.println("Ingrese un Id válido para el nuevo");
                    int studentId = scan.nextInt();
                    System.out.println("Ingrese un nombre");
                    String studentName = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese la edad del estudiante");
                    int studentAge = scan.nextInt();
                    var newStudent = new Student(studentId, studentName, studentAge);
                    myUniversity.admittedStudent(newStudent);
                    System.out.println("El estudiante ha sido creado exitosamente");
                    break;
                case "5":
                    System.out.println("Ingrese un Id válido para el nuevo curso");
                    int courseId = scan.nextInt();
                    System.out.println("Ingrese el nombre del curso");
                    String courseName = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese el aula donde se dictará el curso");
                    int classroom = scan.nextInt();
                    var newCourse = new Course(courseId, courseName, classroom);
                    myUniversity.admittedCourse(newCourse);
                    System.out.println("El curso se ha creado exitosamente");
                    break;
                case "6":
                    System.out.println("Ingrese el Id del estudiante que quiere agregar al curso");
                    int studentAdd = scan.nextInt();
                    Student studentInCourse = myUniversity.getStudentById(studentAdd);
                    System.out.println("Seleccione el Id del curso al que desea vincular el estudiante");
                    int studentAddCourse = scan.nextInt();
                    Course courseWithStudent = myUniversity.getCourseById(studentAddCourse);
                    courseWithStudent.addStudentAtCourse(studentInCourse);
                case "7":
                    System.out.println("Ingrese el Id del profesor que desea vincular al curso");
                    int teacherAdd = scan.nextInt();
                    Teacher teacherInCourse = myUniversity.getTeacherById(teacherAdd);
                    System.out.println("Seleccione el Id de curso al que desea vincular el profesor");
                    int teacherAddCourse = scan.nextInt();
                    Course courseWithTeacher = myUniversity.getCourseById(teacherAddCourse);
                    courseWithTeacher.addTeacherAtCourse(teacherInCourse);
                case "8":
                    System.out.println("Ingrese el Id del curso que desea revisar");
                    int idCourse = scan.nextInt();
                    Course courseById = myUniversity.getCourseById(idCourse);
                    System.out.println("Id del curso: " + courseById.getCourseId() +
                            "\n Nombre del curso: " + courseById.getCourseName() +
                            "\n Información del profesor: " + courseById.getTeacher() +
                            "\n Estudiantes del curso: " + courseById.getStudentsAtCourse());

                case "9":
                    System.out.println("Ha cerrado sesión");

            }
        }

    }

    /**
     * Methods to show all courses, students and teachers in each order list
     * @param university
     */
    public static void printCourseList(University university){
        if(university.getCourseList() == null){
            System.out.println("No hay información de cursos registrados");
        } else {
            for (int i = 0; i < university.getCourseList().size(); i++){
                System.out.println(university.getCourseByIndex(i));
            }
        }
    }
    public static void printStudentList(University university){
        if(university.getStudentList() == null){
            System.out.println("No hay estudiantes registrados");
        } else {
            for (int i = 0; i < university.getStudentList().size(); i++){
                System.out.println(university.getStudentByIndex(i));
            }
        }
    }
    public static void printTeacherList(University university){
        if(university.getTeacherList() == null){
            System.out.println("No hay profesores registrados");
        } else {
            for(int i = 0; i < university.getTeacherList().size(); i++){
                System.out.println(university.getTeacherByIndex(i));
            }
        }



    }
}