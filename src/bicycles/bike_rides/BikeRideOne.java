package bicycles.bike_rides;


import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideOne implements BikeRide {

    private final Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();

    }

    @Override
    public int getCurrentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
