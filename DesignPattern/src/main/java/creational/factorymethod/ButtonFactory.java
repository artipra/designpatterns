package creational.factorymethod;

import creational.simplefactory.Button;
import creational.simplefactory.RoundButton;
import creational.simplefactory.SquareButton;

public interface ButtonFactory {
// step 3 factory interface
     Button createButton(double border, double radius, double length);

}
