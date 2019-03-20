package bicycles;


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



//    public int currentSpeedBikeRideOne(){
//        return this.bicycle.currentSpeed();
//    }
//}
//    public void BikeRideOnePace(){
//    this.acceleration();
//    this.acceleration();
//    this.acceleration();
//    this.acceleration();
//    this.acceleration();
//    this.acceleration();
//    this.acceleration();
//    this.acceleration();
//    this.brakes();
//    this.brakes();
//
//    }

//    @Override
//    public void acceleration() {
//
//    }
//
//    @Override
//    public void brakes() {
//
//    }
//      private final Bicycle bicycle;
//
//    public Bicycle bicycle;
//
//     Bicycle bicycle = new Bicycle();
//
//
//    public BikeRide(Bicycle bicycle){
//        this.bicycle = bicycle;
//
//    }
//
//    public void ride() {
//        this.bicycle.accelerate();
//        this.bicycle.accelerate();
//        this.bicycle.accelerate();
//        this.bicycle.brake();
//        this.bicycle.brake();
//        this.bicycle.accelerate();
//
//    }
//
//    public int getRide(){
//        return this.bicycle.currentSpeed();
//
//    }

