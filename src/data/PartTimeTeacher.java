package data;

public class PartTimeTeacher extends Teacher {
    private Integer activeHoursPerMonth;

    /**
     * Method to calculate the part-time teacher salary
     * @param teacherId
     * @param teacherName
     * @param baseSalary
     */
    public PartTimeTeacher(int teacherId, String teacherName, double baseSalary, Integer activeHoursPerMonth){
        super(teacherId, teacherName, baseSalary);
        this.activeHoursPerMonth = activeHoursPerMonth;
    }

    public double salaryCalculated(){
        return ((super.baseSalary / 192) * (this.activeHoursPerMonth));
    }

    @Override
    public String toString() {
        return "Teacher Id: " + super.teacherId +
                " Part-Time teacher " +
                "Teacher name: " + super.teacherName +
                " Base salary: " + super.baseSalary +
                " Salary per month: $" + this.salaryCalculated();
    }
}
