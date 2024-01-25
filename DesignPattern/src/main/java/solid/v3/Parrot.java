package solid.v3;

import solid.BeakType;
import solid.v2.Bird;

public class Parrot extends FlyableBird {

    public Parrot(double weight, String color, String type, String size, BeakType beakType){
        super(weight,color,type,size,beakType);
    }
    @Override
    public void fly() {
        System.out.println("parrot is flying!!!!");
    }


    @Override
    public void makeSound() {
        System.out.println("parrot speaking !!!");
    }

}
