package Coding_Bad_day_Questions.alper_question_08_29;

public class DoubleChar {
    /*
    Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
     */

    // COMPLETED SOLUTION
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
    }
    public static String doubleChar(String str) {
        String answer="";
        for(int i =0; i<=str.length()-1;i++){
            answer+=str.charAt(i)+""+str.charAt(i);
        }
        return answer;
    }
}
