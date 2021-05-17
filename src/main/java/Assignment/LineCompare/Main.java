package Assignment.LineCompare;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Main {
	private static final Logger LOG = LogManager.getLogger(Main.class);
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation program");
		LineLength len = new LineLength();
		Double l1=len.length(9.8, 9.8, 1.8, 1.8);
		Double l2=len.length(20.5, 20.5, 2.9, 2.9);
		CheckLineEquality equality = new CheckLineEquality();
		Boolean boolvalue = equality.equality(l1, l2);
		if(boolvalue.booleanValue()==false) {
			LinesComparison lines = new LinesComparison();
			String s = lines.compareLength(l1, l2);
			LOG.debug(s);
		}
		else {
			LOG.debug("both lines are equal");
		}
		
		
	}

}
