package examclouds.lesson10.tasks.phone;

import java.util.Arrays;


public class Phone {
    private String number;
    private String model;
    private double weight;
    static int count = 0;

    //Конструкторы
    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        count++;
    }

    public Phone() {
        count++;
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
    static int getCount(){
        return count;
    }

    //Методы


    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Calling " + name + " with number " + number);
        System.out.println("My number " + this.number);
    }


    void sendMessage(String message, String... numbers) {
        System.out.println("Message " + message + " is sending to: " + Arrays.toString(numbers));
    }
}
