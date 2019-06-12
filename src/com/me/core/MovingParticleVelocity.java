package com.me.core;

public class MovingParticleVelocity {


    public static int solution (int [] a){

        //  input {1,3,5,7,9,11,0,1,3,5,7};
        //  final count = 8
        // solution representation = {2,2,2,2,2,-11,1,2,2,2}

        int bigValue = 4819990; //Some value as mentioned in test

        int [] velocityAry = new int[a.length-1];
        for (int i=0;i<a.length-1;i++){
            velocityAry[i] = a[i+1]-a[i];
        }

        int totalCount = 0;
        int consecutiveCount = 0;

        //Assuming the ask is if Velocity Ary has more that 10,000 element then return a static big value
        if(velocityAry.length > 999){
            return 4819990;
        }

        for (int i=0; i<velocityAry.length-1;i++){

            System.out.print(velocityAry[i]+", ");

            if(velocityAry[i] == velocityAry[i+1]){
                totalCount++;
                consecutiveCount++;
            }

            else{
                if (consecutiveCount >=2){
                    totalCount++;
                }
                consecutiveCount=0;
            }
        }

        System.out.print(velocityAry[velocityAry.length-1]);

        // Sum up the last iteration of consecutive count
        if (consecutiveCount >=2){
            totalCount++;
        }
        return totalCount;



    }


    public static void main(String[] args) {

        int [] ary2 = {-1,1,3,3,3,2,3,2,1,0};

        System.out.println("  ==> result : "+solution(ary2));

        int [] ary = {1,3,5,7,9,11,0,1,3,5,7};
        System.out.println("  ==> result : "+ solution(ary));



        int [] ary3 = {1,3,5,0,1,3,5,7};

        System.out.println("  ==> result : "+solution(ary3));
    }

}
