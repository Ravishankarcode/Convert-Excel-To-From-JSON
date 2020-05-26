package com.ravishankarcode;

import java.util.List;

/**
 * 
 * @author Ravishankar.kumar
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Step 1: Read Excel File into Java List Objects
        List<Customer> customers = ConvertExcelToJson.readExcelFile("customers.xlsx");
        
        // Step 2: Convert Java Objects to JSON String
        String jsonString = ConvertExcelToJson.convertObjects2JsonString(customers);
        
        System.out.println(jsonString);
    }
}
