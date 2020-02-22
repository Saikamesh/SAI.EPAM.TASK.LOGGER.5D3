package EPAM.LOGGER.interest;
import EPAM.LOGGER.print.*;
public class simpleinterest {
	logger l=new logger();
	public void calculatesimpleinterest(int p,int t,double r)
	{
	double sinterest=(p*t*r)/100;
	l.printtxt("Simple Interest is: ");
	l.printdouble(sinterest);
	}
}
