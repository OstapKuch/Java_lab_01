package ua.lviv.iot.lab_2.managers;

import ua.lviv.iot.lab_2.models.Port;

import java.io.Serializable;

public class TransportationManagerImpl implements TransportationManager, Serializable {
    @Override
    public double calculatePrice(Port start, Port destination, String good, double goodAmount) {
        return 0;
    }
}


