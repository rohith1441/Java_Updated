package abdul_bari_java;

public class product_N_customer {
    public class product{
        private String proId;
        private String name;
        private double price;
        private int qunatity;
        public product(String proId, String name){
            this.proId = proId;
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQunatity(int quantity) {
            this.qunatity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public int getQunatity() {
            return qunatity;
        }
        public void getDetails(){
            System.out.println("item id is: "+proId);
            System.out.println(("Item name is: "+name));
            System.out.println("Price: "+price);
            System.out.println("Quantity is: "+qunatity);
        }
    }
    public class customer{
        private String custId;
        private String name;
        public String Address;
        public String phNo;
        public customer(String custId, String name){
            this.custId = custId;
            this.name = name;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getPhNo() {
            return phNo;
        }

        public void setPhNo(String phNo) {
            this.phNo = phNo;
        }
        public void details(){
            System.out.println("CustId: "+custId+"\n"+"Name: "+name+"\n"+"Address: "+Address+"\n"+"Phone: "+phNo);
        }
    }

    public static void main(String[] args) {
        product_N_customer pro = new product_N_customer();
        product_N_customer.product pro1= pro.new product("p1","chips");
        pro1.setPrice(25.8);
        pro1.setQunatity(3);
        //System.out.println(pro1.getPrice());
       // System.out.println(pro1.getQunatity());
        pro1.getDetails();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        product_N_customer.customer cus1 = pro.new customer("cus123","sapna");
        cus1.setPhNo("2567973452");
        cus1.setAddress("5232 Apartments");


        cus1.details();

    }


}
