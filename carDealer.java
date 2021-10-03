package javaStuff;

import java.util.*;

public class carDealer {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Honda", "Civic");
        map.put("Ford", "Mustang");
        map.put("Toyota", "Prius");
        map.put("Subaru", "WRX");
        map.put("Tesla", "Model 3");
        map.put("Chevrolet", "Camaro");
        System.out.println("Hi, what car brand are you looking for?");

        Scanner scan = new Scanner(System.in);
        String userQuery = scan.nextLine();
        if(map.containsKey(userQuery)) {
            System.out.println("What model?");
            String carModel = scan.nextLine();
            if(map.get(userQuery).equals(carModel)) {
                System.out.println("Come this way PLEASE!");
            }
            else {
                System.out.println("Sorry we dont have that model!!!!");
            }
        } else {
            System.out.println("Sorry we don't sell that brand!!!!");
        }
    }
}
