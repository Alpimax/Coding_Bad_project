package Coding_Bad_day_Questions.String2;

public class BobThere {
    /*
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
     */

    //here is code testing
    public static void main(String[] args) {
        System.out.println(bobthere("b9b"));
    }


    //here is my solution
    private static boolean bobthere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 2)) {
                return true;
            }
        }
        return false;
    }



}
