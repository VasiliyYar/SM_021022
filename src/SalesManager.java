public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {

        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long average() {
        long average = 0;
        long max = 0;
        long min = 0;

        for (long sale : sales) {

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
