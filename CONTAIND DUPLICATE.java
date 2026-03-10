// NEET CODE QUESTION
//LINK https://neetcode.io/problems/duplicate-integer/history?list=allNC&submissionIndex=0
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }
}
