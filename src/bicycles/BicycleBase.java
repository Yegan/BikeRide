package bicycles;


// Abstract classes are similar to to an interface
public abstract class BicycleBase implements Bicycle  {
    private int speed;


    protected void changeSpeed(int speedChange){
        speed += speedChange;
    }
    @Override
    public int  currentSpeed(){
        return speed;
    }
    @Override
    public void stop(){
        this.speed = 0;
    }
}
