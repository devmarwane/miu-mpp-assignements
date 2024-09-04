package prob2A;

public class GradeReport {
    private Student student;
    private String grade;

    GradeReport(Student student){
        this.student = student;
    }

    void setGrade(String grade) {
        this.grade = grade;
    }

    String getGrade() {
        return this.grade;
    }

    Student getStudent() {
        return this.student;
    }

    @Override
    public String toString() {
        return "this grade '"+this.grade+"'belongs to the student "+student.getName();
    }
}
