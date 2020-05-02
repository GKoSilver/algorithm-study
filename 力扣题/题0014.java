package 力扣题;

public class 题0014 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String []strs= {"flower","flow","flight"};
		题0014 fourteen=new 题0014();
		System.out.println(fourteen.longestCommonPrefix(strs));
	}

	public String longestCommonPrefix(String[] strs) {
		String publichand="";
		String lastchar="";
		char bufferchar;
		int len=strs.length;
		if(len==0){
			return "";
		}
		int sminlong=Integer.MAX_VALUE;
		for(int i=0;i<len;i++){
			if(sminlong>strs[i].length()){
				sminlong=strs[i].length();
			}            
		}
		for(int j=0;j<sminlong;j++){
			bufferchar=strs[0].charAt(j);
			for(int i=0;i<len;i++){
				if(bufferchar!=strs[i].charAt(j)){
					return publichand;    
				}
			}
			lastchar=String.valueOf(bufferchar);
			publichand+=lastchar;
		}
		return publichand;
	}


}
