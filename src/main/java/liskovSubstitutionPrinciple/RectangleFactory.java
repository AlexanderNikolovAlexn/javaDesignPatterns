package liskovSubstitutionPrinciple;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class RectangleFactory {

    public static Rectangle newRectangle(int width, int height) {
        return new Rectangle(width, height);
    }

    public static Rectangle newSquare(int side) {
        return new Rectangle(side, side);
    }

}
