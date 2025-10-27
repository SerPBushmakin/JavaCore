package examclouds.lesson9.tasks.aspirant;

public class Aspirant extends Student{
    String scienceWork;

    public Aspirant(double awgMark, String group, String lastName, String firstName, String work) {
        super(awgMark, group, lastName, firstName);
        this.scienceWork = work;
    }

    Aspirant (String scienceWork){
        this.scienceWork = scienceWork;
    }

    @Override
    public double getScholarship() {
        if (getAwgMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public static void main(String[] args) {
        Student student = new Student(4.5, "Group1",
                "Иванов", "Иван");
        Aspirant aspirant1 = new Aspirant(5, "Group2",
                "Петров", "Петр", "Work1");
        Student aspirant2 = new Aspirant(4.6, "Group3",
                "Петрова", "Петра", "Work1");
        Student[] students = {student, aspirant1, aspirant2};
        for (Student s: students){
            System.out.println(s.getLastName() +" " + s.getScholarship());
        }
    }



}
