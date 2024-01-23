package creational.prototype;

public interface UserPrototypeResigtry {

    User getPrototype(UserRole role);

    void addPrototype(UserRole role , User user);


}
