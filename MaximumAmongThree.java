package com.maximum;

public class MaximumAmongThree<T> {
    T number1, number2, number3;
    public static <T extends Comparable<T>> T maximumAmongThree(T number1, T number2, T number3) {
        T maximumNumber = number1;
        if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
            maximumNumber = number1;
        else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
            maximumNumber = number2;
        else
            maximumNumber = number3;
        return maximumNumber;
    }
    public static void main(String[] args) {
        System.out.println("The max Number Among Three String numbers is:-\n " + maximumAmongThree("virat", "ABD", "rohit"));
        System.out.println("The max Number Among Three Integer numbers is:-\n " + maximumAmongThree(18, 17, 45));
        System.out.println("The max Number Among Three Float numbers is:-\n " + maximumAmongThree(18.0f, 17.5f, 45.6f));
    }
}

