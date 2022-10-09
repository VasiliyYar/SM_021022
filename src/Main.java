public class Main {
    public static void main(String[] args) {
        long[] sale = new long[]{250, 600, 150, 40};
        SalesManager salesManager = new SalesManager(sale);

        long max = salesManager.max();
        long average = salesManager.average();


        System.out.println(max);
        System.out.println(average);

    }
}
