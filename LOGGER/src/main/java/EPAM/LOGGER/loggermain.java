package EPAM.LOGGER;
import EPAM.LOGGER.interest.*;
import EPAM.LOGGER.Houseconstruction.*;
import java.util.Scanner;
import EPAM.LOGGER.print.logger;
public class loggermain {
	
	public static void main(String[] args)
	{
		logger l=new logger();
		l.printtxt("Welcome to clean code");
		l.printtxt("Select A Program for Execution :");
		l.printtxt("1. Calculate Simple Interest/Compound Interest");
		l.printtxt("2. Calculate the Cost For Construction of a House");
		Scanner scan=new Scanner(System.in);
		int Programchoice=scan.nextInt();
		if((0 < Programchoice) &&(Programchoice < 3))
		{
		switch(Programchoice)
			{
			case 1:
				interest i=new interest();
				i.selectinterest();
				i.operations();
				break;
			case 2:
				construction c=new construction();
				c.materialtype();
				c.calculatecost();
				break;
			}
		scan.close();
		}
		else
		{
			l.printtxt("You Have Choosen Invalid Input");
			l.printtxt("Try Executing the Program Again!! From the BEGIN with a Valid Input");
		}
		
	}

}
