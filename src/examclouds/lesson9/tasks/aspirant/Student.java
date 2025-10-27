package examclouds.lesson9.tasks.aspirant;

public class Student {
    private String firstName, lastName, group;
    private double awgMark;

    public Student(double awgMark, String group, String lastName, String firstName) {
        this.awgMark = awgMark;
        this.group = group;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAwgMark() {
        return awgMark;
    }

    public void setAwgMark(double awgMark) {
        this.awgMark = awgMark;
    }

    public double getScholarship() {
        if (awgMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }


}
