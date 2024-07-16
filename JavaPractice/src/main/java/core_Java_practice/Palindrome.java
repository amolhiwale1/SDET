package core_Java_practice;

public class Palindrome {

    public static void main(String[] args){
        String str = "madam";
        if (isPalindrome(str)){
            System.out.println("The given String is a core_Java_practice.Palindrome.");
        }else{
            System.out.println("The given String is not a core_Java_practice.Palindrome.");
        }
    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;

        }
        return true;
    }
}
