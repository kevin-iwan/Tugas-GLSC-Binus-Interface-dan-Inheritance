package main;

import java.util.Scanner;

public class Main {
	
	//Variable declaration
	Scanner scan = new Scanner(System.in);
	int personID;
	String jobName;
	
	//Creating objects
	ZeroAbility person1 = new ZeroAbility();
	OneAbility person2 = new OneAbility();
	FourAbility person3 = new FourAbility();
	AnyAbility1 person4 = new AnyAbility1();
	AnyAbility2 person5 = new AnyAbility2();
	AnyAbility3 person6 = new AnyAbility3();
	
	public void space() {
		for(int i = 0; i < 25; i++) {
			System.out.println("");
		}
	}
	
	public void getInfo() {
		int chooseID;
		
		do {
			System.out.print("Choose ID of the person (1-6) : ");
			chooseID = scan.nextInt(); scan.nextLine();
		}while(chooseID < 1 || chooseID > 6);
		
		switch(chooseID) {
		case 1:
			person1.getInfo();
			scan.nextLine();
			break;
		case 2:
			person2.getInfo();
			scan.nextLine();
			break;
		case 3:
			person3.getInfo();
			scan.nextLine();
			break;
		case 4:
			person4.getInfo();
			scan.nextLine();
			break;
		case 5:
			person5.getInfo();
			scan.nextLine();
			break;
		case 6:
			person6.getInfo();
			scan.nextLine();
			break;
		}
	}
	
	public void doCook() {
		int chooseID;
		
		do {
			System.out.print("Choose ID of the person (1-6) : ");
			chooseID = scan.nextInt(); scan.nextLine();
		}while(chooseID < 1 || chooseID > 6);
		
		switch(chooseID) {
		case 1:
			System.out.println("Person No. 1 can't cook.");
			scan.nextLine();
			break;
		case 2:
			person2.Cook();
			scan.nextLine();
			break;
		case 3:
			person3.Cook();
			scan.nextLine();
			break;
		case 4:
			person4.Cook();
			scan.nextLine();
			break;
		case 5:
			System.out.println("Person No. 5 can't cook.");
			scan.nextLine();
			break;
		case 6:
			System.out.println("Person No. 6 can't cook.");
			scan.nextLine();
			break;
		}
	}
	
	public void doDrive() {
		int chooseID;
		
		do {
			System.out.print("Choose ID of the person (1-6) : ");
			chooseID = scan.nextInt(); scan.nextLine();
		}while(chooseID < 1 || chooseID > 6);
		
		switch(chooseID) {
		case 1:
			System.out.println("Person No. 1 can't drive.");
			scan.nextLine();
			break;
		case 2:
			System.out.println("Person No. 2 can't drive.");
			scan.nextLine();
			break;
		case 3:
			person3.Drive();
			scan.nextLine();
			break;
		case 4:
			person4.Drive();
			scan.nextLine();
			break;
		case 5:
			System.out.println("Person No. 5 can't drive.");
			scan.nextLine();
			break;
		case 6:
			person6.Drive();
			scan.nextLine();
			break;
		}
	}
	
	public void doWork() {
		int chooseID;
		
		do {
			System.out.print("Choose ID of the person (1-6) : ");
			chooseID = scan.nextInt(); scan.nextLine();
		}while(chooseID < 1 || chooseID > 6);
		
		switch(chooseID) {
		case 1:
			System.out.println("Person No. 1 can't work.");
			scan.nextLine();
			break;
		case 2:
			System.out.println("Person No. 2 can't work.");
			scan.nextLine();
			break;
		case 3:
			person3.Work();
			scan.nextLine();
			break;
		case 4:
			System.out.println("Person No. 4 can't work.");
			scan.nextLine();
			break;
		case 5:
			person5.Work();
			scan.nextLine();
			break;
		case 6:
			System.out.println("Person No. 6 can't work.");
			scan.nextLine();
			break;
		}
	}
	
	public void doPaint() {
		int chooseID;
		
		do {
			System.out.print("Choose ID of the person (1-6) : ");
			chooseID = scan.nextInt(); scan.nextLine();
		}while(chooseID < 1 || chooseID > 6);
		
		switch(chooseID) {
		case 1:
			System.out.println("Person No. 1 can't paint.");
			scan.nextLine();
			break;
		case 2:
			System.out.println("Person No. 2 can't paint.");
			scan.nextLine();
			break;
		case 3:
			person3.Paint();
			scan.nextLine();
			break;
		case 4:
			System.out.println("Person No. 4 can't paint.");
			scan.nextLine();
			break;
		case 5:
			person5.Paint();
			scan.nextLine();
			break;
		case 6:
			System.out.println("Person No. 6 can't paint.");
			scan.nextLine();
			break;
		}
	}
	
	public Main() {
		
		String chooseInput;
		
		do {	
			space();
			System.out.println("Simulasi kelompok kemampuan");
			System.out.println("1. Person No. 1");
			System.out.println("2. Person No. 2");
			System.out.println("3. Person No. 3");
			System.out.println("4. Person No. 4");
			System.out.println("5. Person No. 5");
			System.out.println("6. Person No. 6");
			
			do {
				System.out.print("Choose one of these parameter (Info/Cook/Drive/Work/Paint/Exit) : ");
				chooseInput = scan.nextLine();
			}while(!chooseInput.equals("Info") && !chooseInput.equals("Cook") && !chooseInput.equals("Drive") && !chooseInput.equals("Work") && !chooseInput.equals("Paint") && !chooseInput.contentEquals("Exit"));
			
			
			switch(chooseInput) {
			case "Info":
				getInfo();
				break;
			case "Cook":
				doCook();
				break;
			case "Drive":
				doDrive();
				break;
			case "Work":
				doWork();
				break;
			case "Paint":
				doPaint();
				break;
			case "Exit":
				System.out.println("Thank you for using our program...");
				break;
			}
			
		}while(!chooseInput.equals("Exit"));
	}

	public static void main(String[] args) {
		new Main();
	}

}
