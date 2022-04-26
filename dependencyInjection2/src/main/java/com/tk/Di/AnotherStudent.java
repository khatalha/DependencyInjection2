package com.tk.Di;

public class AnotherStudent {
	
	private MathCheat chit;
		
		public void setChit(MathCheat chit) {
			this.chit = chit;
		}
	
		public void startCheating()
		{
			chit.mathCheat();
		}


}
