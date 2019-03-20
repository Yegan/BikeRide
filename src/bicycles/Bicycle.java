package bicycles;

public interface Bicycle {

    void accelerate();
    void brake();
    int currentSpeed();
    void stop();
    BicycleType getBicycleType();
}

   // private static int speed;

    //Setting the acceleration speed
   // public static void accelerate(){
    //speed += 5;
//    return speed;
  //  }
    // Getting or returning the acceleration speed
//    public int getAccelerate(){
//        return this.speed;
//    }
    //Setting the brake speed
   // public static void brake(){
    //    speed -=3;
    //}
    //Getting or returning the brake speed
//    public int getBrake(){
//        return this.speed;
//    }
    // Getting the current speed?? Still needs to be reworked
    //public static int currentSpeed(){
   // return speed;
    //}
    // Stops the speed and returns it to zero
    //public static void stop(){
    // speed = 0;
 //   }

