package 力扣题;

public class 题0013 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="MCMXCIV";
		题0013 thirteen=new 题0013();
		System.out.println(thirteen.romanToInt(s));
	}

	public int romanToInt(String s) {
		int i=0;
		int len;
		len=s.length();
		for(int j=0;j<len;j++){
			char c=s.charAt(j);
			if(j==len-1){
				switch (c){
				case 'I':i+=1;break;
				case 'V':i+=5;break;
				case 'X':i+=10;break;
				case 'L':i+=50;break;
				case 'C':i+=100;break;
				case 'D':i+=500;break;
				case 'M':i+=1000;break;
				}
			}
			if(j<len-1){
				if(c=='I'&&s.charAt(j+1)=='V'){
					i+=4;
					j++;
				}
				else if(c=='I'&&s.charAt(j+1)=='X'){
					i+=9;
					j++;
				}
				else if(c=='X'&&s.charAt(j+1)=='L'){
					i+=40;
					j++;
				}
				else if(c=='X'&&s.charAt(j+1)=='C'){
					i+=90;
					j++;
				}
				else if(c=='C'&&s.charAt(j+1)=='D'){
					i+=400;
					j++;
				}
				else if(c=='C'&&s.charAt(j+1)=='M'){
					i+=900;
					j++;
				}
				else{
					switch (c) {
						case 'I': i += 1;
						case 'V': i += 5;
						case 'X': i += 10;
						case 'L': i += 50;
						case 'C': i += 100;
						case 'D': i += 500;
						case 'M': i += 1000;
					}
				}
			}
		}
		return i;
	}


}
