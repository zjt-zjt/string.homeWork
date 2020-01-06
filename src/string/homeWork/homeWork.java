package string.homeWork;

import java.util.Scanner;

public class homeWork {

	public static void main(String[] args) {
      //第一题
		String str = "张三:90/李四:90/王五:80";
		String[] string = str.split("/");
        for (String string2 : string) {
	    String string3 = string2.substring(0, 2);
	    String string4 = "姓名：";
	    String newString = string4.concat(string3);
	    String string5 = string2.substring(3, 5);
	    String string6 = "成绩:";
	    String newString1 = string6.concat(string5);
	   String string7 = newString.concat(","+newString1+";");
	      System.out.println(string7);
}
        
        
	}
}
