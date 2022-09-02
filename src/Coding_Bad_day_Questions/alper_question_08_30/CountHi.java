package Coding_Bad_day_Questions.alper_question_08_30;

public class CountHi {
   /* Return the number of times that the string "hi" appears anywhere in the given string.


    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2

    */
    //COMPLETED SOLUTION
   public static void main(String[] args) {
       System.out.println(countHi("ABChi hi"));
   }
   public static int countHi(String str) {
       int count = 0;
       for(int i= 0; i<str.length()-1;i++){
           if(str.charAt(i)=='h' && str.charAt(i+1)=='i'){
               count++;}
       }
       return count;
   }
}
