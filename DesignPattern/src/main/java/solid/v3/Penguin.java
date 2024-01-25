package solid.v3;

import solid.BeakType;

public class Penguin extends NonFlyableBird{


    public Penguin(double weight, String color, String type, String size, BeakType beakType){
        super(weight,color,type,size,beakType);
    }

    @Override
    public void makeSound() {
        System.out.println("penguin speaking!!!!!!!!");
    }
}
