import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuUtil.initilizeMenu();
        while(true){
          System.out.println("---------------Current Menu--------------- ");
          Menu.showMenu();
          System.out.print("\nAre you Admin(1) or Customer(2) ? "); int check=scanner.nextInt();
          if(check==1){
              boolean forexit=true;
              do{
                  System.out.println("\n-----------------Operations----------------- ");
                  String menu= "               1.Add Food \n"+
                          "               2.Remove Food \n"+
                          "               3.Show all Menu \n"+
                          "               4.show all Orders \n" +
                          "               5.exit";
                  System.out.println(menu);
                  System.out.print("pls enter the number of operation ");
                  int numberAdmin= scanner.nextInt();

                  switch(numberAdmin){
                      case 1->{
                          System.out.print("enter food name -> ");
                          String name=scanner.next();
                          System.out.print("enter food price -> ");
                          int price=scanner.nextInt();
                          System.out.print("enter food category -> ");
                          String category=scanner.next();
                          Food food = new Food(name, price, category);
                          Menu.addFood(food);
                      }
                      case 2-> {
                          System.out.print("enter the Food Name you want to remove -> ");
                          String nameF=scanner.next();
                          Menu.removefood(nameF);
                      }
                      case 3->Menu.showMenu();
                      case 4->{
                          Order.showAllOrders();
                      }
                      case 5-> forexit=false;
                  }

              }while(forexit);
          }
          else if(check==2){
              boolean continueOrder=true;
              String operations="1.Sifarish elave edin \n"+
                                "2.Ada esasen Axtarish edin \n"+
                                "3.Qiymet araligina esasen axtarish edin ";
              System.out.println(operations);
              System.out.print("Choose the operation: ");
              int numberCustomer=scanner.nextInt();
              switch(numberCustomer){
                  case 1-> {
                      /* Food food= new Order();//bu niye bele yazilir?
                       Order order=(Order) food;*/
                      //Ve burda Order o=new Order(); yazanda da butun setler, getler gelir niye?
                      System.out.print("Adinizi daxil edin -> "); String name = scanner.next();
                      int generalMoney=0;
                      do {
                          System.out.print("Yemeyin adini daxil edin -> "); String nameF=scanner.next();
                          //String x=scanner.nextLine();//bu niye teleb olunur yazmasan error gelir
                          System.out.print("Porsiya sayini daxil edin -> "); int portion = scanner.nextInt();
                          Order order2=new Order();
                          order2.setCustomerName(name);
                          order2.setfoodName(nameF);
                          order2.setPortionFood(portion);
                          Order.addOrderArray(order2);
                          System.out.println("Hal-hazirda hesab: " + Order.getPrice(order2));
                          generalMoney+=Order.getPrice(order2);
                          System.out.print("Do yo want to add other orders? (yes/no)  "); String answer=scanner.next();
                          if(answer.equals("no")){
                              continueOrder=false;
                          }

                      }while(continueOrder);
                      System.out.println("Toplam Hesab: " + generalMoney);
                      Order.generalMoney(generalMoney);
                  }
                 case 2->{
                     System.out.print("Enter Name to Search: ");
                     String nameSearch=scanner.next();
                     Order.searchByName(nameSearch);


                 }
                 case 3->{
                     System.out.print("qiymet araligini daxil edin \n1. ");
                     int qiymet1=scanner.nextInt();
                     System.out.print("2. ");
                     int qiymet2=scanner.nextInt();
                    Order.searchByPrice(qiymet1,qiymet2);

                 }
              }
              }

          System.out.print("\nDo you want to continue? (yes/no) "); String yesno=scanner.next();
          if(yesno.equals("no")){
              System.exit(0);
          }
      }





























    }
}