package com.exilant.js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTest01 {

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager engineManager=new ScriptEngineManager();
		ScriptEngine nashorn=engineManager.getEngineByName("nashorn");
		String name="vamsi";
		Integer result=null;
		nashorn.eval("print('"+name+"')");
		result=(Integer)nashorn.eval("10+20");
		System.out.println("Result :"+result);
	}

}
