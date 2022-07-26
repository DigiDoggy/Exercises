package Loops;


import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
    private static LocalTime time = LocalTime.now().withNano(0);

    public static void main(String[] args) {
        System.out.println(time+"\n");
        System.out.println("Hours :");
        getNiceHour();                  //the number of hours converts to the number of stars
        System.out.println("Minute ");
        getNiceMinuts();
        System.out.println("Seconds :");
        getNiceSeconds();

    }

    public static void getNiceHour(){ // the number of hours converts to the number of stars
        int count=0;
       for (int i=0 ; i<= 6;i++){
           for (int j = 0; j<= 9;j++){
               if (count== time.getHour()){
                   break;
               }
               System.out.print("*");
               count++;
           }
           if (count== time.getHour()){
               break;
           }
           System.out.println();
       }
        System.out.println();
    }

    public static void getNiceMinuts(){
        int count=0;
        for (int i=0 ; i<= 6;i++){
            for (int j = 0; j<= 9;j++){
                if (count== time.getMinute()){
                    break;
                }
                System.out.print("*");
                count++;
            }
            if (count== time.getMinute()) {
                break;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void getNiceSeconds(){
        int count=0;
        for (int i=0 ; i<= 6;i++){
            for (int j = 0; j<= 9;j++){
                if (count== time.getSecond()){
                    break;
                }
                System.out.print("*");
                count++;
            }
            if (count== time.getSecond()) {
                break;
            }
            System.out.println();
        }
    }



}

