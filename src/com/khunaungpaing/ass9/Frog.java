package com.khunaungpaing.ass9;

public class Frog {
	private int totalJumps = 0;
	private int jumpHeight = 3;
	private int downBack = 2;

	public void jump(int height) {
		int temp = height;
		
		if (temp>=jumpHeight) {
			while (jumpHeight <= temp) {
				totalJumps++;
				temp -= jumpHeight;
				temp += downBack;
			} 
		}else if(temp==0) {
			return;
		}
		else
			totalJumps++;
		}

	public int totalJumps() {
		return this.totalJumps;
	}

}
