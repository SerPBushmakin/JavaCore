package examclouds.lesson9.tasks.shape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("red",12,23,45);
        shapes[1] = new Circle("green",122,23,45);
        shapes[2] = new Rectangle("blue",122,23,45,45);
        shapes[3] = new Rectangle("brown",122,23,45,45);

        for (Shape shape: shapes){
            shape.draw();
        }

    }
}
