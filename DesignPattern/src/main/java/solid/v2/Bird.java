package solid.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import solid.BeakType;
@AllArgsConstructor
@Getter
public abstract class Bird {
     private double weight;
     private String color;
     private String type;
     private String size;
    private BeakType beakType;

     public abstract void fly();

}
