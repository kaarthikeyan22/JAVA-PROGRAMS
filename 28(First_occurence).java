class Solution {
    public int strStr(String haystack, String needle) {
    int n=haystack.length();
    int m=needle.length();
    for(int left=0;left<= n-m;left++){
        int right=left;
        while(right<left+m && haystack.charAt(right)==needle.charAt(right-left))  {
            right++;
        }
        if(right-left==m){
            return left;
        }
        
    }
    return -1;

    }
}


//USING IN-BUILT FUNCTIONS.
/*class Solution {
    public int strStr(String haystack, String needle) {
        return haystack .indexOf(needle);
    }
}
*/
