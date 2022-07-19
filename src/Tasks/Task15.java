package Tasks;

import java.util.*;

/*

                                        Need to look at the Java Collections Framework,
                                           to redistribute the array alphabetically.

 */

public class Task15 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] text = getArr();
        int[] count = new int[text.length];   //create an array for counting repetitions


        for (int i = 0; i < text.length; i++) {          // Finding repeats.
            for (int j = 0; j < text.length; j++) {
                if (text[i].equals(text[j])) {
                    count[i] += 1;
                }
            }
        }


        for (int i = 0; i < text.length; i++) {                // bring out the solution
            System.out.println(text[i] + " - " + count[i]);
        }
    }

    public static String getString() {  // String from the user in lower case
        String text = scanner.nextLine();
        return text.toLowerCase();
    }

    public static String getReplaceCommaDot() {  // replace comma and dot to space
        String text = getString();
        text = text.replace(",", " ");
        text = text.replace(".", " ");
        return text;
    }

    public static String[] getStrArr() {    // create String Array
        String text = getReplaceCommaDot();
        String[] text1 = text.split(" ", text.length());
        return text1;
    }

    public static String[] getArr() {  // Make from an Array ArrayList and Iterator method to delete spaces
        String[] text = getStrArr();
        List<String> list = new ArrayList<>(Arrays.asList(text));

//        for (String word : list) {
//            if( word.name.equalsIgnoreCase(" ")){
//                list.remove(word);
//            }
//        }
        Iterator<String> newStringArr = list.iterator();
        while (newStringArr.hasNext()) {
            String i = newStringArr.next();
            if (i.equalsIgnoreCase("")) {
                newStringArr.remove();
            }
        }

        String[] textArr = list.toArray(new String[list.size()]);

        return textArr;
    }

//    Ala likes cats, but she is not liked by the Cats.
}