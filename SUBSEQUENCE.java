//NEETCODE QUESTION
//LINK https://neetcode.io/problems/is-subsequence/history?list=allNC&submissionIndex=0
class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){

            if(s.charAt(i) == t.charAt(j)){
                i++;
            }

            j++;
        }

        return i == s.length();
    }
}
