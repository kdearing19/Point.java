public class Main {
    public static void main(String[] args) {
        Point p0 = new Point();
        Point p1 = new Point(7, 2);
        Point p2 = new Point (4, 3);

        System.out.println(" The sum of the Points' x components is " + (p0.getX() + p1.getX() + p2.getX()));

        p0.setX(p0.getX() * 10);
        p1.setX(p1.getX() *10);
        p2.setX(p2.getX() * 10);

        p0.setY(p0.getY() * -10);
        p1.setY(p1.getY() * -10);
        p2.setY(p2.getY() * -10);

        System.out.println("New Coordinates: ");
        System.out.println("Point 0: " + p0);
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        System.out.println("Distance from origin for each point: ");
        System.out.println("Point 0 distance: " + p0.distanceFromOrigin());
        System.out.println("Point 1 distance: " + p1.distanceFromOrigin());
        System.out.println("Point 2 distance: " + p2.distanceFromOrigin());

    }
}