package service;

public class PositionsMain {
	public String string;
	public void area() {
	int i;
	int even=0;
	int odd=0;
	int l=string.length();
	System.out.println(l);
	char str1[]=new char[50];
	char str2[]=new char[40];
    for(i=0 ;i<l ;i++)
    {
        if(i%2 == 0)
        {
            str1[even] =   string.charAt(i);
            even++;
        }
        
        if(i%2 == 1)
        {
            str2[odd] =   string.charAt(i);
            odd++;
        }
        
        
    }
	System.out.println(str1);
	System.out.println(str2);
	}
}    

