public class Inhertancedemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20,10,1);
        System.out.println(mountainBike.gear);
        System.out.println(mountainBike.seatHeight);
        System.out.println(mountainBike.speed);
        mountainBike.applyBrake(5);
        System.out.println(mountainBike.speed);
    }
}
