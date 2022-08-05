public class Hamburger {
    private String name;
    private String meat;
    private double basicPrice;
    private String rollType;
    private int additionalNumber = 0;
    private double additionalPrice;
    private String additionalBurgerItem;
    private double totalPrice;
    private int additionalHealthyBurgerNumber = 0;

    public Hamburger(String name, String meat, double basicPrice , String rollType ){
        this.name = name;
        this.meat = meat;
        this.basicPrice = basicPrice;
        this.rollType = rollType;
        System.out.println(name + " hamburger on " + rollType + " roll with " + meat + " at price of : " + basicPrice);
        totalPrice = basicPrice; 
    }

    public void addHambugerAddition(String name, double price){
        additionalBurgerItem = name;
        additionalPrice = price;

        if (additionalNumber < 4) {
            this.additionalNumber += 1;
            System.out.println("Added " + additionalBurgerItem + " for an extra : " + additionalPrice);
            totalPrice += additionalPrice;
        } else {
            if (this.name == "Healthy") {
    
                if (this.additionalHealthyBurgerNumber < 2) {
                    this.additionalHealthyBurgerNumber += 1;
                    System.out.println("Added Extral  " + additionalBurgerItem + " for an extra : " + additionalPrice);
                    totalPrice += additionalPrice;
                } else {
                    System.out.println( "You can not add more than 6 iterm");
                }
                
            }else{
                System.out.println( "You can not add more then 4 iterm");
            }
            
        }
        
        

    }

    public double getTotalPrice() {
        return totalPrice;
    }



}
  