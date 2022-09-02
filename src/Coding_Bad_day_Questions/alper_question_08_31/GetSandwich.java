package Coding_Bad_day_Questions.alper_question_08_31;

public class GetSandwich {

    /*A sandwich is two pieces of bread with something in between. Return the string that is between the first and
    last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.



            getSandwich("breadjambread") → "jam"
    getSandwich("xxbreadjambreadyy") → "jam"
    getSandwich("xxbreadyy") → ""
*/
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
    }

    public static String getSandwich(String str) {
        int indexFirstBread = str.indexOf("bread");
        String SecondBread = str.substring(indexFirstBread+1);
        int indexSecondBread =  SecondBread.lastIndexOf("bread");

        if ((str.contains("bread"))&&(SecondBread.contains("bread"))) {
            return SecondBread.substring(4,indexSecondBread);

        }else {
            return "";
        }
    }

}
