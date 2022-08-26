package Coding_Bad_day_Questions.String2;

public class RepeatSeparator {
    /*
    Given two strings, word and a separator sep,
    return a big string made of count occurrences of the word, separated by the separator string.


    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    repeatSeparator("This", "And", 2) → "ThisAndThis"
    repeatSeparator("This", "And", 1) → "This"

     */

    //YOUR CODE HERE
//    reading question...
//    Logic: I'll go with for loop but trick part first I have to write first str and second str, which is if number 1
//    I won't write second str, that mean,my loop turn one less from number and then add manually last str.
    public static void main(String[] args) {
        System.out.println(method("This", "And", 2));
    }

    public static String method(String word, String sep, int count) {
        String result = "";
        for (int i = count; i > 1; i--) { // this part goes util 1 for add last str, I am going to add with if statement.
            result += word + sep;
        }
//
        if (count > 0)
            result += word;
        return result;
    }
}

