
/**
 * Write a description of TESTDATE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.*;
import java.util.*;
public class TESTDATE {
public static void main() throws Exception {
    

  ArrayList<Date> date=new ArrayList<>();
  SimpleDateFormat f=new SimpleDateFormat("dd-MM-yyyy");
  Date date1=f.parse("02--1-2001");
  Date date2=f.parse("32-12-1999");
  Date date3=f.parse("13-11-2016");
  date.add(date1);
  date.add(date2);
  date.add(date3);
  Collections.sort(date);
 
  for (int i = 0; i < date.size();  i++)
    System.out.println(f.format(date.get(i)));
}

}


