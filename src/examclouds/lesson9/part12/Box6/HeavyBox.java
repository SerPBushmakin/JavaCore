package examclouds.lesson9.part12.Box6;

public class HeavyBox extends Box6 {
    int weight;

    public HeavyBox(double height, double depth, double width, int weight) {
        super(height, depth, width);
        this.weight = weight;
    }

    public HeavyBox() {
        super();
    }
}
