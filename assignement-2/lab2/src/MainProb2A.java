import prob2A.Student;

public class MainProb2A {
    public static void main(String[] args) {
        Student std =new Student("Marwan");
        std.setGradeReport("B");

        Student std2 =new Student("Luisa");
        std2.setGradeReport("A");

        System.out.println(std);
        System.out.println(std2);

        System.out.println(std.getGradeReport());

    }
}