class Solution {
    public int lengthOfLastWord(String s) {
        String sr[]=s.replaceAll("\\s+"," ").trim().split(" ");
        String last=sr[sr.length-1];
        return last.length();
      
    }
}
