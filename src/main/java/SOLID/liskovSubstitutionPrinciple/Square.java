package SOLID.liskovSubstitutionPrinciple;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class Square extends Rectangle {

    public Square() {
    }

    public Square(int side) {
        super.width = side;
        super.height = side;
    }

    @Override
    public void setWidth(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setHeight(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
}
