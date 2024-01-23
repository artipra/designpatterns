package creational.prototype;

import java.util.HashMap;

public class UserPrototypeRegistryImpl implements UserPrototypeResigtry {

    HashMap<UserRole,User> registry = new HashMap<>();
    @Override
    public User getPrototype(UserRole role) {
        return registry.get(role);
    }

    @Override
    public void addPrototype(UserRole role, User user) {
       registry.put(role,user);
    }
}
