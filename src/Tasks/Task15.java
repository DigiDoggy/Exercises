package Tasks;

import java.util.*;

public class Task15 {

    private  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(getArr());




//        for (String word : text) {
//            if( word.equals(" ")){
//                word.
//            }
//        }


        // Implement your solution here
    }
    public static String getString(){
        String text= scanner.nextLine();
        return text.toLowerCase();
    }

    //    public static char getStringArr(){
//        String text = getString().toLowerCase();
//         char index = text.charAt(4);
//         char comma = ',';
//         char dot = '.';
//        ArrayList<String> textArr= new ArrayList<>();
//
//        for ( int i=0; i < text.length();i++){
//            if (text.substring(i).equalsIgnoreCase(",") || text.substring(i).equalsIgnoreCase(" ")||text.substring(i).equalsIgnoreCase(".")) {
//                textArr.add(String.valueOf(text.indexOf(i)));
//            }
//        }
//
//
//
//         return index;
//
//    }


    //    public static char getStringArr(){
//        String text = getString().toLowerCase();
//         char index = text.charAt(4);
//         char comma = ',';
//         char dot = '.';
//        ArrayList<String> textArr= new ArrayList<>();
//
//        for ( int i=0; i < text.length();i++){
//            if (text.substring(i).equalsIgnoreCase(",") || text.substring(i).equalsIgnoreCase(" ")||text.substring(i).equalsIgnoreCase(".")) {
//                textArr.add(String.valueOf(text.indexOf(i)));
//            }
//        }
//
//
//
//         return index;
//
//    }

    public static String getReplaceCommaDot(){
        String text = getString();
        text = text.replace(","," ");
        text = text.replace(".", " ");
        return text;
    }

    public static String[]  getStrArr(){
        String text = getReplaceCommaDot();
        String[] text1 = text.split(" ", text.length());
        return text1;
    }

    public static List<String> getArr(){
        String[] text = getStrArr();
        List<String> list = new ArrayList<>(Arrays.asList(text));

//        for (String word : list) {
//            if( word.name.equalsIgnoreCase(" ")){
//                list.remove(word);
//            }
//        }
        Iterator<String> newStringArr = list.iterator();
        while (newStringArr.hasNext()){
            String i = newStringArr.next();
            if(i.equalsIgnoreCase("")){
                newStringArr.remove();
            }
        }
        return list;
    }


// public static String[] getStrWhithoutSpace(){
//        String[] text = getStrWwithoutComma();
//        String[] text1 =
// }
//    Ala likes cats, but she is not liked by the Cats.
}