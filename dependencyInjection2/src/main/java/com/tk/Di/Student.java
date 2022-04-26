package com.tk.Di;

public class Student {
	
private MathCheat chit;
	
	public void setChit(MathCheat chit) {
		this.chit = chit;
	}

	public void cheating()
	{
		chit.mathCheat();
	}

}
