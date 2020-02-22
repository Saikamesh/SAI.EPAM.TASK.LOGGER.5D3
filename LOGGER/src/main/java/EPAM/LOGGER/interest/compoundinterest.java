package EPAM.LOGGER.interest;
import EPAM.LOGGER.print.*;
public class compoundinterest {
	logger l=new logger();
	 public void calculate(int p, int t, double r, int n) 
		{
		
	        double amount = p * Math.pow(1 + (r / n),n * t);
	        double cinterest = amount - p;	     
	       l.printtxt("Compound Interest after");
	       l.printint(t);
	       l.printtxt("years:");
	       l.printdouble(cinterest);
	       l.printtxt("Amount after");
	       l.printint(t);
	       l.printtxt("years:");
	       l.printdouble(amount);
	    }

}
