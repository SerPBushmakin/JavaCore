package examclouds.lesson9.tasks.car;

class Car {
    private String brand;
    private String carClass;
    private String weight;
    private Engine engine;
    private Driver driver;

    public Car(String brand, String carClass, String weight, Engine engine, Driver driver) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

        @Override
    public String toString() {
            return "Марка: " + brand + ", Класс: " + carClass + ", Вес: " + weight + " кг\n" +
                    "Водитель: [" + driver.toString() + "]\n" +
                    "Двигатель: [" + engine.toString() + "]";
        }

}
