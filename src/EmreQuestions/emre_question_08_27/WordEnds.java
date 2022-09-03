package EmreQuestions.emre_question_08_27;

public class WordEnds {
//    Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
//
//
//wordEnds("abcXY123XYijk", "XY") → "c13i"
//wordEnds("XY123XY", "XY") → "13"
//wordEnds("XY1XY", "XY") → "11"


    // Begin to think about logic

//   I ll go with for loop and check each character if XY equal i +1 keep  i-1 and i+2
//    let's try

    public static void main(String[] args) {
        System.out.println(method("XY123XY", "XY"));
    }
    public static String method(String a, String b) {
        String str = "";

       if (a.length() == b.length() ||a.length() <= b.length() )
            return str;
        if (a.substring(0, b.length()).equals(b)){
            str+=a.charAt(b.length());
        }
        for (int i = 1; i < a.length()-b.length(); i++) {
            if (a.substring(i, b.length() + i).equals(b)) {
                str += a.charAt(i - 1) + "" + a.charAt(i + b.length());
            }
        }
        if (a.lastIndexOf(b) == a.length()-b.length()){
            str+=a.charAt(a.length()-b.length() -1);
        }
        return str;
    }
//    I think, probably there are so much different way.let's search and find easy way learn new logic.
}