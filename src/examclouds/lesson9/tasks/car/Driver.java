package examclouds.lesson9.tasks.car;

class Driver {
    private String fullName; //полное имя
    private double drivingExperience; //стаж вождения

    public Driver(String fullName, double drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }
    @Override
    public String toString() {
        return "ФИО: " + fullName + ", стаж вождения: " + drivingExperience + " лет";
    }

}
