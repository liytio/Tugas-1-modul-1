import java.util.Scanner;

class LibrarySystem {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";
    private static boolean isAdminLoggedIn = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                loginAsStudent(scanner);
            } else if (choice == 2) {
                loginAsAdmin(scanner);
            } else if (choice == 3) {
                System.out.println("Exiting Library System...");
                break;
            } else {
                System.out.println("Invalid option! Please try again.");
            }
        }
        scanner.close();
    }

    private static void loginAsStudent(Scanner scanner) {
        System.out.print("Enter your NIM (15 characters): ");
        String nim = scanner.nextLine();

        if (nim.length() == 15) {
            System.out.println("Successful Login as Student");
            // Perform student operations here
        } else {
            System.out.println("Invalid NIM format! Please try again.");
        }
    }

    private static void loginAsAdmin(Scanner scanner) {
        while (true) {
            System.out.print("Enter your username (admin): ");
            String username = scanner.nextLine();

            System.out.print("Enter your password (admin): ");
            String password = scanner.nextLine();

            if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
                System.out.println("Successful Login as Admin");
                isAdminLoggedIn = true;
                break;
            } else {
                System.out.println("Invalid admin credentials! Please try again.");
            }
        }
    }
}