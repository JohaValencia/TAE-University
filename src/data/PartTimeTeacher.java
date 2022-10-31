package data;

public abstract class PartTimeTeacher extends Teacher {
    private Integer activeHoursPerMonth;

    public PartTimeTeacher(int teacherId, String teacherName, double baseSalary){
        super(teacherId, teacherName, baseSalary);
        this.activeHoursPerMonth = activeHoursPerMonth;
    }

    public double salaryCalculated(){
        return ((super.baseSalary / 192) * (this.activeHoursPerMonth));
    }
}
