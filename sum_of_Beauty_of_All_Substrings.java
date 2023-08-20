//1781. Sum of Beauty of All Substrings
class Solution {
    public int beauty(int freq[]){
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < freq.length;i++){
            if(freq[i]==0){
                continue;
            }
            min = Math.min(min,freq[i]);
            max = Math.max(max,freq[i]);
        }
        return max-min;
    }


    public int beautySum(String s) {
        int ans = 0;
        for(int i = 0 ; i < s.length();i++){
            int frequency[]=new int[26];
            for(int j = i ; j < s.length();j++){
                frequency[s.charAt(j)-'a']++;
                ans=ans+beauty(frequency);
            }
        }
        return ans;
    }
}
