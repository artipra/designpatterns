package creational.abstractfactory;


public interface ThemeFactory {
// step 3 factory interface
     Button createButton(double border, double radius, double length);

     Radio createRadio(double border);

}
