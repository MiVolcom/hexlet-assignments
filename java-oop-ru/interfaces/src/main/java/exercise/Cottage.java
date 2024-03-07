package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;


    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
    public double getArea() {
        return this.area;
    }
    public int getFloorCount() {
        return this.floorCount;
    }
    public int compareTo(Home another) {
        if (this.area > another.getArea()) {
            return 1;
        } else if (this.area < another.getArea()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\" " + floorCount + " этажный коттедж площадью " + area + " метров" + " \"";
    }
}
// END
