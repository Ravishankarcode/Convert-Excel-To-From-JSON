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
        String jsonStr = "[{\"id\":\"1\",\"name\":\"Ravishankar Kumar\",\"address\":\"Bangalore\",\"age\":32},{\"id\":\"2\",\"name\":\"Chulbul Yadav\",\"address\":\"Motihari\",\"age\":27},{\"id\":\"3\",\"name\":\"Mirchae Devi\",\"address\":\"Buxcer\",\"age\":26},{\"id\":\"4\",\"name\":\"Deepak Jha\",\"address\":\"Mithila\",\"age\":33},{\"id\":\"5\",\"name\":\"Shilpa Rani\",\"address\":\"Nala Road\",\"age\":36}]";
        
        List<Customer> customers = ConvertJsonToExcel.convertJsonString2Objects(jsonStr);
        
          // Step 2: Convert Java List Objects to JSON File
        try {
			ConvertJsonToExcel.writeObjects2ExcelFile(customers, "customers.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
