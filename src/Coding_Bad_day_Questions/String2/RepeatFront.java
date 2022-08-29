package Coding_Bad_day_Questions.String2;

public class RepeatFront {
    /*
    Given a string and an int n, return a string made of the first n characters of the string,
    followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).


    repeatFront("Chocolate", 4) → "ChocChoChC"
    repeatFront("Chocolate", 3) → "ChoChC"
    repeatFront("Ice Cream", 2) → "IcI"
     */

    //YOUR CODE

    //    I read question
//    //    I'll go with for loop, but my loop have to turn my integer input number.And then, I'll use substring method for get result.
    public static void main(String[] args) {
        System.out.println(method("Chocolate", 3));
    }

    public static String method(String str, int number) {
        String result = "";
        if (number > 0 && number < str.length()) {

            for (int i = number; i >= 0; i--) {
                result += str.substring(0,i);
            }
            return result;
        }
        return str;
    }

}
