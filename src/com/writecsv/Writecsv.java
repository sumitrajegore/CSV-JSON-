package com.writecsv;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
public class Writecsv {

	public static void main(String[] args) {
		
		String FilePath = "F:\\Users\\sumit\\eclipse-workspace\\CSV\\src\\com\\writecsv\\Write.csv";
		Write(FilePath);
		System.out.print(FilePath);
	}
	public static void Write(String filePath) {
		
		List<Employee> employeelist = new ArrayList<Employee>();
		
		Employee emp2 = new Employee();
		emp2.setId(202);
		emp2.setName("patil");
		employeelist.add(emp2);
		
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("raje");
		employeelist.add(emp1);
		
		
		
		FileWriter filewriter = null;
		try {
			filewriter = new FileWriter(filePath);
			filewriter.append("empid,empname");
			filewriter.append("\n");
			   
			for (Employee employee : employeelist ) {
				
				filewriter.append(String.valueOf(employee.getId()));
				filewriter.append(",");
				filewriter.append(employee.getName());
				filewriter.append("\n");

		    }
			
  		} catch (Exception e) { 
  			
  			e.printStackTrace();
			
		} finally {
			
			try {
				
				filewriter.flush();
				filewriter.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}		
	}
}
