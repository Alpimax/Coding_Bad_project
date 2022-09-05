package EmreQuestions.emre_question_08_28;

public class emre_question_08_28 {
//    Array-2 > either24
//prev  |  next  |  chance
//Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
//
//
//either24([1, 2, 2]) → true
//either24([4, 4, 1]) → true
//either24([4, 4, 1, 2, 2]) → false

// public boolean either24(int[] nums) {
public static void main(String[] args) {

}
    public boolean either24(int[] nums) {
        int count2=0;
        int count4=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==2 &&nums[i+1]==2 &&nums[i]!=4){
                count2++;}
            if(nums[i]==4 &&nums[i+1]==4 &&nums[i]!=2)
                count4++;}
        if(count2>=1 && count4==0){
            return true;
        }if(count4>=1 && count2==0){
            return true;
        }else{
            return false;
        }
    }

}
