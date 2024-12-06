public class Food {
    private String foodName;
    private int price;
    private String foodCategory;
    public Food(){

    }

  public Food(String foodName, int price, String foodCategory){
      this.foodName=foodName;
      this.price=price;
      this.foodCategory=foodCategory;
  }
  public void setfoodName(String name){
      this.foodName=name;
  }
  public String getfoodName(){
      return this.foodName;
  }
  public void setPrice(int price){
      this.price=price;
  }
  public int getPrice(){
      return this.price;
  }
  public void setFoodCategory(String category){
      this.foodCategory=category;
  }
  public String getFoodCategory(){
      return this.foodCategory;
  }














}
