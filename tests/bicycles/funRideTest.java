package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class funRideTest {

    @Test
    public void funRideTestEnteredCount(){
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
    public void funRideTestGetCountTypeFor(){
        FunRide funRide = new FunRide(5);
        Bicycle roadBike = new RoadBike();
        Bicycle moutainBike = new MountainBike();
        funRide.accept(roadBike);
        funRide.accept(moutainBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);

        assertEquals(1,funRide.getCountForType(BicycleType.MountainBike));
    }
}
