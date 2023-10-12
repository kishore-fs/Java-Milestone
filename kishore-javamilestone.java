class Solution {
    public boolean isPalindrome(int x) {
    String palindrome= String.valueOf(x);
    String pal="";
    for(int i=palindrome.length()-1;i>=0;i--){
        pal+=palindrome.charAt(i);
    } 
    return palindrome.equals(pal);
    }
}