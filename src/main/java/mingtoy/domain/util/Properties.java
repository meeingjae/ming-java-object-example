package mingtoy.domain.util;

import java.util.Hashtable;
import java.util.Optional;

public class Properties {

    private Hashtable<String, String> properties = new Hashtable<>();

    public String setProperty(String key, String value) {

        return properties.put(key, value);
    }

    public String getProperty(String key) {

        return Optional.ofNullable(properties.get(key))
                .orElse("Not Found.");
    }
}
