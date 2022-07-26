package Loops;

import java.math.*;

public class ListLoops {
    public static void main(String[] args) {

    /*    List numbers from -20 to20 using a loop. Then write out:

      1.  first 6 numbers

      2.  last 6 numbers

      3.  all even numbers

      4.  all numbers except for number 5

      5.  all numbers up to and including 7

      6.  all numbers divisible by 3

      7.  sum of all numbers

      8.  sum of all numbers greater or equal 4

      9.  all numbers and their powers

      10.  all numbers and their value modulo 10*/
        int sum=0;
        for (double i=-20;i<=20;i++){
/*            if(i<-20+6){
                System.out.println("First 6 numbers: " + i);
            } else if (i>20-6) {
                System.out.println("Last 6 numbers: " + i);
            }*/ // 1, 2.
/* if (i%2==0){
             System.out.println(i);
         }
*/ //3
/*if (i%5==0){
 System.out.println(i);
 }*/ //4
 /*if (i<=7){
                System.out.println(i);
            }*/ //5
 /* if (i%3==0 && i!=0){
                System.out.println(i);
            }*/ //6
/*sum +=i;
            System.out.println(sum);*/ //7
/*            if(i>=4){
                sum+=i;
            }else{
                continue;
            }
            System.out.println(sum);*/ //8

                System.out.println(Math.log(i));



            }



        }
    }


