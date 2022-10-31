package data;

public class Teacher {
    protected int teacherId;
   protected String teacherName;
    protected double baseSalary;

    public Teacher(){

    }

    public Teacher (int teacherId, String teacherName, double baseSalary){
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.baseSalary = baseSalary;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    @Override
    public String toString() {
        return "Teacher Id: " + this.teacherId +
                " Teacher Name: " + this.teacherName +
                " Base salary: $" + this.baseSalary;
    }
}