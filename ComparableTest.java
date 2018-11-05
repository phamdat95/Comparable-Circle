import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6, "Blue");
        circles[1] = new ComparableCircle(4.3, "Red");
        circles[2] = new ComparableCircle(3.5, "Indigo");

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle.getPerimeter());
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle.getPerimeter());
        }
    }
}
