package designPatterns.creational.factory;

/**
 * Created by Alexander Nikolov on 9.2.2019 г..
 */
public class Point {

    private double x;
    private double y;

    // a bit ugly and not very useful, solution is to use factory Method
//    public Point(double a, double b, CoordinateSystem cs) {
//        switch (cs) {
//            case CARTESIAN:
//                this.x = a;
//                this.y = b;
//                break;
//            case POLAR:
//                this.x = a * Math.cos(b);
//                this.y = a * Math.sin(b);
//                break;
//        }
//    }


    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    public static Point newPolarPoint(double x, double y) {
        return new Point(x * Math.cos(y), x * Math.sin(y));
    }

    // Make Factory class
    public static class Factory {
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double x, double y) {
            return new Point(x * Math.cos(y), x * Math.sin(y));
        }
    }

}
