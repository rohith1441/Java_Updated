public class encapsulationdemo {
    private int wheels;
    private int doors;
    private String type;
    public encapsulationdemo(int nofwheels, int nofdoors, String tofcar){
        wheels = nofwheels;
        doors = nofdoors;
        type = tofcar;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        encapsulationdemo demo = new encapsulationdemo(4,4,"larry");
        System.out.println(demo.doors);
        System.out.println(demo.wheels);
        System.out.println(demo.type);
        demo.setDoors(5);
        System.out.println(demo.doors);
        System.out.println(demo.getDoors());

    }
}
