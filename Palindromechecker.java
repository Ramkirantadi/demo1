/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromechecker;

/**
 *
 * @author ramki
 */
public class Palindromechecker {

    public static void main(String[] args) {
        int num = 121; // Example number
        int reversedNum = 0, remainder, originalNum;
        originalNum = num;
        // Reversed integer is stored in variable
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // Palindrome if original and reversed are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}

    

