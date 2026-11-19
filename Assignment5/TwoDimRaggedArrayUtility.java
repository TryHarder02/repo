
/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Description: ()
 * Due: 11/18/2026
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: ____Melanie Castro ______
*/





package assignment5;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.PrintWriter;

import java.io.IOException;
public class TwoDimRaggedArrayUtility {

	public static double [][] readFile(File fileInput) throws IOException{
		
		
		Scanner scanner=new Scanner(fileInput);
		
		ArrayList<double[]>CompletedRows=new ArrayList<>();
		
		while(scanner.hasNextLine()) {
			
			String line= scanner.nextLine();
			if(line.trim().isEmpty()) {
			    continue;
			}
			String[] values = line.trim().split("\\\s+");	
			double[]row=new double[values.length];
			
		 
			
			for(int i=0; i<values.length; i++) {
				row[i] = Double.parseDouble(values[i]);
				
			}
			
			CompletedRows.add(row);
					
			
		}
		
		double[][] result= CompletedRows.toArray(new double[0][]);//assinged arraylist to a double in order to return it. 
	
		scanner.close();
		
	return result;
		
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws IOException {
		PrintWriter output= new PrintWriter(outputFile);
		
	for(int i=0; i<data.length; i++) {
		
		for(int j=0; j< data[i].length; j++) {
			output.print(data[i][j]);//writing to file
		
			if(j !=data[i].length-1) {
				
				output.print(" ");
			}
			
		}
		
		output.println();
	}
	output.close();

}
	
	public static double getTotal(double[][] data)
	{
		
		double total=0;
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length;j++) {
				total+= data[i][j];
			
			}
		}
			return total;
	
	}
	
	public static double getAverage(double[][] data) {
	double total=0;
		int count=0;
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				total+= data[i][j];
				count++;
			}
		}
				if(count==0) {
					return 0;
				}
				total= total/count;
	
		
		return total;
	
		}
		
		
	
	public static double getRowTotal(double[][] data, int rowIndex) {

	    double total = 0;

	    for (int j = 0; j < data[rowIndex].length; j++) {

	        total += data[rowIndex][j];

	    }

	    return total;
	}
	
	public static double getColumnTotal(double[][] data, int columnIndex) {

	    double total = 0;

	    for (int i = 0; i < data.length; i++) {

	        if (columnIndex < data[i].length) {

	            total += data[i][columnIndex];

	        }
	    }

	    return total;
	}
	
	
	public static double getHighestInRow(double[][]data, int rowIndex) {
	
		double highest = data[rowIndex][0];
		for(int i= 1;i<data[rowIndex].length; i++) {   //what is the biggest #
			
			if(data[rowIndex][i] > highest) {
			highest=data[rowIndex][i];
		
			}
			
			
		}
		
		return highest;
		
		
	}
	
	public static int getHighestInRowIndex(double[][] data, int rowIndex) {
		
		int highestIndex=0;
		//where is the biggest number 
		
		for(int i=0; i<data[rowIndex].length; i++) {
			
			if (data[rowIndex][i] > data[rowIndex][highestIndex]) {
				highestIndex=i;
			}
		}
			return highestIndex;
			}
		
		
		
	
		public static double getLowestInRow(double[][]data, int rowIndex) {
			
			double lowest = data [rowIndex] [0];
			for(int i=1; i<data[rowIndex].length;i++) {
				
				if(data[rowIndex][i]< lowest) {
			lowest=data [rowIndex][i];//what is the lowest #
					
				
				}
				
				
			}
			return lowest;
			
		}
		
		
	public static int getLowestInRowIndex(double[][]data, int rowIndex) {
			
			int lowestRowIndex=0;//where is the lowest # 
			
			for(int i=1; i<data[rowIndex].length; i++ ) {
				
				if(data[rowIndex][i] < data[rowIndex][lowestRowIndex]) {
					lowestRowIndex= i;
				
				}
				
			}
			
			return lowestRowIndex;
		
		}
	
		
	public static double getHighestInColumn(double[][] data, int columnIndex) {

	    double highest = 0;
	    boolean found = false;

	    for(int i = 0; i < data.length; i++) {

	        if(columnIndex < data[i].length) {

	            if(!found || data[i][columnIndex] > highest) {
	                highest = data[i][columnIndex];
	                found = true;
	            }
	        }
	    }

	    return highest;
	}
			
		public static int getHighestInColumnIndex(double[][] data, int columnIndex) {

		    int highest = -1;

		    for(int i = 0; i < data.length; i++) {

		        if(columnIndex < data[i].length) {

		            if(highest == -1 || data[i][columnIndex] > data[highest][columnIndex]) {
		                highest = i;
		            }
		        }
		    }

		    return highest;
		}
			
		public static double getLowestInColumn(double[][] data, int columnIndex) {

		    double lowest = 0;
		    boolean found = false;

		    for(int i = 0; i < data.length; i++) {

		        if(columnIndex < data[i].length) {

		            if(!found || data[i][columnIndex] < lowest) {
		                lowest = data[i][columnIndex];
		                found = true;
		            }
		        }
		    }

		    return lowest;
		}
		
			public static int getLowestInColumnIndex(double[][] data, int columnIndex) {

			    int lowest = -1;

			    for(int i = 0; i < data.length; i++) {

			        if(columnIndex < data[i].length) {

			            if(lowest == -1 || data[i][columnIndex] < data[lowest][columnIndex]) {
			                lowest = i;
			            }
			        }
			    }

			    return lowest;
			}
		public static double getHighestInArray(double [][] data) {
			double  highest=0;
			boolean found=false;
			for(int i=0; i<data.length;i++) {
				
				for(int j=0; j < data[i].length;j++) {
					
					  if(!found || data[i][j] > highest) {
			                highest = data[i][j];
			                found = true;
			            }
			        }
					
				}
			
				return highest;
				
			}
			
			
			
			
			
		
		public static double getLowestInArray(double [][] data) {
			double  lowest=0;
			boolean found=false;
			for(int i=0; i<data.length;i++) {
				
				for(int j=0; j < data[i].length;j++) {
					
					  if(!found || data[i][j] < lowest) {
			                lowest = data[i][j];
			                found = true;
			            }
			        }
					
				}
			
				return lowest;
				
			}
	
	
	
	
	
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	









