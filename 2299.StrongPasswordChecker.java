class Solution {
    public boolean strongPasswordCheckerII(String password) {
        HashSet<Character> set=new HashSet();
        String s="!@#$%^&*()-+";
        boolean lower=false;
        boolean upper=false;
        boolean digit=false;
        boolean special=false;
        boolean no_same_char=true;
        for (int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        } 
        char prev=' ';
        for(int i=0;i<password.length();i++){
            if(prev==password.charAt(i)){
                no_same_char=false;
            }
            prev=password.charAt(i);
            if(Character.isLowerCase(password.charAt(i))){
                lower=true;
            }else if(Character.isUpperCase(password.charAt(i))){
                upper=true;
            }else if(Character.isDigit(password.charAt(i))){
                digit=true;
            }else if(set.contains(password.charAt(i))){
                special=true;
            }
        }
        return password.length()>=8&&lower&&upper&&digit&&special&&no_same_char;
    }
}
