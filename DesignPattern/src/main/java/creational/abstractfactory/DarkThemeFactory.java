package creational.abstractfactory;


public class DarkThemeFactory implements ThemeFactory {

    public Button createButton(double border, double radius, double length) {
         return new DarkButton(border, radius);
    }

    @Override
    public Radio createRadio(double border) {
        return new DarkRadio(border);
    }

}
