package examclouds.lesson9.part16.figure;

public class FindAreas {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Figure(10, 10);
        figures[1] = new Rectangle(10, 10);
        figures[2] = new Triangle(10, 10);
        figures[3] = new Triangle(100, 90);
        for (Figure figure : figures) {
            System.out.println(figure.calculateArea());
        }
    }
}
