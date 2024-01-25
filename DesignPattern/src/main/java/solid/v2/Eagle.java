package solid.v2;

import solid.BeakType;

public class Eagle extends Bird{

    public Eagle(double weight, String color, String type, String size, BeakType beakType){
        super(weight,color,type,size,beakType);
    }
    @Override
    public void fly() {
        System.out.println("eagle is flying!!!");
    }
}
