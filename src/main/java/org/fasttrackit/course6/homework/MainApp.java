package org.fasttrackit.course6.homework;

public class MainApp {
    public static void main(String[] args) {
        Person person1 = new Person("Ițic", "20", true);
        System.out.println("Person1: " + person1);
        System.out.println("**********");

        Person person2 = new Person("Ștrul", "25", false);
        System.out.println("Person2's name: " + person2.getName());
        System.out.println("Person2's age: " + person2.getAge());
        System.out.println("Person2's married status: " + person2.getMarriedStatus());
        System.out.println("Person2: " + person2);
        System.out.println("**********");

        Person person3 = new Person();
        System.out.println("Person3: " + person3);
        person3.setName("Harap-Alb");
        person3.setAge("în floarea vârstei");
        person3.setMarriedStatus(true);
        System.out.println("Person3 becomes: " + person3);
        System.out.println("**************************************");


        Product product1 = new Product();
        System.out.println("Product1's name: " + product1.getName());
        System.out.println("Product1: " + product1);
        System.out.println("Product1 has stock: " + product1.hasStock());
        System.out.println("Product1 before setting the category, is category: " + product1.isCategory("meat"));
        product1.setCategory("meat");
        System.out.println("Product1 after setting the category, is category: " + product1.isCategory("meat"));
        System.out.println("Product1's name: " + product1.getName());
        System.out.println("Product1's price: " + product1.getPrice());
        System.out.println("Product1's quantity: " + product1.getQuantity());
        System.out.println("Product1's category after setting the category: " + product1.getCategory());
        System.out.println("Product1: " + product1);
        System.out.println("**********");

        Product product2 = new Product("Avicola eggs", 1.5, 10, "eggs");
        System.out.println("Product2: " + product2);
        System.out.println("Product2 has stock: " + product2.hasStock());
        System.out.println("Product2 before modifying the category, is category: " + product2.isCategory("eggs"));
        product2.setCategory("flour");
        System.out.println("Product2 after modifying the category, is category: " + product2.isCategory("eggs"));
        System.out.println("Product2's name: " + product2.getName());
        System.out.println("Product2's price: " + product2.getPrice());
        System.out.println("Product2's quantity: " + product2.getQuantity());
        System.out.println("Product2's category after modifying the category: " + product2.getCategory());
        System.out.println("Product2: " + product2);
        System.out.println("**********");

        Product product3 = new Product("Nestle ice cream", 25, 0, "ice cream");
        System.out.println("Product3: " + product3);
        System.out.println("Product3 before stocking up, has stock: " + product3.hasStock());
        product3.setQuantity(50);
        System.out.println("Product3 after stocking up, has stock: " + product3.hasStock());
        System.out.println("Product3's name: " + product3.getName());
        System.out.println("Product3's price: " + product3.getPrice());
        System.out.println("Product3's quantity after stocking up: " + product3.getQuantity());
        System.out.println("Product3's category: " + product3.getCategory());
        System.out.println("Product3: " + product3);
        System.out.println("**************************************");


        Bottle bottle1 = new Bottle(25, 20, true);
        System.out.println("Bottle1 has liquid: " + bottle1.hasLiquid());
        System.out.println("Bottle1 has available liquid: " + bottle1.hasAvailableLiquid() + "L");
        System.out.println("Bottle1 has an empty capacity of: " + bottle1.getEmptyCapacity() + "L");
        bottle1.openTheBottle();
        bottle1.closeTheBottle();
        bottle1.closeTheBottle();
        bottle1.openTheBottle();
        bottle1.drinkFromTheBottle(20);
        System.out.println("Bottle1: " + bottle1);
        bottle1.openTheBottle();
        System.out.println("Bottle1 is opened: " + bottle1.isOpenStatus());
        System.out.println("Bottle1: " + bottle1);
        System.out.println("**********");

        Bottle bottle2 = new Bottle();
        System.out.println("Bottle2: " + bottle2);
        System.out.println("Bottle2 has liquid: " + bottle2.hasLiquid());
        System.out.println("Bottle2 has available liquid: " + bottle2.hasAvailableLiquid() + "L");
        System.out.println("Bottle2 has an empty capacity of: " + bottle2.getEmptyCapacity() + "L");
        System.out.println("Bottle2 is opened: " + bottle2.isOpenStatus());
        bottle2.setTotalCapacity(10);
        bottle2.setAvailableLiquid(8);
        System.out.println("Bottle2 after setting capacity and available liquid quantity: " + bottle2);
        bottle2.drinkFromTheBottle(6);
        bottle2.drinkFromTheBottle(3);
        System.out.println("Bottle2 after drinking from it: " + bottle2);
        System.out.println("**********");
    }
}
