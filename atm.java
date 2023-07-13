import java.util.Scanner;
public class atm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR PASSWORD");
        int pass = sc.nextInt();
        switch (pass){
            case 1234 :
            System.out.println("WELCOME BATUHAN");
            System.out.println("*********************");
            int i = 0;
            int balance = 1000;
            while(i == 0){
            System.out.println("**************************\n"+"TO VIEW BALANCE 0\n"
            +"TO WITHDRAW MONEY 1\n" +
            "TO DEPOSIT MONEY 2\n" +
            "TO MAKE AN EXIT Q\n"+
            "**************************");
            String islem = sc.nextLine();
                if(islem.equals("Q")){
                    System.out.println("SYSTEM SHUT DOWN");
                    i = 1;
                    break;
                }
                else if(islem.equals("q")){
                    System.out.println("SYSTEM SHUT DOWN");
                    i = 1;
                    break;
                    }
                else if(islem.equals("0")){
                    System.out.println("************************** \n" + "BALANCE \n" + balance + "\n**************************");
                    continue;
                }
                else if(islem.equals("1")){
                        System.out.println("AMOUNT YOU WANT TO WITHDRAW");
                        int a = sc.nextInt();
                        balance = balance-a;
                        continue;
                    }
                else if(islem.equals("2")){
                    System.out.println("************************** \n"+"THE AMOUNT YOU WANT TO DEPOSIT\n" + "************************** \n");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    continue;
                    }
                }
            System.out.println("TO SEE YOU");
            break;
            default :
            System.out.println("WRONG PASSWORD");
            System.out.println("PLEASE ENTER AGAIN");
            int pass2 = sc.nextInt();
            Boolean t = true;
            while(t){
                if(pass2!=1234){
                    System.out.println("WRONG PASSWORD");
                    System.out.println("PLEASE ENTER AGAIN");
                    pass2 = sc.nextInt();
                    if(pass2 ==1234){
                        break;
                    }
                    }
                else{
                    break;
                 }
               }
            System.out.println("WELCOME BATUHAN");
            System.out.println("*********************");
            int b = 0;
            int balance2 = 1000;
            while(b == 0){
                System.out.println("**************************\n"+"TO VIEW BALANCE 0\n"
                +"TO WITHDRAW MONEY 1\n" +
                "TO DEPOSIT MONEY 2\n" +
                "TO MAKE AN EXIT Q\n"+
                "**************************");
                    String islem = sc.nextLine();
                    if(islem.equals("Q")){
                        System.out.println("SYSTEM SHUT DOWN");
                        b = 1;
                        break;
                    }
                    else if(islem.equals("q")){
                        System.out.println("SYSTEM SHUT DOWN");
                        b = 1;
                        break;
                        }
                    else if(islem.equals("0")){
                        System.out.println("************************** \n" + "BALANCE \n" + balance2 + "\n**************************");
                        continue;
                    }
                    else if(islem.equals("1")){
                            System.out.println("AMOUNT YOU WANT TO WITHDRAW");
                            int a = sc.nextInt();
                            balance2 = balance2-a;
                            continue;
                        }
                    else if(islem.equals("2")){
                        System.out.println("************************** \n"+"THE AMOUNT YOU WANT TO DEPOSIT\n" + "************************** \n");
                        int deposit = sc.nextInt();
                        balance2 += deposit;
                        continue;
                        }
                    }
                System.out.println("TO SEE YOU");
            }
        }
    }