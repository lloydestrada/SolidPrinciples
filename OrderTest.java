public class OrderTest {
    public static void main(String[] args) {
        TotalCalculator orderCalculator = new TotalCalculation();
        OrderPlacer orderPlacer = new OrderPlacement();
        InvoiceGenerator invoiceGenerator = new InvoiceGeneratorImpl();
        EmailNotifier emailNotifier = new EmailNotification();

        double total = orderCalculator.calculateTotal(600, 12);
        orderPlacer.placeOrder("John Lloyd Estrada", "245 ABCDE St");
        invoiceGenerator.generateInvoice("Orders.docx");
        emailNotifier.sendEmailNotification("mynameislloyd@gmail.com");
    }
}