package creational.simplefactory;

// step 2 create product concrete class

public class SquareButton extends Button{


    private double length;
    private double border;

    public SquareButton(double border, double length){
        super(border);
        this.length = length;
    }

    @Override
    public void render() {
        System.out.println("square rendered !!!!");
    }

    @Override
    public void onClick() {
        System.out.println("square clicked ");
    }
}
