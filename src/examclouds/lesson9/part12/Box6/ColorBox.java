package examclouds.lesson9.part12.Box6;

public class ColorBox extends Box6{
    String color;

    public ColorBox(int height, int depth, int width, String color) {
        super(height, depth, width);
        this.color = color;
    }

    public ColorBox() {
        super();
    }
}
