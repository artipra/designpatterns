package creational.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class User implements UserPrototype {

    private int age;
    private String name;
    private String mobileNo;

    public User(int age, String mobileNo, String name){
        this.age = age;
        this.name = name;
        this.mobileNo = mobileNo;
    }
    public User clone(){
        return new User(age,mobileNo,name);
    }
}
