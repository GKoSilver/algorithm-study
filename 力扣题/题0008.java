package 力扣题;

public class 题0008 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0008 test = new 题0008();
		String str = "3.14159";
		System.out.println(test.myAtoi(str));
	}

	public int myAtoi(String str) {
		char[] chars = str.toCharArray();
		int n = chars.length;
		int idx = 0;
		while (idx < n && chars[idx] == ' ') {
			// 去掉前导空格
			idx++;
		}
		if (idx == n) {
			// 去掉前导空格以后到了末尾了
			return 0;
		}
		boolean negative = false;
		if (chars[idx] == '-') {
			// 遇到负号
			negative = true;
			idx++;
		} else if (chars[idx] == '+') {
			// 遇到正号
			idx++;
		} else if (!Character.isDigit(chars[idx])) {
			// 其他符号
			return 0;
		}
		int ans = 0;
		while (idx < n && Character.isDigit(chars[idx])) {
			int digit = chars[idx] - '0';
			if (ans > (Integer.MAX_VALUE - digit) / 10) {
				// 本来应该是 ans * 10 + digit > Integer.MAX_VALUE
				// 但是 *10 和 + digit 都有可能越界，所有都移动到右边去就可以了。
				return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			ans = ans * 10 + digit;
			idx++;
		}
		return negative ? -ans : ans;
	}

//	public int myAtoi(String str) {
//		str=str.replaceAll(" ", "");
//		int len=0;
//		String new_str="";
//		boolean symbol=false;
//		boolean symbol2=false;
//		if (str.length()==0) {
//			return 0;
//		}
//		if(!((str.charAt(0)<='9'&&str.charAt(0)>='0')||str.charAt(0)=='+'||str.charAt(0)=='-')) {
//			return 0;
//		}
//		for(int i=0;i<str.length();i++) {
//			if(len==0&&(str.charAt(i)=='+'||str.charAt(i)=='-')) {
//				new_str+=String.valueOf(str.charAt(i));
//				symbol=true;
//				len++;
//			}
//			if(str.charAt(i)<='9'&&str.charAt(i)>='0') {
//				new_str+=String.valueOf(str.charAt(i));
//				len++;
//			}
//			if(symbol&&len>1&&!symbol2&&str.charAt(i)=='.') {
//				new_str+=String.valueOf(str.charAt(i));
//				symbol2=true;
//				len++;
//			}
//			else if(!symbol&&len>0&&!symbol2&&str.charAt(i)=='.') {
//				new_str+=String.valueOf(str.charAt(i));
//				symbol2=true;
//				len++;
//			}
//			if(symbol&&new_str.charAt(0)=='+'&&len>=10) {
//				break;
//			}
//			else if(symbol&&new_str.charAt(0)=='-'&&len>=11) {
//				break;
//			}
//
//		}
//		if(symbol2) {
//			new_str=new_str.split("\\.")[0];
//		}
//		
//		try {
//			if(new_str.length()<10) {
//				return Integer.valueOf(new_str);
//			}
//			int num=Integer.valueOf(new_str.substring(0, len-1));
//			if(num>Integer.MAX_VALUE/10) {
//				return Integer.MAX_VALUE;
//			}else if(num<Integer.MIN_VALUE/10) {
//				return Integer.MIN_VALUE;
//			}else {
//				return Integer.valueOf(new_str);
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			return 0;
//		}
//		
//
//	}

}
