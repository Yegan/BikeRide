package bicycles;

import bicycles.models.RoadBike;
import bicycles.models.Tandems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class funRideTest {

    @Test
    public void funRideTestEnteredCount(){
        FunRide funRide = new FunRide(5);
        Bicycle roadBike = new RoadBike();
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        assertEquals(5,funRide.getEnteredCount());
    }

    @Test
    public void funRideTestGetCountTypeFor(){
        FunRide funRide = new FunRide(5);
        Bicycle roadBike = new RoadBike();
        Bicycle tandems = new Tandems();

        funRide.accept(roadBike);
        funRide.accept(tandems);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);

        assertEquals(4, funRide.getCountForType(BicycleType.RoadBike));
    }
}
