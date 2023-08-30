package abdul_bari_java.static_and_finalsss;

class coffeday {
    private float coffeeQty;
    private  float milkQty;
    private float waterQty;
    private float sugarQty;
    static private coffeday coffee=null;
    private coffeday(){
        coffeeQty = 1;
        milkQty =1;
        waterQty =1;
        sugarQty=1;
    }
    public void fillWater(float qty){
        waterQty=qty;
    }
    public void fillSugar(float qty){
        sugarQty = qty;
    }
    static coffeday getInstance(){
        if(coffee==null){
            coffee=new coffeday();
        }
        return coffee;
    }

}
