package com.hazelcast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

public class OracleSend {
    public static void main(String[] args) {

        try
        {
        	//Database Connection
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161:XE","system","oracle");
            Statement stmt = connection.createStatement();
            
            //Inserting random nummbers
            Random rnd= new Random();
            long start = System.nanoTime();
            for(int i = 0; i < 100000; i++){
                stmt.executeUpdate("INSERT INTO NUMBERS(num) VALUES("+rnd.nextInt(100000)+")");
            }
            
            //Calculate execution time
            CalculateTime time=new CalculateTime();
            time.calculateTime(start);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}