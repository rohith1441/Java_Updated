package abdul_bari_java;

public class enumdemo {
    enum names{
        rohith,
        vivek,
        ChandraMohan,
        Leela;
        private names(){
            System.out.println(this.name());
        }
    }

    public static void main(String[] args) {
        names name=names.rohith;
        System.out.println(name.ordinal());
        System.out.println(name.valueOf("rohith"));
        names list[]=names.values();
        for(names x:list){
        System.out.println(x);}

        /*System.out.println(names.rohith);
        System.out.println(names.vivek);
        System.out.println(names.ChandraMohan);
        System.out.println(names.Leela);*/
        names n = names.rohith;
        switch (n){
            case rohith:
                System.out.println("rohith is here");
                break;
            case vivek:
                System.out.println("Vivek is here");
                break;
            case Leela:
                System.out.println("Leela is here");
                break;
            case ChandraMohan:
                System.out.println("CM is here");
        }

    }
}
