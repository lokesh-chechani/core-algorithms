public class BinaryGap {

    public static int solution(String  N) {

       // char [] binaryRep = Integer.toBinaryString(N).toCharArray();

        char[] binaryRep = N.toCharArray();

        int initialLargetGap = 0;
        int finalLargestGap = 0;
        for (int i=0; i<=binaryRep.length-1; i++) {

            if (binaryRep[i] == '0'){
                initialLargetGap++;
            }
            else {
                if (initialLargetGap > 0){
                    if (finalLargestGap ==0 || finalLargestGap<=initialLargetGap)
                        finalLargestGap = initialLargetGap;
                }
                initialLargetGap =0;
            }

        }

        return finalLargestGap;
    }

    public static void main(String[] args) {

        String A = "1001";
        String B = "100100001";
        String C = "1010010001";


        System.out.println("A : 1001 -> expected = 2 , result = " + solution(A));
        System.out.println("B : 100100001 -> expected = 4 , result = " + solution(B));
        System.out.println("C : 1010010001-> expected = 3 , result = " + solution(C));
    }
}
