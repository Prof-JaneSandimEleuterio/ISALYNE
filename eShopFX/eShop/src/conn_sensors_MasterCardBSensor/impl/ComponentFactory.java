package conn_sensors_MasterCardBSensor.impl;

import conn_sensors_MasterCardBSensor.prov.IManager;

/**
 * Created by COSMAPE-Feature IDE on 2016-jul-11.
 * Feature: MasterCardB
 * Component: Conn_sensors_MasterCardBSensor
 */
public class ComponentFactory {
    private static IManager manager = null;

    private ComponentFactory() {
    }

    public static synchronized IManager createInstance() {
        if (manager == null)
            manager = new Manager();
        return manager;
    }
}