public class mountainbike_interface implements Bicycle_interface{
    private int seatheight;
    private int gear;
    private int speed;
    public mountainbike_interface(int starthright, int startspeed, int startgear){
        seatheight = starthright;
        speed = startspeed;
        gear=startgear;
    }

    @Override
    public void appplybrake(int decrement) {
        speed = speed-decrement;
    }

    @Override
    public void speedup(int increment) {
        speed=speed+increment;
    }
}
