package hr.fer.zemris.java.tecaj.hw5.db.comparisons;

/**
 * This class represents a less than or equals operator "<=".
 * 
 * @author Petra Rebernjak - 0036472203
 *
 */
public class LessThanOrEqualsCondition implements IComparisonOperator {

	@Override
	public boolean satisfied(String value1, String value2) {
		int result = value1.compareTo(value2);
		return result <= 0;
	}

}
