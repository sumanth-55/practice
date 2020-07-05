package com.practice;
import java.util.*;
public class BirthDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String month = sc.next();
        String day = sc.next();
        String year = sc.next();
        sc.close();
        Calendar c = Calendar.getInstance(); 
        c.set(Integer.parseInt(year), Integer.parseInt(month)-1,Integer.parseInt(day));
        String dayOfWeek =DayOfWeek(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(dayOfWeek.toUpperCase() );
    }
    
    private static String DayOfWeek(int value){
    String day = "";
    switch(value){
    case 1:
        day="Sunday";
        break;
    case 2:
        day="Monday";
        break;
    case 3:
        day="Tuesday";
        break;
    case 4:
        day="Wednesday";
        break;
    case 5:
        day="Thursday";
        break;
    case 6:
        day="Friday";
        break;
    case 7:
        day="Saturday";
        break;
    }
    return day;
    }    
}