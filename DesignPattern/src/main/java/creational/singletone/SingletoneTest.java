package creational.singletone;

public class SingletoneTest {


    public static void main(String[] args) {

        Runnable runnable = () ->  {
            for(int i =0; i<50; i++){
                System.out.println(Singletone.getInstance().hashCode() +" "+Thread.currentThread().getName());
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);
        t1.start();t2.start();
        t3.start();t4.start();

        Singletone s1 = Singletone.getInstance();
        Singletone s2 = Singletone.getInstance();
        Singletone s3 = Singletone.getInstance();
        Singletone s4 = Singletone.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
