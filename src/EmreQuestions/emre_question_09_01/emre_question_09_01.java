package EmreQuestions.emre_question_09_01;

import java.util.Arrays;

public class emre_question_09_01 {
//Array-2 > sameEnds
//prev  |  next  |  chance
//Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
//
//
//sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
//sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
//sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
public static void main(String[] args) {

}
    public boolean sameEnds(int[] nums, int len) {
        int[] arr1=new int[len];
        int[] arr2=new int[len];
        for(int i=0;i<len;i++){

            arr1[i]=nums[i];  // len=2 arr1[5,6] nums[5,6,45,99,13,5,6]
        }
        //for create the arr2 with nums reversed elements
        for (int i = nums.length-1, y=0 ; i >= nums.length-len; i--, y++){ //goes backwards
            arr2[y] = nums[i]; // arr2[6,5]
        }//for reverse the arr2
        int[] reverse = new int[arr2.length];

        for (int i = arr2.length-1, y=0 ; i >= 0; i--, y++){ //goes backwards
            reverse[y] = arr2[i];

            //for result
        } if(Arrays.equals(reverse,arr1)){
            return true;
        }else{
            return false;
        }
    }
}
