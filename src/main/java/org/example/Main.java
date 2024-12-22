package org.example;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    private static void taskOne() {
        int[] array = {13, 14, 15,16, 17, 18, 19, 20, 21, 22};
        int maxEven = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > maxEven) {
                maxEven = array[i];
            }
        }
        System.out.println("The maximum even number is: " + maxEven);

    }

    private static void taskTwo() {
        String input = "Привет, Александр, с праздником, с Новым Годом";
        StringBuilder changeCaseString = new StringBuilder(); // creating a class object StringBuilder for modification - changeCaseString
        for (char c : input.toCharArray()) { // let's go through the array of symbols (toCharArray() converts a string to a maximum of characters)
            if (Character.isUpperCase(c)) { // if the characters are in uppercase, add them in lowercase
                changeCaseString.append(Character.toLowerCase(c));
            } else {
                changeCaseString.append(Character.toUpperCase(c)); //  if the characters are in lowercase, add them in uppercase
            }
        }
        System.out.println("A phrase in a different character case: " + changeCaseString.toString());
    }
}