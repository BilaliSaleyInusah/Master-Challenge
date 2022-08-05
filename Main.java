public class Main{
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Goat", 2.55, "white");
        hamburger.addHambugerAddition("tomato", 0.27);
        hamburger.addHambugerAddition("lettus", 0.75);
        hamburger.addHambugerAddition("cheese", 0.25);
        hamburger.addHambugerAddition("carrote", 0.87);
        hamburger.addHambugerAddition("onion", 0.07);
        System.out.println("Your total price is " + Math.round( hamburger.getTotalPrice() * 100.00 ) / 100.00 );

        System.out.println("");

        HealthyBurger healthyBurger = new HealthyBurger("Cow", 10);
        healthyBurger.addHambugerAddition("tomato", 0.27);
        healthyBurger.addHambugerAddition("lettus", 0.75);
        healthyBurger.addHambugerAddition("cheese", 0.25);
        healthyBurger.addHambugerAddition("carrote", 0.87);
        healthyBurger.addHambugerAddition("onion", 0.07);
        healthyBurger.addHambugerAddition("tomato", 0.27);
        healthyBurger.addHambugerAddition("lettus", 0.75);
        System.out.println("Your total price is " + Math.round( healthyBurger.getTotalPrice() * 100.00 ) / 100.00 );

        System.out.println("");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHambugerAddition("tomato", 0.27);
        deluxeBurger.addHambugerAddition("lettus", 0.75);
        deluxeBurger.addHambugerAddition("cheese", 0.25);
        deluxeBurger.addHambugerAddition("carrote", 0.87);
        deluxeBurger.addHambugerAddition("onion", 0.07);
        deluxeBurger.addHambugerAddition("tomato", 0.27);
        deluxeBurger.addHambugerAddition("lettus", 0.75);
        System.out.println("Your total price is " + Math.round( deluxeBurger.getTotalPrice() * 100.00 ) / 100.00 );

    }
} 