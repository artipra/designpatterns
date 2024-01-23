package creational.simplefactory;

// step 2 create product concrete class
public class RoundButton extends Button{

   private double radius;
   private double border;

    public RoundButton(Double border,double radius) {
        super(border);
        this.radius = radius;
    }


    @Override
    public void render() {
        System.out.println("round rendered");
    }

    @Override
    public void onClick() {
        System.out.println("round click");
    }
}
