package project3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class project3  
{
	public static boolean flag=true;
	public static String[] headers= null;
	public static List<String[]> data= new ArrayList<>();;
    
    public static void main(String[] args) throws Exception 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();
        File_crud.readData(filePath);
        while (flag) {
            System.out.println("\nOptions:");
            System.out.println("1. Enter a column heading to display the entire column.");
            System.out.println("2. Enter a row number to display the entire row.");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); 
            cli.options(ch, sc);

           
        }
    }
}
