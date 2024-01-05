package prototype.configuration;

import java.util.*;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {

	private HashMap<ConfigurationType, Configuration> map = new HashMap<>();

	public void addPrototype(Configuration user) {
		map.put(user.getType(), user);
	}

	public Configuration getPrototype(ConfigurationType type) {
		return map.get(type);
	}

	public Configuration clone(ConfigurationType type) {
		return map.get(type).cloneObject();
	}
}
