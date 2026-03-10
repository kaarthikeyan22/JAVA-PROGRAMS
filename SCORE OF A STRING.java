//neet code question SCORE A STRING
// LINK https://neetcode.io/problems/score-of-a-string/history?list=allNC&submissionIndex=0
class Solution {
    public int scoreOfString(String s) {
        char[]ch=s.toCharArray();
        int score=0;
        for (int i=0;i<ch.length-1;i++){
            score+=Math.abs(ch[i]-ch[i+1]);
        }
        return score;
    }
}
