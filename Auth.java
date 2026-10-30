import java.util.Scanner;

public class Auth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final String LOGIN = "admin";
        final String PASSWORD = "Java2026";

        System.out.println("Enter login: ");
        String login = sc.nextLine();

        System.out.println("Enter password: ");
        String password = sc.nextLine();

        int attemptsLeft = 2;

        if(!login.equals(LOGIN) || !password.equals(PASSWORD)) {
            for (int i = 0; i <= attemptsLeft; i++) {      
                System.out.println("Incorrect login or password.");
                System.out.println("Attempts left: " + attemptsLeft);

                System.out.println("Enter login: ");
                login = sc.nextLine();

                System.out.println("Enter password: ");
                password = sc.nextLine();

                if(login.equals(LOGIN) && password.equals(PASSWORD)){
                    break;
                }

                attemptsLeft--;
            }
        }

        if(attemptsLeft == 0 ){
            System.out.println("Attempts left: 0");
            System.out.println("Access blocked.");
            sc.close();
            return;
        }

        System.out.println("Login successful.");

        showRoleLevelOptions();
        int roleNum = sc.nextInt();

        
        while(roleNum < 1 || roleNum > 3){
            System.out.println("Role number should be 1, 2 or 3.");
            showRoleLevelOptions();
            roleNum = sc.nextInt();
        }

        String accessLevel = sc.nextLine(); 

        switch (roleNum) {
            case 1:
                accessLevel = "Administrator";
                break;
            case 2:
                accessLevel = "Manager";
                break;
            case 3:
                accessLevel = "User";
                break;
        
            default:
                System.out.println("Invalid role number.");
                break;
        }

        System.out.println("Access level: " + accessLevel);
        sc.close();
    }

    static void showRoleLevelOptions() {
        System.out.println("Select role:\n1 - Administrator\n2 - Manager\n3 - User");
  
        System.out.println("Enter role number: ");
    }
}