package abdul_bari_java.static_and_finalsss;
class HondaCity {
    static double prize = 20;
    int a, b;

    static double OnRoadPrize(String city) {
        switch (city) {
            case "delhi":
                return prize + prize * 0.1;
            case "mumbai":
                return prize + prize + 0.09;
        }
        return 0;
    }
}
public class cars {
    public static void main(String[] args) {
       /* HondaCity hondaCity = new HondaCity();
        HondaCity hondaCity1 = new HondaCity();
        System.out.println(HondaCity.prize);*/
        System.out.println(HondaCity.OnRoadPrize("delhi"));
        System.out.println(HondaCity.OnRoadPrize("mumbai"));
    }
}
