import java.util.Scanner;

public class RunApplication {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("========== ELECTRONICS STORE ==========");
            System.out.println("Available Console Devices:");
            System.out.println("1. PlayStation 5");
            System.out.println("2. Xbox Series X");
            System.out.println("3. Nintendo Switch");
            System.out.println("4. PlayStation 4");
            System.out.println("5. Xbox One");
            System.out.println("========================================");
            
            System.out.print("Select a console device type (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            String consoleType;
            consoleType = switch (choice) {
                case 1 -> "PlayStation 5";
                case 2 -> "Xbox Series X";
                case 3 -> "Nintendo Switch";
                case 4 -> "PlayStation 4";
                case 5 -> "Xbox One";
                default -> "Unknown Console";
            };
            
            System.out.print("Enter store name: ");
            String storeName = scanner.nextLine();
            
            System.out.print("Enter total amount of sales: ");
            int totalSales = scanner.nextInt();
            
            ConsoleSales sales = new ConsoleSales(consoleType, storeName, totalSales);
            sales.printReport();
        }
    }
}