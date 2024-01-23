package creational.abstractfactory;

import creational.abstractfactory.Button;

// step 2 create product concrete class
public class DarkButton extends Button {

   private double radius;
   private double border;

    public DarkButton(Double border, double radius) {
        super(border);
        this.radius = radius;
    }


    @Override
    public void render() {
        System.out.println("dark round rendered");
    }

    @Override
    public void onClick() {
        System.out.println("dark round click");
    }
}
