public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    ComparableCircle(double radius, String color) {
        super(radius,color);
    }
    public int compareTo(ComparableCircle o) {
        if (getPerimeter() > o.getPerimeter()) return 1;
        else if (getPerimeter() < o.getPerimeter()) return -1;
        else return 1;
    }
}
