package DSA.RecursionByStriver;

public class StringPalindrome {
  public static void main(String[] args) {
    
    System.out.println(isPalindrome("wow"));
    System.out.println("isPalindromeRec: "+isPalindromeRec("wow",0));
    System.out.println(isPalindromeRec("1112111", 0));
    System.out.println(isPalindromeRec("Limit", 0));
  }

  public static boolean isPalindrome(String str){

    int l = str.length()-1;

    String newStr = "";
    for(int i =l; i>=0; i--){
      
      newStr += str.charAt(i);
    }

    if(newStr.equals(str))
    return true;

    return false;
  }

  public static boolean isPalindromeRec(String str, int i){

    if(i>str.length()/2)
    return true;

    if(str.charAt(i) != str.charAt(str.length() - 1 -i))
    return false;

    return isPalindromeRec(str, i+1);  
  }
}
