package com.ravishankarcode;

import java.io.IOException;
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
        // Step 1: Read JSON File to List Objects
        List<Customer> customers = ConvertJsonToExcel.readJsonFile2Objects("customer.json");
        
          // Step 2: Convert Java List Objects to JSON File
        try {
			ConvertJsonToExcel.writeObjects2ExcelFile(customers, "customers.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
