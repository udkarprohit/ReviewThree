package com.bridgelabz;

public class CommonElement {
    //    Write a program to DISPLAY THE COMMON ELEMENTS between two arrays?
    //el1 = {1,2,3} and el2 = {9,1,0} and
    // if (el1 == el2) { sout(el[i]) }
    void getCommonElement() {
        //creating One dimensional array
        int[] arrayOne = {1, 2, 3, 4, 50};
        int[] arrayTwo = {6, 5, 20, 50, 23};
        //for loop for reading the elements of arrayOne
        for (int i = 0; i < arrayOne.length; i++) {
            //for loop for reading the elements of arrayTwo
            for (int j = 0; j < arrayTwo.length; j++) {
                //Condition for arrayOne[i] == arrayTwo[j]
                if (arrayOne[i] == arrayTwo[j]) {
                    System.out.println("The Common Elements Between Two Arrays Are : " + arrayOne[i] + " AND " + arrayTwo[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        //Calling non-static elements
        CommonElement commonElement = new CommonElement();
        commonElement.getCommonElement();
    }
}
