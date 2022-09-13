package com.company;

public class Main {

    public static void main(String[] args) {
    String smallHouse = buildHouse(2, "red");
    String bigHouse = buildHouse(9, "blue");
        System.out.println(smallHouse);
        System.out.println(bigHouse);
    }
    public static String buildHouse(int numberOfFloors, String color) {
        return color + " " + numberOfFloors + "- floors building";
    }

}
