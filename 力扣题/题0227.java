package 力扣题;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class 题0227 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0227 test = new 题0227();
		String s = "14/3*2";
		System.out.println(test.calculate(s));
	}

	public int calculate(String s) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
		try {
			return Double.valueOf(String.valueOf(scriptEngine.eval(s))).intValue();
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (ScriptException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return 0;

	}

}
