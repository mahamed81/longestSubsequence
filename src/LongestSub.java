
public class LongestSub {
	
	static int length; // stores the LIS 
	  
	  
	  public  static int longestSub(int arr[], int n) 
	   { 
	      int temp=1;
	      int large = 1;
		  int array [] = new int [large];
	       // base case 
	       if (n == 1) 
	           return 1; 
	 
	        for (int i = 1; i < n; i++) 
	        { 
	            temp = longestSub(arr, i); 
	            if (arr[i-1] < arr[n-1] && temp + 1 > large) 
	                large = temp + 1;
	            
	        } 
	        if (length < large) 
	           length = large;  
	        return large; 
	   } 
	  
	   
	  
	    public static void main(String args[]) 
	    { 
	        int arr[] = { 30, 18, 44, 60, 29, 50, 41, 80 }; 
	        int n = arr.length; 
	        System.out.println("the length of the longest sub "
	                           + longestSub(arr, n) + "\n"); 
	    } 

}
