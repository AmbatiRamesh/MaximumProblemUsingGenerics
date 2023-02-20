package com.maximum;
public class MaximumAmongThree {
    public static <Float extends Comparable<Float>> Float maximumFloat(Float number1, Float number2, Float number3) {
        Float maximumNumber = number1;
        if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
            maximumNumber = number1;
        else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
            maximumNumber = number2;
        else
            maximumNumber = number3;
        return maximumNumber;
    }
    public static void main(String[] args) {
        System.out.println("Maximum Number among 3 will be: " + maximumFloat(18.5f, 7.7f, 9.8f));
    }
}