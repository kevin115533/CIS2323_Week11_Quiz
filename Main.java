import Horse.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] ars){
	
	RaceHorse user = new RaceHorse();
	
	user.setName("Kevin");
	user.setColor("Black");
	user.setYear(1991);
	user.setRaces(27);
	
	System.out.println("Horse name: " + user.getName());
	System.out.println("Horse color: " + user.getColor());
	System.out.println("Horse Birthdate: " + user.getYear());
	System.out.println("Races won: " + user.getRaces());
	}
}