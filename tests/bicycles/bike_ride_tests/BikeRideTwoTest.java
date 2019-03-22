package bicycles.bike_ride_tests;

import bicycles.bike_rides.BikeRideTwo;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTest {

    @Test
    public void mountainBikeRideTwoTest(){
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(mountainBike);
        bikeRideTwo.ride();
        assertEquals(104, bikeRideTwo.getCurrentSpeed());
    }


    @Test
    public void roadBikeBikeRideTwoTest(){
        RoadBike roadBike = new RoadBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(roadBike);
        bikeRideTwo.ride();
        assertEquals(234, bikeRideTwo.getCurrentSpeed());
    }

      @Test
    public void tandemsBikeRideTwoTest(){
        Tandems tandems = new Tandems();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(tandems);
        bikeRideTwo.ride();
        assertEquals(250, bikeRideTwo.getCurrentSpeed());
    }

}
