package liskovSubstitutionPrinciple;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class LSPDemo {

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);

        // Problem is we break the behaviour for derived classes
        Rectangle sq = new Square(5);
        useIt(sq);

        // One solution would be not to use Square class at all and make Factory pattern to solve this problem
        Rectangle rcNew = RectangleFactory.newRectangle(2, 3);
        useIt(rcNew);

        Rectangle sqNew = RectangleFactory.newSquare(5);
        useIt(sqNew);
    }

    static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);
        System.out.println("Expected area of " + (width*10) + ", got " + rectangle.getArea());
    }

}
