package string.homeWork;

import java.util.Scanner;

public class homeWork {

	public static void main(String[] args) {
      //��һ��
		String str = "����:90/����:90/����:80";
		String[] string = str.split("/");
        for (String string2 : string) {
	    String string3 = string2.substring(0, 2);
	    String string4 = "������";
	    String newString = string4.concat(string3);
	    String string5 = string2.substring(3, 5);
	    String string6 = "�ɼ�:";
	    String newString1 = string6.concat(string5);
	   String string7 = newString.concat(","+newString1+";");
	      System.out.println(string7);
}
        
        
	}
}
