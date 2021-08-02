package com.hazelcast;


import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

import java.util.Random;

public class Member {
	  public static void main(String[] args) {
		//Create instance
		  HazelcastInstance instance = Hazelcast.newHazelcastInstance();
		  IMap<Object,Object> map = instance.getMap("map");
		  
		//Put values
		  Random rand = new Random();
		  long start = System.nanoTime();
		  for (int i =0; i < 20000; i++){
		      map.put(i,rand.nextInt(100000));
		  }
		  
		//Calculate time
	      CalculateTime time=new CalculateTime();
	      time.calculateTime(start);
		
	  }
}