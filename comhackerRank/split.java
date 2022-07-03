package comhackerRank;


import java.util.*;
import java.io.*;

class split {
	
	int 
	
	int CountingMinutesI(String str) {
    String[] hours = str.split("-");
  
    int initialminutes = generateMinutes(hours[0]);
    int finalminutes = generateMinutes(hours[1]);
  
    int response = 0;
    if (startminutes < endminutes) {
         response = Endminutes - Startminutes;
    }
    else {
         answer = (24*60) - Startminutes + Endminutes;
    }
  
    return response;
  
  }
 
  int generateMinutes(String time) {
    int minutes = 0;
  
    String[] hourMinute = time.split(":");
  
    if (hourMinute[1].endsWith("am")) {
        minutes += 60 * Integer.parseInt(hourMinute[0]);
    }
    else {
        minutes += (60 * 12) + 60 * Integer.parseInt(hourMinute[0]);
    }
  
    minutes += Integer.parseInt(hourMinute[1].substring(0,2));
 
    return minutes;
  }
 
  public static void main(String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.CountingMinutesI(s.nextLine()));
  }
 
}