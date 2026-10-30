import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        int total = 0;
        boolean isDiscountApplied = false;

        while(running){
            System.out.println("1 - Add product\n2 - Show total\n3 - Apply discount\n4 - Checkout\n0 - Exit");
            int action = sc.nextInt();
            sc.nextLine();

                switch (action) {
                    case 1:
                        System.out.println("Enter product name:");
                        String name = sc.nextLine();

                        System.out.println("Enter price:");
                        int price = sc.nextInt();

                        System.out.println("Enter quantity:");
                        int quantity = sc.nextInt();

                        total += price * quantity;

                        System.out.println("Product added.");

                        break;
                
                    case 2:
                        System.out.println("Current total: " + total);

                        break;
                
                    case 3:
                        if(!isDiscountApplied){
                            if(total < 1000){
                                System.out.println("No discount to apply.");
                                break;
                            }

                            int discount = 0;

                            if(total >= 1000 && total < 3000) {
                                discount = 5;
                            }

                            if(total >= 3000 && total < 5000) {
                                discount = 10;
                            }

                            if(total >= 5000) {
                                discount = 15;
                            }

                            int discountPc = (total * discount) / 100; 

                            total -= discountPc;

                            isDiscountApplied = true;

                            System.out.println("Discount applied.");
                        } else {
                            System.out.println("Discount has been already applied.");
                        }
                        
                        break;
                
                    case 4:
                        System.out.println("Total price: " + total);
                        running = false;
                        break;
                
                    case 0:
                        running = false;
                        break;
                
                    default:
                        System.out.println("Invalid action number.");
                        break;
                }
        }

        sc.close();

    }
}