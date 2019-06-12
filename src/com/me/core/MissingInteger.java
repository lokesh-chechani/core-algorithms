package com.wundermancommerce.interviewtests.graph.domain;

import java.util.Arrays;

public class MissingInteger {

    public static int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        int highestNo = A[A.length-1];

        if(highestNo <= 0 ){
            return 1;
        }

        // System.out.println("highest No : "+ highestNo);

        for (int i =1 ; i<=highestNo-1; i++){

            System.out.println("Checking lowest no "+ i);

            if(Arrays.binarySearch(A,i) >=0 ){

                System.out.println(""+ i + "present, ignoreing");

                continue;

            }
            else {
                System.out.println(""+ i + "No present, returning");
                return i;
            }
        }

        return highestNo+1;


    }



    public static void main(String[] args) {
        int[] A = {1,2,3};
        int[] B = {1, 3, 6, 4, 1, 2};
        int[] C = {-1, -3};

        int[] D = {1};

        int expectedA = 4;
        int expectedB = 5;
        int expectedC = 1;
        int expectedD = 2;

       // System.out.println("Result A {1,2,3} = " + solution(A) + " Expected = " + expectedA);
       // System.out.println("Result B = {1, 3, 6, 4, 1, 2} = " + solution(B) + " Expected = " + expectedB);
       // System.out.println("Result C = {-1, -3} = " + solution(C) + " Expected = " + expectedC);

        System.out.println("Result D = {1} = " + solution(D) + " Expected = " + expectedD);


    }
}
