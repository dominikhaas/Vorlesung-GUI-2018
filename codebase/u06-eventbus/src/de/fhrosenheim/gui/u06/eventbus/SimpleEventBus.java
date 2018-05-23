package de.fhrosenheim.gui.u06.eventbus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Sehr einfache Implementierung eines Event Bus.
 * 
 * @author dominik.haas
 */
public class SimpleEventBus implements IEventBus {
    
    private static final SimpleEventBus INSTANCE = new SimpleEventBus();
    
    private final Map<Class, List<IEventBusListener>> classToListeners = new HashMap<>();

    private SimpleEventBus() {
        //singleton
    }

    public static SimpleEventBus getBus() {
        return INSTANCE;
    }

    @Override
    public void publish(Object event) {
        Class eventType = event.getClass();
        List<IEventBusListener> listeners = classToListeners.get(eventType);
        if(listeners != null) {
            listeners.forEach((listener) -> {
                listener.onEvent(event);
            });    
        }
    }

    @Override
    public <T> void subscribe(Class<T> type, IEventBusListener<T> listener) {
        if(!classToListeners.containsKey(type)) {
            classToListeners.put(type, new ArrayList<>());
        }
        classToListeners.get(type).add(listener);
    }   
}
