package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void funRideTestEnteredCountAccepted(){
        FunRide funRide = new FunRide(5);
        Bicycle roadBike = new RoadBike();
        Bicycle mountainBike = new MountainBike();
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        assertEquals(5,funRide.getEnteredCount());
    }

    @Test
    public void funRideTestEnteredCountRejected(){
        FunRide funRide = new FunRide(4);
        Bicycle roadBike = new RoadBike();
        Bicycle mountainBike = new MountainBike();
        Bicycle tandems = new Tandems();
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(tandems);
        funRide.accept(tandems);
        funRide.accept(tandems);
        funRide.accept(mountainBike);
        assertEquals(4,funRide.getEnteredCount());
    }

    @Test
    public void funRideTestGetCountTypeForRoadBike(){
        FunRide funRide = new FunRide(5);
        Bicycle roadBike = new RoadBike();
        Bicycle mountainBike = new MountainBike();
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        assertEquals(4,funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test
    public void funRideTestGetCountTypeForMountainBike(){
        FunRide funRide = new FunRide(10);
        Bicycle roadBike = new RoadBike();
        Bicycle mountainBike = new MountainBike();
        Bicycle tandems = new Tandems();
        funRide.accept(tandems);
        funRide.accept(tandems);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        assertEquals(3,funRide.getCountForType(BicycleType.MountainBike));
    }
}
