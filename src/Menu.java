public class Menu {
public static Food[] foods=new Food[10];
public static int k=0;

public static void addFood(Food food){
    if(k>= foods.length*0.8){
        Food[] foods2=new Food[2*foods.length];
        for(int i=0;i<k;i++){
            foods2[i]=foods[i];
        }
        foods=foods2;
    }
    foods[k]=food;
    k++;
}
//----------------------------------------------------
public static void showMenu(){
    for(int i=0;i<k;i++){
        if(foods[i] != null){
            System.out.println("[" +"Name: "+foods[i].getfoodName()+", Price: "+foods[i].getPrice()+", Category: "+ foods[i].getFoodCategory()+ "]");
        }
    }
}
public static void removefood(String nameF){
    for(int i=0;i<k;i++){
        if(foods[i].getfoodName().equals(nameF)){
           foods[i] = null;
        }
    }
}





















}
