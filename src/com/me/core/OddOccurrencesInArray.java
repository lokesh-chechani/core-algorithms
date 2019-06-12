import java.util.Arrays;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        int notMatched = 0;
        for (int n : A){

            if(Arrays.binarySearch(A,indexOfAry(A,n)+1,A.length,n)<0){ //
                return n;
            }
        }
        return notMatched;

    }

    private static int indexOfAry(int[] ary, int element){
        for (int i = 0; i < ary.length; i++)
            if (ary[i] == element)
                return i;
        return -1;
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
