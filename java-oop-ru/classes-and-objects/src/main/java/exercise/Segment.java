package exercise;
import exercise.Point;

// BEGIN
public class Segment {
    private Point point1;
    private Point point2;

    public Point getBeginPoint() {
        return point1;
    }

    public Point getEndPoint() {
        return point2;
    }
    public Point getMidPoint() {
        return new Point (((point1.getX()) + (point2.getX()) / 2), ((point2.getY()) + (point2.getY()) / 2));
    }

    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
}
// END
