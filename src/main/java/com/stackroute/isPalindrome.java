package com.stackroute;

public class isPalindrome {
    public boolean palindrome(String value){
        String str="";
        for(int i=value.length()-1;i>=0;i--) {
            str = str + (value.charAt(i));
        }
        if(str.equals(value)){
            return true;
        }
        return false;
    }
}
