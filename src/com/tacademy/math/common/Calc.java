package com.tacademy.math.common;

import com.tacademy.math.vo.Data;

public class Calc {
	
	public Calc() {
		// TODO Auto-generated constructor stub
	}
	public void doCalc(Data data){
		switch (data.getOpt()) {
		case "+":
			data.setResult(data.getNum1() + data.getNum2());
			break;
		case "-":
			data.setResult(data.getNum1() - data.getNum2());
			break;
		case "*":
			data.setResult(data.getNum1() * data.getNum2());
			break;
		case "/":
			data.setResult(data.getNum1() / data.getNum2());
			break;
		}
	}
}
