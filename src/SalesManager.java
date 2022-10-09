public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int average() {
        int average = 0;
        int max = 0;
        int min = 0;

        for (int sale : sales) {

            if (sale > max) {
                max = sale;
            } else if (sale < max || sale < min) {
                min = sale;
            }
            average = average + sale;
        }
        average = (average - max - min) / (sales.length - 2);
        return average;
    }
}
