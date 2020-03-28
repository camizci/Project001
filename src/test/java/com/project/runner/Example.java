package com.project.runner;

public class Example {

    public static int solution(int n) {
        System.out.println("Integer.toBinaryString(n) = " + Integer.toBinaryString(n));
        int max= Integer.numberOfLeadingZeros(0);
        System.out.println("max = " + max);
        int consecutive=0;
        int count=0;
        while (Integer.numberOfLeadingZeros(n)!= max){
            System.out.println("Integer.numberOfLeadingZeros(n) = " + Integer.numberOfLeadingZeros(n));
            if ((n&1)==0){
                count++;
            } else {
                if (count>consecutive){
                    consecutive=count;
                }
                count=0;
            }
            System.out.println("n1 "+n);
            n= n>>1;
            System.out.println("n2 "+n);
            System.out.println("consecutive = " + consecutive);
        }
        return consecutive;
    }
    public static void main(String[] args) {
        System.out.println((solution(1041)));
        System.out.println("****************************");
        System.out.println((solution(3)));
        System.out.println("****************************");
        System.out.println((solution(4)));
        System.out.println("****************************");
        System.out.println((solution(5)));
        System.out.println("****************************");

        System.out.println("(5&1)==0 = " + (5&1));

        System.out.println("(4&1) = " + (4&1));

    }
}
