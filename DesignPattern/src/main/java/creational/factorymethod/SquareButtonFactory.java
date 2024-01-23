package creational.factorymethod;

import creational.simplefactory.Button;
import creational.simplefactory.RoundButton;
import creational.simplefactory.SquareButton;

public class SquareButtonFactory implements ButtonFactory {

    public Button createButton(double border, double radius,double length) {
         return new SquareButton(border, length);
    }

}
