public class ConsoleSales extends Console {
    
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }
    
    public void printReport() {
        System.out.println("\n========== CONSOLE SALES REPORT ==========");
        System.out.println("Console Type : " + getConsoleType());
        System.out.println("Store Name   : " + getStore());
        System.out.println("Total Sales  : " + getTotalSales());
        System.out.println("==========================================\n");
    }
}