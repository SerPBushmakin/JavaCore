package examclouds.lesson9.tasks.car;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Касимов С.С", 34);
        Engine engine1 = new Engine(87, "АвтоВАЗ");
        Car car1 = new Car("ВАЗ2114", "седан","1100", engine1, driver1);

        System.out.println(car1.toString());
    }
}
