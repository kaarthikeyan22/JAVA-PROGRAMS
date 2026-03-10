//neet code question
//LINK https://neetcode.io/problems/concatenation-of-array/history?list=allNC&submissionIndex=0
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concat = new int[2 * nums.length];

        for(int i = 0; i < nums.length; i++){
            concat[i] = nums[i];
        }

        int s = 0;
        for(int j = nums.length; j < nums.length * 2; j++){
            concat[j] = nums[s];
            s++;
        }

        return concat;
    }
}
