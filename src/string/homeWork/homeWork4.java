package string.homeWork;

public class homeWork4 {

	public static void main(String[] args) {
		String string = "abcbcbabcb34bcbd";
		String str = "bcb";
        System.out.println(string.contains(str));
       
        int a = string.indexOf(str);
        System.out.println(a);
         while (true) {
		if(string.indexOf(str, a+3)!=-1) {
			a+=3;
			System.out.print(string.indexOf(str, a));
			
		}
        	 
	}
        
       
     
        	  
        
        	  
      
		
		
	}

}
