
package assignment5;

public class HolidayBonus {
	public static void main(String[] args) {

	    double[][] sales = {
	        {100, 200, 300},
	        {400, 500, 600},
	        {700, 800}
	    };

	    double[] bonuses = calculateHolidayBonus(sales);

	    for (int i = 0; i < bonuses.length; i++) {
	        System.out.println("Store " + i + " bonus: $" + bonuses[i]);
	    }

	    double total = calculateTotalHolidayBonus(sales);

	    System.out.println("Total Holiday Bonuses: $" + total);
	}
    private static final double HIGHEST_BONUS = 5000;
    private static final double LOWEST_BONUS = 1000;
    private static final double OTHER_BONUSES = 2000;

    public static double[] calculateHolidayBonus(double[][] sales) {

        double[] bonuses = new double[sales.length];

        int columns = 0;

        // Find the longest row
        for (int i = 0; i < sales.length; i++) {
            if (sales[i].length > columns) {
                columns = sales[i].length;
            }
        }

        // Go through each column
        for (int col = 0; col < columns; col++) {

            double highest = Double.NEGATIVE_INFINITY;
            double lowest = Double.POSITIVE_INFINITY;

            int highestRow = -1;
            int lowestRow = -1;
            int eligibleStores = 0;

            // Find highest and lowest sales
            for (int row = 0; row < sales.length; row++) {

                if (col < sales[row].length && sales[row][col] > 0) {

                    eligibleStores++;

                    if (sales[row][col] > highest) {
                        highest = sales[row][col];
                        highestRow = row;
                    }

                    if (sales[row][col] < lowest) {
                        lowest = sales[row][col];
                        lowestRow = row;
                    }
                }
            }

            // Calculate bonuses
            if (eligibleStores == 1) {
                bonuses[highestRow] += HIGHEST_BONUS;
            }

            else if (eligibleStores > 1) {

                for (int row = 0; row < sales.length; row++) {

                    if (col < sales[row].length && sales[row][col] > 0) {

                        if (row == highestRow) {
                            bonuses[row] += HIGHEST_BONUS;
                        }

                        else if (row == lowestRow) {
                            bonuses[row] += LOWEST_BONUS;
                        }

                        else {
                            bonuses[row] += OTHER_BONUSES;
                        }
                    }
                }
            }
        }

        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] sales) {

        double[] bonuses = calculateHolidayBonus(sales);

        double total = 0;

        for (int i = 0; i < bonuses.length; i++) {
            total += bonuses[i];
        }

        return total;
    }
}
