package com.csv;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
	
 private static final String SAMPLE_CSV_FILE_PATH = "F:\\Users\\sumit\\eclipse-workspace\\CsvDemo\\lib\\src\\main\\resources\\demofile.csv";
	
	public static void  main(String[] args)  {
		
		 String nextRecord = "";

		try {
			BufferedReader reader = new BufferedReader(new FileReader(SAMPLE_CSV_FILE_PATH));
			
			while((nextRecord = reader.readLine()) != null) {
				
				String[] nextValue = nextRecord.split(",");
				
				//print one person data in single line
				//System.out.println(" name : " + nextValue[0] +" email : " + nextValue[1] +" phone : " + nextValue[2] +" country : " + nextValue[3]);
				
				//print one person data in four line
				System.out.println(" firstname : " + nextValue[0]);
				System.out.println(" lastname : " + nextValue[1]);
				System.out.println(" mob no : " + nextValue[2]);
				System.out.println(" city : " + nextValue[3]);
				System.out.println(" state : " + nextValue[4]);
				System.out.println(" zip : " + nextValue[5]);
				System.out.println(" email : " + nextValue[6]);
				System.out.println("  ");

				//break;
				
				//print data like in csv files
				//System.out.println(nextRecord);
				}			
		} catch  (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

