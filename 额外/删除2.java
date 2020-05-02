package 额外;

import java.util.List;
import java.util.Vector;

public class 删除2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n=5;
		int a=0;
		List<Object> l=new Vector<Object>();
		for(int i=0;i<n;i++) {
			l.add(i);
		}		
		while(l.size()>1) {
			if(l.size()==1) {
				break;
			}
			if(a>=n) {
				a=a-n;
//				System.out.print("test1");
			}
			if((a==2||(a-2)%3==0)&&a<l.size()) {
				l.remove(a);
				n--;
//				System.out.print("test2");
			}
			a++;
		}
		System.out.print(l);
		
		
	}

}
