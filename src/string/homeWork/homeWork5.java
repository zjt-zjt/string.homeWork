package string.homeWork;

public class homeWork5 {

	public static void main(String[] args) {
		String[] string = {"010","3223","666","7890987","123123"};
		StringBuilder stringBuilder = new StringBuilder();
		int num = 0;
		for (int i = 0;i<string.length;i++) {
			StringBuilder  stringBuilder2 = stringBuilder.reverse();
			if(stringBuilder.equals(stringBuilder2)) {
				num++;	
			}
		}
		System.out.println("该数组中对称字符串的个数是"+num++);
		
	}

}
