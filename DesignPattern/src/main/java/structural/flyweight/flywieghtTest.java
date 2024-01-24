package structural.flyweight;

public class flywieghtTest {


    public static void main(String[] args) {
      BulletRegistry registry = new BulletRegistry();
     Bullet bullet9MM = new Bullet("IMAGE",BulletType.NINEMM);
     Bullet bullet11MM = new Bullet("IMAGE",BulletType.ELEVENMM);
     registry.addBullet(bullet9MM);registry.addBullet(bullet11MM);

     FlyingBullet bullet1 = new FlyingBullet(1.2,2.0,6.3,5.0,registry.getBullet(BulletType.NINEMM));
     FlyingBullet bullet2 = new FlyingBullet(1.0,-1.0,6.8,9.0,registry.getBullet(BulletType.ELEVENMM));


    }
}
