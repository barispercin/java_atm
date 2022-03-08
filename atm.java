import java.util.Scanner;

public class atm {

	
			public static void main(String[] args) {
				int balance= 1000 ,input,amount;
				Scanner scan = new Scanner(System.in);
				System.out.println("welcome to the USA bank");
				System.out.println("your balance : "+balance+ "$");
				while (balance>0) {
					System.out.println("1-) deposit");
					System.out.println("2-) withdraw");
					System.out.println("3-) inquire about balance");
					System.out.println("4-) exit");
					System.out.println("Select the action you want to do");
					input=scan.nextInt();
				
					if(input==1) {
		            System.out.println("Amount you want to deposit :");
		            amount=scan.nextInt();
		            balance +=amount;
					}else if(input==2) {
						System.out.println("Amount you want to withdraw :");
						amount=scan.nextInt();
			           if(amount>balance) {
			        	   System.out.println("insufficient balance");
			           }else {
			        	   balance -=amount;
			           }
					}else if(input==3) {
						System.out.println("current balance:"+balance+"$");
					}else if(input==4) {
						System.out.println("exit");
						break;
						}}}}

