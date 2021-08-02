package com.hazelcast;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class Client {
    public static void main(String[] args) throws InterruptedException {
    	//Create instance
        HazelcastInstance client = HazelcastClient.newHazelcastClient();
        IMap<Object,Object> map = client.getMap("map");
        
        //Get values
        int i = 0;
        long start = System.nanoTime();
        while(i<20000){
            map.get(i);
            i++;}
        
        //Calculate execution time
        CalculateTime time=new CalculateTime();
        time.calculateTime(start);
    }
}