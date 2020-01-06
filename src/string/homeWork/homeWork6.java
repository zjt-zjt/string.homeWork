package string.homeWork;

import java.util.Scanner;

public class homeWork6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符串");
		    int upper = 0;
		    int lower = 0;
		    int count =0;
			String string = scanner.nextLine();
			StringBuilder stringBuilder = new StringBuilder();
		    char[] str = string.toCharArray();
		
		for(int i = 0;i<str.length;i++) {
			if(str[i]>'a'&&str[i]<'z') {
			  String  str1 = str[i]+"";
			 stringBuilder.append(str1.toUpperCase());
			  lower++;
			}else if(str[i]>'A'&&str[i]<'Z') {
				 String  str2 = str[i]+"";
				 stringBuilder.append(str2.toLowerCase());
				 upper++;
				}else {
					String  str3 = str[i]+"";
					String  str4 = str3.replace(str3, "*");
					stringBuilder.append(str4);
				}
			 
			}
		
		System.out.println("键盘录入："+string);
		System.out.println("输出结果："+stringBuilder);
		System.out.println("总共："+Integer.sum(lower++, upper++));
		
		
}
}
