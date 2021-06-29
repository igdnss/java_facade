package com.research.se.brother;

public class Brother {
	public static void main(String[] args) {
		Disinfector disinfector = new Disinfector();
		Anaesthetist anaesthetist = new Anaesthetist();
		Cutter cutter = new Cutter();
		Wrapper wrapper = new Wrapper();
		disinfector.disinfect();
		anaesthetist.anaesthesia();
		cutter.cut();
		wrapper.wrap();
	}
}
