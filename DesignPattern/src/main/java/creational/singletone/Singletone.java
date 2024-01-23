package creational.singletone;

public class Singletone{
    private static Singletone instance= null;

    private Singletone(){}

    public static Singletone getInstance()
    {
        if(instance == null) instance = new Singletone();
        return instance;
    }

}

//Thread-safe version but not efficient, if instance is not null still a thread needs to wait
//-------------------------------------------------------------------------------------------

//public class Singletone{
//    private static Singletone instance = null;
//
//    private Singletone(){}
//
//    public static synchronized Singletone getInstance(){
//        if(instance == null){
//            instance = new Singletone();
//        }
//        return instance;
//    }
//}


//Thread-safe with double locking
// -------------------------------
//public class Singletone{
//    private static Singletone instance = null;
//
//    private Singletone(){};
//
//    public static Singletone getInstance(){
//        if(instance == null){
//            synchronized(Singletone.class){
//                if(instance == null){
//                    instance = new Singletone();
//                }
//            }
//        }
//        return instance;
//    }
//
//}

