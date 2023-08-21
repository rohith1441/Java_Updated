public class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int startHeight,int startSpeed, int startGear){
        super(startSpeed,startGear);
        seatHeight=startHeight;
    }
    public void setSeatHeight(int newValue){
        seatHeight=newValue;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void sppedUp(int increment){
        speed += increment;

}}