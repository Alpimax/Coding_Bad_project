package Coding_Bad_day_Questions.String2;

public class PlusOut {
//  Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
//
//
//plusOut("12xy34", "xy") → "++xy++"
//plusOut("12xy34", "1") → "1+++++"
//plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

//here is code testing....................ITS NOT COMPLETED SOLUTION
public static void main(String[] args) {

    System.out.println(plusOut("12xy34xy34", "xy"));

}
    public static String plusOut(String str, String word) {
      String changed="";
      String changed2="";
      String mark="/";

        if(str.contains(word)){                     // str=12xy34xy34   word=xy
             changed=str.replaceAll(word,"/");}//changed=12/34/34

             for(int i=0; i<changed.length();i++) {
                 if (changed.charAt(i) != '/') {
                     String x=changed.substring(i,i+1);
                     changed2 = changed.replaceFirst(x, "+"); // Idea is changing ++/++/++ but loop is not going as i
                     // wanted
                 }
             }//loop bracelet
             // then i will replace all / marks with word







            return changed2;

}
}
