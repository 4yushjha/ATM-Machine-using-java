import java.util.Scanner;

    class ATM{
    private double bal;
    private int pin=1234;

    


    


    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc=new Scanner(System.in);

        int enteredpin=sc.nextInt();
        if(enteredpin==pin){
            menu();
        }
        else{
            System.out.println("Enter valid pin");
        }

        
    }


    public void menu(){
        System.out.println("Enter Your Choice.");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");


        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
       

        if(opt==1){
            checkBalance();
        }
        else if(opt==2) {
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }

      }
    public void checkBalance(){
        System.out.println("Balance: "+bal);
        menu();

        
    }


    public void withdrawMoney(){
        System.out.println("Enter amount to Withdraw:");
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();

        if(amount>bal){
            System.out.println("Insufficient Balance");
        }
        else{
            bal -=amount;
            System.out.println("Money Withdraw successful");
            menu();
        }

       

    }


    public void depositMoney(){
         System.out.println("Enter amount to Deposite:");
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();

        bal +=amount;
        System.out.println("Money Deposite successful");

        menu();
       
    }

   
}




public class ATMMachine{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        ATM account1=new ATM();
        account1.checkpin();

        sc.close();
    }
    
    
}
