package de.fhrosenheim.gui.common;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Simple CDI Registry implemented with JBoss Weld.
 * @author weigend
 */
public class Registry {

    private static WeldContainer weld;

    public static void init() {
        weld = new Weld().initialize();
    }
    
    public static <T> T getService(Class<T> clazz) {  
        if (weld == null) {
           init(); 
        }
        return weld.select(clazz).get();
    }
}
