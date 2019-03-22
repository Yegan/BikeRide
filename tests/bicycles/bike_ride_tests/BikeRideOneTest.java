package bicycles.bike_ride_tests;

import bicycles.bike_rides.BikeRideOne;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandems;
import org.junit.jupiter.api.Test;
//each test for each bike

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BikeRideOneTest {

    @Test
    public void mountainBikeBikeRideOneTest(){
     MountainBike mountainBike = new MountainBike();
     BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
     bikeRideOne.ride();
     assertEquals(30, bikeRideOne.getCurrentSpeed());
    }

    @Test
    public void roadBikeBikeRideOneTest(){
     RoadBike roadBike = new RoadBike();
     BikeRideOne bikeRideOne = new BikeRideOne(roadBike);
     bikeRideOne.ride();
     assertEquals(66,bikeRideOne.getCurrentSpeed());
    }

    @Test
    public void tandemBikeRideOneTest(){
     Tandems tandems = new Tandems();
     BikeRideOne bikeRideOne = new BikeRideOne(tandems);
     bikeRideOne.ride();
     assertEquals(72, bikeRideOne.getCurrentSpeed());
    }

}

