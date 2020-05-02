package 力扣题;

public class 题0020 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="{[]}";
		题0020 twenty=new 题0020();
		System.out.println(twenty.isValid(s));
	}
	 public boolean isValid(String s) {
	        int len=s.length();
	        if(len%2!=0){
	            return false;
	        }
	        for(int i=0;i<len;i++){
	            if(s.charAt(i)=='('&&s.charAt(i+1)==')'){
	                i++;
	            }
	            else if(s.charAt(i)=='('&&s.charAt(len-1-i)==')'){
	                len--;
	            }
	            else if(s.charAt(i)=='['&&s.charAt(i+1)==']'){
	                i++;
	            }
	            else if(s.charAt(i)=='['&&s.charAt(len-1-i)==']'){
	                len--;
	            }
	            else if(s.charAt(i)=='{'&&s.charAt(i+1)=='}'){
	                i++;
	            }
	            else if(s.charAt(i)=='{'&&s.charAt(len-1-i)=='}'){
	                len--;
	            }
	            else{
	                return false;
	            }
	        }
	        return true;
	    }

}
