package prototype.user;

import java.util.*;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {
	private HashMap<String, User> map = new HashMap<>();

	public void addPrototype(User user) {
		map.put(user.getType().toString(), user);
	}

	public User getPrototype(UserType type) {
		return map.get(type.toString());
	}

	public User clone(UserType type){
       return map.get(type.toString()).cloneObject();
   }
}
