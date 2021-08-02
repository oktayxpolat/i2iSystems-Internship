package com.hazelcast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleGet {
    public static void main(String[] args) {

        try
        {
        	//Database connection
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161:XE","system", "oracle");
            Statement stmt = con.createStatement();
            
            //Select values
            long start = System.nanoTime();
            for(int i = 0; i < 100000; i++){
                ResultSet rs = stmt.executeQuery("SELECT num FROM NUMBERS");
                rs.next();
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