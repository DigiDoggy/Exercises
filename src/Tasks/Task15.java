package Tasks;

import java.util.*;

public class Task15 {

    private  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(getArr());

    }

    public static String getString(){  // String from the user in lower case
        String text= scanner.nextLine();
        return text.toLowerCase();
    }

    public static String getReplaceCommaDot(){  // replace comma and dot to space
        String text = getString();
        text = text.replace(","," ");
        text = text.replace(".", " ");
        return text;
    }

    public static String[]  getStrArr(){    // create String Array
        String text = getReplaceCommaDot();
        String[] text1 = text.split(" ", text.length());
        return text1;
    }

    public static List<String> getArr(){  // Make from an Array ArrayList and Iterator method to delete spaces
        String[] text = getStrArr();
        List<String> list = new ArrayList<>(Arrays.asList(text));


        Iterator<String> newStringArr = list.iterator();
        while (newStringArr.hasNext()){
            String i = newStringArr.next();
            if(i.equalsIgnoreCase("")){
                newStringArr.remove();
            }
        }
        return list;
    }

//    Ala likes cats, but she is not liked by the Cats.
}