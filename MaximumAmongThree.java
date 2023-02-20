package com.maximum;
public class MaximumAmongThree {
    public static <Integer extends Comparable<Integer>> Integer maximumInteger(Integer number1, Integer number2, Integer number3) {
        Integer maximumNumber = number1;
        if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
            maximumNumber = number1;
        else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
            maximumNumber = number2;
        else
            maximumNumber = number3;
        return maximumNumber;
    }
    public static void main(String[] args) {
        System.out.println("Maximum Number among 3 will be: " + maximumInteger(18, 7, 9));
    }
}