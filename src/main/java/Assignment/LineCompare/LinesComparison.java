package Assignment.LineCompare;

public class LinesComparison {
	public static String compareLength(Double l1, Double l2) {
		int DIFF = l1.compareTo(l2);
		if(DIFF>0)
		{
			return "Length of first line is greater than second line";
		}
		else
			return "Length of first line is lesser than second line";
	}
}
