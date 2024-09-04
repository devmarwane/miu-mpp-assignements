package prob2A;

public class Student {
    private String name;
    private GradeReport gradeReport;

    public Student(String name) {
        this.name = name;
        this.gradeReport = new GradeReport(this);
    }

    public String getName() {
        return this.name;
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }

    public void setGradeReport(String grade) {
        this.gradeReport.setGrade(grade);
    }

    @Override
    public String toString() {
        return "Student: "+this.name+" | grade : "+this.gradeReport.getGrade();
    }
}
