package solid.v3;

import lombok.AllArgsConstructor;
import solid.BeakType;


public abstract class FlyableBird extends Bird{

    public FlyableBird(Double weight, String color,String type,String size, BeakType beakType) {
        super(weight,color,type,size,beakType);
    }

    public abstract void fly();

}
