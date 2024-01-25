package solid.v2;

import solid.BeakType;

public class Parrot extends Bird{

    public Parrot(double weight, String color, String type, String size, BeakType beakType){
        super(weight,color,type,size,beakType);
    }
    @Override
    public void fly() {
        System.out.println("parrot is flying!!!!");
    }
}
