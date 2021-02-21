/**
 * (Convert milliseconds to hours, minutes, and seconds)

Write a method that converts milliseconds to hours, minutes, and seconds using the following header:

public static String convertMillis(long millis)

The method returns a string as hours:minutes:seconds.

For example,

convertMillis(5500) returns a string 0:0:5,
convertMillis(100000) returns a string 0:1:40
convertMillis(555550000) returns a string 154:19:10.

Write a test program that prompts the user to enter a long integer for milliseconds and displays a string in the format of hours:minutes:seconds.

﻿
﻿Sample Run
﻿
﻿Enter time in milliseconds: 555550000
154:19:10

Class Name: Exercise06_25
 */

import java.util.Scanner;

public class Exercise06_25 {

	public static void main(String[] args) {
		//scanner object
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter time in millisends: ");
		long time = input.nextLong();
		
		//System.out.println(System.currentTimeMillis());
		
		String hours = (convertMillis(time));
		
		System.out.println(hours);

	}
	
	public static String convertMillis(long milliseconds) {
				
		// Obtain the total seconds since the midnight, Jan 1, 1970
		long totalSeconds = (milliseconds) /1000;
		
		// Compute the current second in the minute in the hour
		long seconds =  totalSeconds % 60;
		
		//total minutes 
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour
		long minutes = totalMinutes % 60;
		
		//total hours are in the total number of mins
		long totalHours = totalMinutes / 60;
		
		
		return totalHours + ":"+ minutes + ":" + seconds; 
	}

}
