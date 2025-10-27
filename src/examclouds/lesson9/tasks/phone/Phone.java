package examclouds.lesson9.tasks.phone;

import java.util.Arrays;

//Конструкторы
public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    // Геттеры и Сеттеры
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Методы
    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Calling " + name + " with number " + number);
        System.out.println("My number " + this.number);
    }


    void sendMessge(String message, String... numbers) {
        System.out.println("Message " + message + " is sending to: " + Arrays.toString(numbers));
    }
}
