package creational.abstractfactory;



public class LightThemeFactory implements ThemeFactory {

    public Button createButton(double border, double radius,double length) {
         return new LightButton(border, radius);
    }

    @Override
    public Radio createRadio(double border) {
        return new LightRadio(border);
    }

}
