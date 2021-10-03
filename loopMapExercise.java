package javaStuff;

import java.util.*;

public class loopMapExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers with a space in between each number");
        String userInput = scanner.nextLine();

        String[] separatedValues = userInput.split(" ");

        ArrayList<Integer> theNumArrayList = new ArrayList<Integer>(5);

        for(int j=0; j<5; j++) {
            theNumArrayList.add(Integer.parseInt(separatedValues[j]));
        }
        int sum=0, product=1, largest=theNumArrayList.get(0), smallest=theNumArrayList.get(0);
        for(int i: theNumArrayList) {
            sum += i;
            product *= i;
            if(i > largest) {
                largest = i;
            }
            if(i < smallest) {
                smallest = i;
            }
        }
        System.out.println("sum: " + sum + "\nproduct: " + product + "\nlargest: " + largest
            + "\nsmallest: " + smallest);
    }

}
