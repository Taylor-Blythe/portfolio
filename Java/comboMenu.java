import java.util.Scanner;

public class comboMenu{
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        double total = 0;
        String order = "";
        int orderNumber = 1;


        
 
        System.out.println("would you like to order anything?");

        String orderMore = ui.nextLine();

        while(orderMore.equals("yes")){
        order = order.concat("\norder "+orderNumber + ":");
        System.out.println("Would you like a sandwich? ");
        String addSandwhich = ui.next();

        if(addSandwhich.equals("yes")){
            System.out.println("What sandwich would you like? tofu(T): $5.75 chicken(C): $5.25 beef(B): $6.25");
            String sandwich = ui.next();

            if(sandwich.equals("tofu")||sandwich.equals("T")){
                total += 5.75;
            }
            else if(sandwich.equals("chicken")||sandwich.equals("C")){
                total += 5.25;
            }
            else if(sandwich.equals("beef")||sandwich.equals("B")){
                total += 6.25;
            }
            order = order.concat(sandwich+" ");

        }
        else{
            String sandwich = "n/a";
            order = order.concat(sandwich+" ");
        }



        System.out.println("Would you like fries? ");
        String addFries = ui.next();
            if(addFries.equals("yes")){
                System.out.println("what size?(S)(M)(L)");
                String fries = ui.next();
                if(fries.equals("S")||(fries.equals("small"))){
                    total += 1.0;
                }
                else if(fries.equals("M")||(fries.equals("medium"))){
                    total += 1.75;
                }
                else if(fries.equals("L")||(fries.equals("large"))){
                    total += 2.25;
                }
                order = order.concat(fries+" ");
            }
                else{
                    String fries = "n/a";
                    order = order.concat(fries+" ");
                }




                System.out.println("Would you like a drink? ");
                String addDrink = ui.next();
                    
                    if(addDrink.equals("yes")){
                        System.out.println("what size(S)(M)(L)?");
                        String drink = ui.next();
                        if(drink.equals("S")||(drink.equals("small"))){
                            total += 1.0;
                        }
                        else if(drink.equals("M")||(drink.equals("medium"))){
                            total += 1.75;
                        }
                        else if(drink.equals("L")||(drink.equals("large"))){
                            System.out.println("would you like to upgrade to a child size for 38 cents more?");
                            String ans = ui.next();
                                if(ans.equals("yes")){
                                    total += 2.38;
                                    drink = "child";
                                }
                                else{
                                    total += 2.00;
                                    }
                        }
                        order = order.concat(drink+" ");
                    }
                else{
                    String drink = "n/a";
                    order = order.concat(drink+" ");
                    }
                    
                    if(addSandwhich.equals("yes") && addFries.equals("yes") && addFries.equals("yes")){
                        total-=1;
                    }
                




                System.out.println("Would you like Ketchup? ");
                String addKetchup = ui.next();
                int Ketchup = 0;
                double amount = 0;
        
                if(addKetchup.equals("yes")){
                    System.out.println("How many? ");
                        Ketchup = ui.nextInt();
                        amount = Ketchup*0.25;
                        total+=amount;
                }
                order = order.concat(Ketchup+" ");


                System.out.println("would you like to order more?");
                orderMore = ui.next();

                orderNumber+=1;


                double finalTotal = total*1.07;


                System.out.println(order);
                System.out.print("Subtotal: $");
                System.out.printf("%.2f%n", total);
                System.out.println("Tax: 7%");
                System.out.print("Total: $");
                System.out.printf("%.2f%n",finalTotal);
            }
                }
            }