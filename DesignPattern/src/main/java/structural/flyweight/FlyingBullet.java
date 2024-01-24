package structural.flyweight;

import lombok.AllArgsConstructor;

//step 2 Extrinsic state
@AllArgsConstructor
public class FlyingBullet {

    private double x;
    private double y;
    private double z;
    private double direction;
    // step 3 add a has a relationship
    private Bullet bullet;
}
