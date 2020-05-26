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
        
          // Step 2: Write Java List Objects to JSON File
        ConvertExcelToJson.writeObjects2JsonFile(customers, "customers.json");

    }
}
