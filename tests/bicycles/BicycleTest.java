package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleTest {


    // BikeRideOne testing BikeRide interface

    //MountainBike BikeRideOne test
    @Test
    public void mountainBikeBikeRideOneTest(){
     MountainBike mountainBike = new MountainBike();

     BikeRideOne BikeRideOne = new BikeRideOne(mountainBike);

        BikeRideOne.ride();
        assertEquals(30, BikeRideOne.getCurrentSpeed());
    }


    // RoadBike BikeRideOne test
    @Test
    public void roadBikeBikeRideOneTest(){
        RoadBike roadBike = new RoadBike();

        BikeRideOne BikeRideOne = new BikeRideOne(roadBike);

        BikeRideOne.ride();
        assertEquals(66,BikeRideOne.getCurrentSpeed());
    }


    // Tandems BikeRideOne test
    @Test
    public void tandemBikeRideOneTest(){
        Tandems tandems = new Tandems();

        BikeRideOne BikeRideOne = new BikeRideOne(tandems);

        BikeRideOne.ride();
        assertEquals(72, BikeRideOne.getCurrentSpeed());

    }


}

