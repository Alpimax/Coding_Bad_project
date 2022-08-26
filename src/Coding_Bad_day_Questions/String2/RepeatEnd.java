package Coding_Bad_day_Questions.String2;

public class RepeatEnd {
    /*
    Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.


      repeatEnd("Hello", 3) → "llollollo"
      repeatEnd("Hello", 2) → "lolo"
      repeatEnd("Hello", 1) → "o"
     */

    //YOUR CODE.....

//    I'll go with for loop, but my loop have to turn my integer input number.And then, I'll use substring method for get result.

    public static void main(String[] args) {
        System.out.println(method("Hello", 3));
    }

    public static String method(String str, int number) {
        String result = "";
        if (number > 0 && number < str.length()) {
            // I created my logic and checked, it worked, but I read question and found bug.
            //   Which was question give us different test case
            //You may assume that n is between 0 and the length of the string, inclusive.
            //    I decided, put all code inside if statement.
            for (int i = 1; i <= number; i++) {
                result += str.substring(str.length() - number);
            }
            return result;
        }
        return str;
    }

}