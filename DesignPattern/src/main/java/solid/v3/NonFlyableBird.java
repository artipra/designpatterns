package solid.v3;

import solid.BeakType;

public abstract class NonFlyableBird extends Bird{

    public NonFlyableBird(Double weight, String color,String type,String size, BeakType beakType) {
        super(weight,color,type,size,beakType);
    }


}
