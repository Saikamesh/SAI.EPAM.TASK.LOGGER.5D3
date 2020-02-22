package EPAM.LOGGER.Houseconstruction;
import java.util.Scanner;
import EPAM.LOGGER.print.logger;
public class construction {
	static int materialtype;
	int area,cost;
	Scanner sc=new Scanner(System.in);
	logger l=new logger();
	public void materialtype()
	{
		l.printtxt("Select the type of material for construction");
		l.printtxt("----------Material Type----------");
		l.printtxt("1. Standard Material");
		l.printtxt("2. Above Standard Material");
		l.printtxt("3. High Standard Material");
		l.printtxt("4. High Standard Material & Fully Automated Home");
		l.printtxt("-------------------------------");
		l.printtxt("Note: Fully Automated Home Option is only Available for High Standard Material");
		materialtype=sc.nextInt();
	}
	public void calculatecost()
	{
		if((0<materialtype)&&(materialtype<5)) 
		{
		switch(materialtype)
		{
		case 1:
			l.printtxt("Enter the Area of House in Sq.ft's :");
		area=sc.nextInt();
		l.printtxt("-----cost for the construction of the House-----");
		l.printtxt("Material Type: Standard");
		l.printtxt("Housing Area in sq.ft's: "+area);
		cost=area*1200;
		l.printint(cost);
		l.printtxt("INR only/-");
		break;
	case 2:
		l.printtxt("Enter the Area of House in Sq.ft's :");
		area=sc.nextInt();
		l.printtxt("-----cost for the construction of the House-----");
		l.printtxt("Material Type: Above Standard");
		l.printtxt("Housing Area in sq.ft's: "+area);
		cost=area*1500;
		l.printint(cost);
		l.printtxt("INR only/-");
		break;
	case 3:
		l.printtxt("Enter the Area of House in Sq.ft's :");
		area=sc.nextInt();
		l.printtxt("-----cost for the construction of the House-----");
		l.printtxt("Material Type: High Standard");
		l.printtxt("Housing Area in sq.ft's: "+area);
		cost=area*1800;
		l.printint(cost);
		l.printtxt("INR only/-");
		break;
	case 4:
		l.printtxt("Enter the Area of House in Sq.ft's :");
		area=sc.nextInt();
		l.printtxt("-----cost for the construction of the House-----");
		l.printtxt("Material Type: High Standard(FUllY AUTOMATED)");
		l.printtxt("Housing Area in sq.ft's: "+area);
		cost=area*2500;
		l.printint(cost);
		l.printtxt("INR only/-");
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
