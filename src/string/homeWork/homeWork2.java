package string.homeWork;

import java.util.Scanner;

public class homeWork2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ���ַ���");
		String string  = scanner.nextLine();
		int lower = 0;
		int upper = 0;
		int num = 0;
      
    	  char[] str = string.toCharArray();
    	  for(int i = 0;i < str.length;i++) {
    		  if(str[i]>='a'&&str[i]<'z') {
    			   lower++;
    		  }else if(str[i]>='A'&&str[i]<='Z') {
    			  upper++;
    		  }else if(str[i]>='0'&&str[i]<='9') {
    			  num++;
    		  }
    		  
    	  }
    	  
    	  System.out.println("��д��"+upper+";"+"Сд��"+lower+";"+"����:"+num);
    	  
      


	}

}
