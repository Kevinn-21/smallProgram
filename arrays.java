package javaStuff;

import java.lang.Math;

public class arrays {
    public static void main(String[] args) {
        //NUMBER 1
        double[] arrForNumber1 = {1,2,3,4,5};
        System.out.println(calcSum(arrForNumber1));

        //////////////NUMBER 2////////////////////
        double[] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;

        for(int i=1; i < exampleArray.length; i++) {
            if(exampleArray[i] > maximum) {
                maximum = exampleArray[i];
                index = i;
            }
        }
        System.out.println(index);      //outputs 2

        ////////////////////////////////////////////

        int[] answer = toPower(5,2);
        for(int i : answer) {
            System.out.println("Number 3: " + i);
        }
    }




    //NUMBER 1 
    //This function takes an array of doubles and returns the sum.
    public static double calcSum(double[] arr) {
        int sum=0;
        for(double i : arr) {
            sum += i;
        }

        return sum;
    }


//NUMBER 3
    public static int[] toPower(int size, int power) {
        int[] answer = new int[size];
        for(int i=0; i<size; i++) {
            answer[i] = (int)Math.pow((double)i, (double)power);
        }

        return answer;
    }
}