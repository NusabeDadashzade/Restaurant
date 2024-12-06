public class Order extends Food {
    private String  customer_name;
    private int portionFood;

    public void setCustomerName(String nameC){
        this.customer_name=nameC;
    }
    public String getCustomerName(){
        return this.customer_name;
    }
    public void setPortionFood(int portion){
        this.portionFood=portion;
    }
    public int getPortionFood(){
        return this.portionFood;
    }
    public static Order[] orders=new Order[10];
    public static int ordersCount=0;
    public static void addOrderArray(Order order){
        if(ordersCount>=orders.length*0.8){
            Order[] order2=new Order[orders.length*2];
            for(int i=0;i<ordersCount;i++){
                order2[i]=orders[i];
            }
            orders=order2;
        }

        orders[ordersCount]=order;

        ordersCount++;
    }
    public static int getPrice(Order order){
        int price;
     for(int i=0;i<Menu.k;i++){
         if(order.getfoodName().equals(Menu.foods[i].getfoodName())){
             return order.getPortionFood() * Menu.foods[i].getPrice();
         }
     }
     return 0;
    }

    public static void showAllOrders(){
        int tekrarSayi=0;
        for(int i=0;i<ordersCount;i++){
            String adamAdi=orders[i].customer_name;
            if(tekrarSayi ==0){
                System.out.println("Customer name: " + adamAdi );
                tekrarSayi++;
            }
            System.out.println("Sifarisleri: "+ orders[i].getfoodName());
        }
        System.out.println("Umumi Hesab:" + pul);

    }
    public static int pul;
    public static void  generalMoney(int generalMoney){
       pul=generalMoney;
    }

    public static void searchByName(String nameSearch){
        System.out.println("Yemek adlari: ");
        boolean x=true;
      for(int i=0;i<Menu.k;i++){
       if(Menu.foods[i].getfoodName().equals(nameSearch)){
           System.out.println(i+1+". "+Menu.foods[i].getfoodName());
           x=false;
       }
      }
      if(x){
          System.out.println("Bele yemek yoxdur.");
      }
    }
    public static void searchByPrice(int qiymet1,int qiymet2){
        System.out.println("bu araliqdaki Yemekler ve qiymetleri:");
        for(int i=0;i<Menu.k;i++){
            if(Menu.foods[i].getPrice()>=qiymet1 && Menu.foods[i].getPrice()<=qiymet2){
                System.out.println(Menu.foods[i].getfoodName() + " , " + Menu.foods[i].getPrice());
            }
        }
    }



}
