package 力扣题;

public class 无重复字符的最长字串 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="abcabcbb";
		int i= new 无重复字符的最长字串().check(s);
		System.out.print(i);
	}
	public int check(String s) {
		int i=1,I=1,m=1,n=0;
		int a=s.length();
		String S=null;	
		for(int j=0;j<a;j++){
			char check1=s.charAt(j);
			for(int k=j+1;k<a;k++){
				char check2=s.charAt(k);
				if(check1==check2){
					S=s.substring(j, k);
					n=S.length();
					m=check(S);
					break;
				}
				I++;
			}
			if(i<=I){
				i=I;
			}
			if(i<=n+1&&i>m) {
				i=m;
			}
			I=1;
		}
		
		return i;
		
	}
}
