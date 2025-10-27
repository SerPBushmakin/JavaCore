package examclouds.lesson9.part12.Box6;

public class Box6 {
    double width;
    double height;
    double depth;

    public Box6(double height, double depth, double width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    public Box6() {
    }

    double getVolume(){
        return  width * height * depth;
    }
}


