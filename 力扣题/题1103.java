package 力扣题;

public class 题1103 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题1103 test=new 题1103();
		int candies=10;
		int num_people=3;
		int []peoples_candies=test.distributeCandies(candies, num_people);
		for(int i:peoples_candies) {
			System.out.println(i);
		}
	}
    public int[] distributeCandies(int candies, int num_people) {
    	int []peoples_candies=new int[num_people];
    	int get_candies=1;
    	boolean flag=true;
    	while(flag) {
    		for(int i=0;i<num_people;i++) {
    			if(candies>get_candies) {
    				peoples_candies[i]+=get_candies;
    				candies-=get_candies;
    				get_candies++;
    			}else {
    				peoples_candies[i]+=candies;
    				flag=false;
    				break;
    			}
    			
    		}
    	}
		return peoples_candies;

    }

}
