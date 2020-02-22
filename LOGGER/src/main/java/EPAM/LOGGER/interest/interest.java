package EPAM.LOGGER.interest;
import EPAM.LOGGER.print.logger;
import java.util.Scanner;
public class interest {
	logger l=new logger();
	 int choice,principleamount,time,n;
	 //n is the number of times that interest is compounded per time t
	double rate;
	
	Scanner s=new Scanner(System.in);
	simpleinterest si=new simpleinterest();
	compoundinterest ci=new compoundinterest();
		public void selectinterest()
	{
		l.printtxt("Enter Your choice to calcuate interest :");
		l.printtxt("1. Simple Interest");
		l.printtxt("2. Compound Interest");
		choice =s.nextInt();
	}
		public void operations()
		{if((0<choice)&&(choice<3)) {
		switch(choice)
		{
		case 1:
			l.printtxt("Enter Principle Amount");
			principleamount=s.nextInt();
			l.printtxt("Enter rate of interest :");
			rate=s.nextDouble();
			l.printtxt("Enter time period :");
			time=s.nextInt();
			si.calculatesimpleinterest(principleamount, time, rate);
			break;
		case 2:
			l.printtxt("Enter Principle Amount");
			principleamount=s.nextInt();
			l.printtxt("Enter rate of interest (%) :");
			rate=s.nextDouble();
			l.printtxt("Enter Number of time period Elapsed :");
			time=s.nextInt();
			l.printtxt("Enter number of times that interest applied per time period");
			n=s.nextInt();
			ci.calculate(principleamount, time, rate, n);
			break;
		}
	}
		else
		{
			l.printtxt("You Have Choosen Invalid Input");
			l.printtxt("Try Executing the Program Again!! From the BEGIN with a Valid Input");
		}
}
}
