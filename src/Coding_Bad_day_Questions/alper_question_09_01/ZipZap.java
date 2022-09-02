package Coding_Bad_day_Questions.alper_question_09_01;

public class ZipZap {
    /*
    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
     Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


    zipZap("zipXzap") → "zpXzp"
    zipZap("zopzop") → "zpzp"
    zipZap("zzzopzop") → "zzzpzp"

     */


    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
    }
    public static String zipZap(String str) {
        return method(str);
    }
    public static  String method (String str) {
        if (str.length() < 3) {
            return str;
        }
        String sr = "";
        for (int i = 0; i < str.length(); i++)

            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                sr += str.charAt(i) + "" + str.charAt(i + 2);
                i += 2;
            } else
                sr += str.charAt(i);


        return sr;



    }
}
