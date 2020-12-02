package com.khunaungpaing.ass9;

public class Ass9 {

	public static void main(String[] args) {
		int depthOfPit=30;
		Frog frog = new Frog();
		frog.jump(depthOfPit);
		System.out.println(frog.totalJumps());
	}
}
