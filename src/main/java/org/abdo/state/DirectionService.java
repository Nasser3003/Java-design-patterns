package org.abdo.state;

public class DirectionService {
    private TravelMode travelMode;

    public DirectionService(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }
    public Object getEta() {
        return travelMode.getEta();
    }
}
