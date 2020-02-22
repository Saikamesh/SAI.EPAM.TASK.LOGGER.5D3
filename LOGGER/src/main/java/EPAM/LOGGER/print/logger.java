package EPAM.LOGGER.print;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class logger {
	private static Logger LOGGER=LogManager.getLogger(logger.class);
public void printtxt(String text)
{
	LOGGER.info(text);
	
}
public void printint(int number)
{
	LOGGER.info(number);
}
public void printdouble(double number)
{
	LOGGER.info(number);
}
}
