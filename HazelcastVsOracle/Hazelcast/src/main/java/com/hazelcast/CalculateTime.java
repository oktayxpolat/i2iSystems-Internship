package com.hazelcast;

public class CalculateTime {
	//Execution time calculation method
	public void calculateTime(long start) {
		long elapsedTime = System.nanoTime() - start;
		double seconds = (double)elapsedTime / 1000000000.0;
		System.out.println(seconds);
	}
}