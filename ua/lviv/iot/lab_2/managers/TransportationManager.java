package ua.lviv.iot.lab_2.managers;

import ua.lviv.iot.lab_2.models.Port;

public interface TransportationManager {
    double calculatePrice(Port start, Port destination, String good, double goodAmount);

}
