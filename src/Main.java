public class Main {
    public static void main(String[] args) {
        int [] sale = new int[] {250, 600, 150, 40};
        SalesManager salesManager = new SalesManager(sale);
        int max = salesManager.max();

        System.out.println(max);

    }
}
