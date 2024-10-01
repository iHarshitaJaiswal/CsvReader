package project3;

import java.util.Arrays;
import java.util.Scanner;


public class cli {

	public static void options(int ch, Scanner sc) 
	{
		try {
		 switch (ch) 
		 {
         case 1:
             System.out.print("Enter the column heading: ");
             String columnHeading = sc.nextLine();
             fetchColumn(columnHeading);
             break;

         case 2:
             System.out.print("Enter the row number : ");
             int rowNumber = sc.nextInt();
             fetchRow(rowNumber);             
             break;

         case 3:
        	 System.out.println("Program Exited!");
 			 project3.flag=false;
 			break;
 			
         default:
             System.out.println("Invalid choice. Please try again.");
     }
		
		} catch (Exception e) {
            System.err.println("An error occurred while processing your request: " + e.getMessage());
        }
	}

	private static void fetchRow(int rowNum) 
	{
		if (rowNum < 1 || rowNum > project3.data.size()) 
		{
            System.out.println("Invalid row number.");
        } else {
		System.out.print("Data in row " + rowNum + ": ");
//        System.out.println(Arrays.toString(project3.data.get(rowNum - 1)));
		String[] row = project3.data.get(rowNum - 1);
		for (String value : row) {
		    System.out.print(value + " ");
		}
		System.out.println();
        }
		
	}

	private static void fetchColumn(String columnHeading) 
	{
		int colIndex = -1;
        for (int i = 0; i < project3.headers.length; i++) 
        {
            if (project3.headers[i].equalsIgnoreCase(columnHeading)) 
            {
                colIndex = i;
                break;
            }
        }
        if (colIndex == -1) 
        {
            System.out.println("Invalid column heading.");
        } 
        else 
        {
            System.out.println("Data under column " + columnHeading + ":");
            int rowCount = 0;
            for (String[] row : project3.data) 
            {
                if (colIndex < row.length) 
                {
                    System.out.println(row[colIndex]);
                    rowCount++;
                }
            }
            System.out.println("Number of rows: " + rowCount);
	}
        
}
}
