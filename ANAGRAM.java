//neet code question
// LINK https://neetcode.io/problems/is-anagram/history?list=allNC&submissionIndex=0
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
  char[]ss=s.toCharArray();
  char[]tt=t.toCharArray();
  Arrays.sort(ss);
  Arrays.sort(tt);
  if(Arrays.equals(ss,tt)){
    return true;
  }
  return false;
      }
}
