package com.github.xhrg.apollo.helper.config;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

@Component
public class MetaAddrs {

    private static Set<String> addr = new HashSet<>();

    static {
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties("env.properties");
            Collection<Object> a = properties.values();
            for (Object o : a) {
                addr.add(((String) o).trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Set<String> admins() {

        return null;
    }
}
