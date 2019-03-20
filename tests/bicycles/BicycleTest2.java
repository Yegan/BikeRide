package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest2 {


//    // MountainBike BikeRideTwo test
    @Test
    public void mountainBikeRideTwoTest(){

        MountainBike mountainBike = new MountainBike();
        BikeRideTwo BikeRideTwo = new BikeRideTwo(mountainBike);

        BikeRideTwo.ride();
        assertEquals(104, BikeRideTwo.getCurrentSpeed());
    }


//    // MountainBike BikeRideTwo Test Mountain Road Test
    @Test
    public void roadBikeBikeRideTwoTest(){
        RoadBike roadBike = new RoadBike();
        BikeRideTwo BikeRideTwo = new BikeRideTwo(roadBike);

        BikeRideTwo.ride();
        assertEquals(234, BikeRideTwo.getCurrentSpeed());
    }

//    //Tandems BikeRideTwo test
      @Test
    public void tandemsBikeRideTwoTest(){
        Tandems tandems = new Tandems();
        BikeRideTwo BikeRideTwo = new BikeRideTwo(tandems);

        BikeRideTwo.ride();
        assertEquals(250, BikeRideTwo.getCurrentSpeed());
    }

}
