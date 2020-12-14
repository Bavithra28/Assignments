package service;

public class Plindrome {
	public String str1;
	public  String str2="";
	
    public void palindromeSeq() {
    int i;
    int number;
    number= str1.length();
    for(i = number - 1; i >= 0; i--)
    {
        str2 = str2 + str1.charAt(i);
   
    }
    if(str1.equalsIgnoreCase(str2))
    {
        System.out.println("The string is palindrome.");
    }
    else
    {
        System.out.println("The string is not palindrome.");
    }
}
}
