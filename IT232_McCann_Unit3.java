import java.util.*;
public class IT232_McCann_Unit3 {
	public static void main(String[] args) {
		
		//*********************************************************
		//****Assignment 3 Section 1
		//*********************************************************
		
		//create a two-dimensional String array of 4x4 elements named salesRegions
		String[][] salesRegions;
		salesRegions = new String[4][4];
		
		//Food for programming thought: Unlike in a spreadsheet where cells are referenced by ColumnID then RowID,
		//Two-dimensional array indices reference row first followed by column index.
		//The reason is that this two-dimensional array can be thought of as an array of arrays.
		//***Note: Because of this, the code below will transpose the table given in the assignment instructions.
		//This ways each row, ("array within an array") will group the data for a single region.
		//Often times it does not matter if you address items in an array as rows/columns or columns/rows as long as you are consistent.
		//However, in some languages, such as JavaScript, the arrays within an array concept is more obvious and treating each 
		//inner array as  grouping of common data can make more sense.
		//See the JavaScript example of this program.
		
		//populate the array with names of sales regions in column 1
		salesRegions[0][0] = "North";
		salesRegions[1][0] = "South";
		salesRegions[2][0] = "East";
		salesRegions[3][0] = "West";
		
		//populate the array with names of personnel in charge of those sales regions in columns 2,3,4
		salesRegions[0][1] = "Bob";
		salesRegions[0][2] = "Stef";
		salesRegions[0][3] = "Ron";
		
		salesRegions[1][1] = "Sue";
		salesRegions[1][2] = "Janice";
		salesRegions[1][3] = "Will";

		salesRegions[2][1] = "Nathan";
		salesRegions[2][2] = "Henry";
		salesRegions[2][3] = "Kimmy";
	
		salesRegions[3][1] = "Wanda";
		salesRegions[3][2] = "Charles";
		salesRegions[3][3] = "Pete";
			
		System.out.println("Section 1: Two-dimensional Array.");
		
		//using nested loops, display the contents of the array by sales region
		
		for(int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				System.out.println(salesRegions[row][col]);
			}
			System.out.println("");
		}
		
		//*********************************************************
		//****Assignment 3 Section 2
		//*********************************************************
		
		//create an arraylist called salesTeam. ArrayList is part of System.Collections
		ArrayList<String> salesTeam = new ArrayList<String>();
		
		//use the two-dimensional array to add the names in the North region (first column in the table but first row in this array) to the salesTeam arraylist
		
		for(int col = 1; col < 4; col++) {
			salesTeam.add(salesRegions[0][col]);
		}
		
		System.out.println("Section 2: Array List.");
		System.out.println("");
		
		//display the current number of element in the salesTeam arrayList
		System.out.println("There are " + salesTeam.size() + " names in the salesTeam arraylist.");
		
		//add the names of the people from the South region to the salesTeam arraylist
		
		for(int col = 1; col < 4; col++) {
			salesTeam.add(salesRegions[1][col]);
		}
		System.out.println("");
		
		//check to see if "Stef" is in the salesTeam arraylist
		
		if (salesTeam.contains("stef")) {
			System.out.println("Stef is in the salesTeam arraylist.");
		}	
		else {
			System.out.println("Stef is not in the salesTeam arraylist");
		}
		
		//display the number of items in the salesTeam arraylist
		System.out.println("There are " + salesTeam.size() + " name in the salesTeam arraylist");
		
		//remove Janice and Ron from the salesTeam arraylist
		salesTeam.remove("Janice");
		salesTeam.remove("Ron");
		
		//display the number of items in the salesTeam araylist
		System.out.println("There are " + salesTeam.size() + " name in the salesTeam arraylist.");
		//display the number of items in the salesTeam arraylist
		System.out.println("Names currently in the salesTeam arraylist:");
		
		//use a loop to display all the elements remaining in the salesTeam arraylist
		for(int i = 0; i < salesTeam.size(); i++) {
			System.out.println(salesTeam.get(i));
		}
		
		
		
		
		
		
	}
}
	


