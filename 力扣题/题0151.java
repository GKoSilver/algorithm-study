package 力扣题;

import java.util.ArrayList;
import java.util.Arrays;

public class 题0151 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0151 test = new 题0151();
		String s = "  hello world!  ";
		System.out.println("\"" + test.reverseWords(s) + "\"");
	}

	public String reverseWords(String s) {
		ArrayList<String> rs = new ArrayList<String>(Arrays.asList(s.split(" ")));
		String new_rs = "";
		for (int i = rs.size() - 1; i >= 0; i--) {
			if (rs.get(i).equals("")) {
				rs.remove(i);
			}
		}
		if (rs.size() == 0) {
			return "";
		}
		for (int i = rs.size() - 1; i > 0; i--) {
			new_rs += rs.get(i) + " ";
		}
		new_rs += rs.get(0);
		return new_rs;

	}

}
