public class DeluxeBurger extends Hamburger {
    public DeluxeBurger (){
        super("Delux", "sheep", 14.5, "White");
        super.addHambugerAddition("Chips", 2.75);
        super.addHambugerAddition("Drink", 1.81);
    }

    @Override
    public void addHambugerAddition(String name, double price){
        System.out.println("Can not additional items to a deluxe Buger");
    }
}
