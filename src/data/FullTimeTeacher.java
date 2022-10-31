package data;

public abstract class FullTimeTeacher extends Teacher {
    private  Integer yearsOfExperience;

    public FullTimeTeacher(){

    }

    public FullTimeTeacher(int teacherId, String teacherName, double baseSalary){
        super(teacherId, teacherName, baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }

    public double salaryCalculated() {
        return (super.baseSalary * (this.yearsOfExperience * 1.1));
    }

    @Override
    public String toString() {
        return "Teacher Id: " + super.teacherId +
                " Full Time teacher " +
                "Teacher name: " + super.teacherName +
                " Base salary: " + super.baseSalary +
                " Salary per month: $" + this.salaryCalculated();
    }
}
