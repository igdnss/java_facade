package com.research.se.himself;

import com.research.se.brother.Anaesthetist;
import com.research.se.brother.Cutter;
import com.research.se.brother.Disinfector;
import com.research.se.brother.Wrapper;

public class MainDoctor {
	Disinfector disinfector = new Disinfector();
	Anaesthetist anaesthetist = new Anaesthetist();
	Cutter cutter = new Cutter();
	Wrapper wrapper = new Wrapper();

	public void operation() {
		disinfector.disinfect();
		anaesthetist.anaesthesia();
		cutter.cut();
		wrapper.wrap();
	}

}
