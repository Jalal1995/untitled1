package com.company.a;

import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if (N %2 == 1) System.out.println("Weird");
        else System.out.println("Not Weird");
    }
}
