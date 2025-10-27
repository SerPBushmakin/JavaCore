package examclouds.lesson9.part12.Box6;

public class DifferentBoxExample1 {
    public static void main(String[] args) {
        Box6 box = new Box6(15,10,25);
        HeavyBox heavyBox = new HeavyBox(15,10,20,5);
        ColorBox colorBox = new ColorBox(25,12,20,"red");

        System.out.println("Объем коробки: " + box.getVolume());
        System.out.println("Объем коробки: " + heavyBox.getVolume() + " Вес коробки: " + heavyBox.weight);
        System.out.println("Объем коробки: " + colorBox.getVolume() + " Цвет коробки: " + colorBox.color);
    }
}
