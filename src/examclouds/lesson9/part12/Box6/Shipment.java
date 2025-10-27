package examclouds.lesson9.part12.Box6;

public class Shipment extends HeavyBox {
    public double cost;

    public Shipment(double height, double depth, double width, int weight, double cost) {
        super(height, depth, width, weight);
        this.cost = cost;
    }

    public Shipment(double cost) {
        this.cost = cost;
    }

    public Shipment() {
    }

}
