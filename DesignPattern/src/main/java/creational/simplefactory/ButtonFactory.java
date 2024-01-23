package creational.simplefactory;

public class ButtonFactory {
// step 3 factory static method
    public static Button createButton(ButtonType type,double border,double radius,double length) {
        switch(type) {
            case ROUND:
                return new RoundButton(border, border);
            case SQUARE:
                return new SquareButton(border, length);
        }
        throw new IllegalArgumentException("Invalid type "+type);
    }
}
