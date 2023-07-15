public class Main {
    public static void main(String[] args){
       /* Pizza basePizza = new Pizza(true);
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.getBill();*/

        DeluxPizza DP= new DeluxPizza(true);
        DP.takeAway();
        DP.getBill();
    }
}
