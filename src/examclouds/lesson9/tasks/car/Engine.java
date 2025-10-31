package examclouds.lesson9.tasks.car;

class Engine {
    private double power;
    private String manufacturer;

    public Engine(double power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Мощность: " + power + " л.с., Производитель: " + manufacturer;
    }
}
