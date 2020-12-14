package service;

public class Search {
	public int toFind;
	public void toSearch() {
	        int[] number = {10,8,5,6,7,2,3,4,1,9};
	        boolean toBeFound = false;
	        {

	        for (int temp : number) {
	            if (temp == toFind) {
	                toBeFound = true;
	                break;
	            }
	        }

	        if(toBeFound)
	            System.out.println(toFind + " is present.");
	        else
	            System.out.println(toFind + " is not present.");
	    }
	}
}

