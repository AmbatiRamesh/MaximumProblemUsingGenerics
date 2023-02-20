package com.maximum;
public class MaximumAmongThree {
    public static <String extends Comparable<String>> String maximumString(String name1, String name2, String name3) {
        String maximumNumber = name1;
        if (name1.compareTo(name2) > 0 && name1.compareTo(name3) > 0)
            maximumNumber = name1;
        else if (name2.compareTo(name1) > 0 && name2.compareTo(name3) > 0)
            maximumNumber = name2;
        else
            maximumNumber = name3;
        return maximumNumber;
    }
    public static void main(String[] args) {
        System.out.println("Maximum Number among 3 will be: " + maximumString("ramesh", "virat", "kohli"));
    }
}