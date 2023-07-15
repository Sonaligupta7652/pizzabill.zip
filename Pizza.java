public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice =100;
    private int extraToppingsPrice = 150;
    private int backpackPrice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdder = false;
    private boolean isExtraToppingsAdder = false;
    private boolean isOfferForTackAway = false;




    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        basePizzaPrice =this.price;
    }
   public void addExtraCheese(){
        isExtraCheeseAdder = true;
        this.price += extraCheesePrice;
   }

   public void addExtraToppings(){
        isExtraToppingsAdder =true;
        this.price+= extraToppingsPrice;

   }
   public void takeAway(){
        isOfferForTackAway =true;
       System.out.println("Take away opted");
       this.price+= backpackPrice;
   }
public void getBill(){
        String bill ="";
    System.out.println("pizza:"+basePizzaPrice);
    if(isExtraCheeseAdder){
        bill+= "Extra Toppings added: "+extraCheesePrice+ "\n";
    }
    if(isExtraToppingsAdder){
        bill+= "Extra Topping added: "+extraCheesePrice+ "\n";
    }
    if(isOfferForTackAway){
        bill+= "Take away: "+extraCheesePrice+ "\n";
    }
    bill += "bill: "+this.price + "\n";
    System.out.println(bill);

}
}
