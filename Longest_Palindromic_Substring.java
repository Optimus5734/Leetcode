class Solution {
    public int expandFromCenter(String s,int left , int right){
        if(s==null || left>right) return 0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left - 1;
    }
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1) return "";
        int start=0;
        int end=0;
        if(s.length()==1) return s;
        for(int i = 0 ; i < s.length();i++){
            int lenOdd = expandFromCenter(s,i,i);
            int lenEven = expandFromCenter(s,i,i+1);
            int max = Math.max(lenOdd,lenEven);
            if(max > (end - start)){
                start=i-((max-1)/2);
                end=i+(max/2);
            }

        }
        return s.substring(start,(end+1));
    }
}
