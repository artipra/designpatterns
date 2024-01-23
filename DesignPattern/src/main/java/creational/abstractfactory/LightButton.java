package creational.abstractfactory;

// step 2 create product concrete class

import creational.abstractfactory.Button;

public class LightButton extends Button {


    private double length;
    private double border;

    public LightButton(double border, double length){
        super(border);
        this.length = length;
    }

    @Override
    public void render() {
        System.out.println("light square rendered !!!!");
    }

    @Override
    public void onClick() {
        System.out.println("light square clicked ");
    }
}
