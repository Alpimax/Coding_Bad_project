package Coding_Bad_day_Questions.String2;

public class XyzThere {
//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
//
//
//xyzThere("abcxyz") → true
//xyzThere("abc.xyz") → false
//xyzThere("xyz.abc") → true

    //this solution is not giving the result but maybe it can give idea if you want to correct or wanna comment let
    // me know only 2 result is missing:(
    public boolean xyzThere(String str) {

//
//        if ((!str.contains("xyz") || !str.contains("xyz.")) && (str.contains(".xyz"))) {
//            return false;
//
//        } else if ((str.contains("xyz") || str.contains("xyz.")) && (str.contains(".xyz"))) {
//            return true;
//
//        } else if ((str.contains("xyz") || str.contains("xyz.")) && !(str.contains(".xyz"))) {
//            return true;
//
//        } else {
//            return false;
//        }
//
//    }

//        I add my code here


        String result = "";
        result += str.replaceAll(".xyz", "");

       return result.contains("xyz");
    }
}