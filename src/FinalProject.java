import java.util.Scanner;

public class FinalProject
{
    public static void main(String[] args)
    {
        System.out.println("Hello! Welcome to the Food App.");
        System.out.println("Create a password: ");
        Scanner sc=new Scanner(System.in);
        String password1=sc.next();
        System.out.println("Your password is "+password1);
        System.out.println("Please enter your password.");
        String password2=sc.next();
       while (!password1.equals(password2))
        {
            System.out.println("Wrong Password! Try again.");
           password2=sc.next();
        }
        System.out.println("Access Granted");
        System.out.println("Are you hungry? Yes or No.");
        String answer1=sc.next();
        if(answer1.equals("Yes"))
        {
            System.out.println("Choose what do you want to have? Pizza,Burger or Pasta");
            String answer2=sc.next();
            while(!answer2.equals("Pizza")&&!answer2.equals("Burger")&&!answer2.equals("Pasta"))
            {
                System.out.println("Sorry, we do not have it. What would you like between Pizza,Burger or Pasta?");
                answer2=sc.next();
            }
            if(answer2.equals("Pizza")||answer2.equals("Burger")||answer2.equals("Pasta")) {
                System.out.println("Do you want something to drink?Yes or No: ");
                String answer3 = sc.next();
                while (!answer3.equals("Yes") && !answer3.equals("No")) {
                    System.out.println("Wrong Command. Try answering again");
                    answer3 = sc.next();
                }
                if (answer3.equals("Yes")) {
                    System.out.println("What would you like to drink? Coke or Beer ");
                    String answer4 = sc.next();
                    while (!answer4.equals("Coke") && !answer4.equals("Beer")) {
                        System.out.println("Sorry, we do not have it. Would you like Coke Or Beer?");
                        answer4 = sc.next();
                    }
                    if (answer4.equals("Coke") || answer4.equals("Beer")) {
                        System.out.println("Great. You have ordered " + answer2 + " and " + answer4);
                    }
                    System.out.println("Please confirm your password");
                    password2 = sc.next();
                    while (!password1.equals(password2)) {
                        System.out.println("Wrong Password! Try again.");
                        password2 = sc.next();
                    }
                    System.out.println("Thank You. Your order is on its way.");
                } else {
                    System.out.println("You have ordered " + answer2);

                    System.out.println("Please confirm your password");
                    password2 = sc.next();
                    while (!password1.equals(password2)) {
                        System.out.println("Wrong Password! Try again.");
                        password2 = sc.next();
                    }

                }
            }
        }
        else
            System.out.println("Have a good day.");






    }
}
