import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class Test {

	public static void main(String[] args)  { 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date in DD-MM-YYYY format");
		String a;
		try {
			a = br.readLine();
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			//user date
			LocalDate ob1=LocalDate.parse(a, dtf);
			//current date
			LocalDate ob2=LocalDate.now();
			int years=Period.between(ob1, ob2).getYears();
			int months=Period.between(ob1, ob2).getMonths();
			int days=Period.between(ob1, ob2).getDays();
			System.out.println("Its been "+years+" years, "+months+" months, "+days+" and days since you have born");
			/*
			System.out.println("Years passed : "+years);
			System.out.println("Months passed : "+months);
			System.out.println("Days passed : "+days);
			*/
			
		} 
		catch (Exception e) 
		{
			
			System.out.println("Enter  the date in valid format");
		}
		
		

	}

}
