package creational.prototype;

import creational.prototype.User;
import creational.prototype.UserPrototypeRegistryImpl;
import creational.prototype.UserRole;

public class PrototypeTest {

    public static void main(String[] args) {
        User u1 = new User(32,"7895632146","Arti");
        User u2 = u1.clone();
        u2.setAge(25);


        System.out.println(u1.hashCode() +" "+ u2.hashCode());
        System.out.println(u1.getAge() +" "+u2.getAge());


        //prototype registry pattern

        UserPrototypeRegistryImpl registry = new UserPrototypeRegistryImpl();
        registry.addPrototype(UserRole.STUDENT,u1);

        User newStud = registry.getPrototype(UserRole.STUDENT).clone();
        newStud.setName("abc");
        System.out.println(u1.getName()+" "+ newStud.getName());
        System.out.println(u1.hashCode()+"  "+newStud.hashCode());
    }
}
