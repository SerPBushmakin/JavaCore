package examclouds.lesson9.tasks.phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89048369566", "Apple", 8.7);
        Phone phone2 = new Phone("89123452611", "Samsung");
        Phone phone3 = new Phone();
        VarArgs varArgs1 = new VarArgs();

        phone3.setModel("Nokia");
        phone3.setNumber("89673451290");
        phone3.setWeight(12);

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        System.out.println();

        System.out.println("Номер телефона: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.getModel());
        System.out.println("Вес: " + phone3.getWeight());
        System.out.println();

        phone1.receiveCall("Мама");
        phone2.receiveCall("Наташа");
        phone2.receiveCall("Катя", "89073426132");

        varArgs1.test(new int[12]);

        phone1.sendMessge("Message1", "256498", "0985432");
        phone2.sendMessge("Message2", "89048369566");

    }
}
