package structural.flyweight;

import java.util.HashMap;

public class BulletRegistry {

    HashMap<BulletType,Bullet> registry = new HashMap<>();
   public void addBullet(Bullet bullet){
        registry.put(BulletType.NINEMM,bullet);
    }

    public Bullet getBullet(BulletType type){
       return registry.get(type);
    }
}
