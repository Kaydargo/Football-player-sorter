package javaprojectFootball;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author D00194469 Kayleigh Hoey
 */

public class mainAppV3
{
    
    public static void main(String[] args) throws ParseException
    {
         Calendar cal = Calendar.getInstance();
        //Displays current date
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("\t Player details as of day : %d  Month : %d  year : %d \t %n", day, month, year);
        System.out.println();
        
       //Create players
        cal.set( 1994, Calendar.JANUARY, 21 );
        Date dateofbirth = cal.getTime(); 
        Player player1= new Player("Kayleigh", "Forward", dateofbirth , 2000.00);
        cal.set( 1994, Calendar.JANUARY, 21 );
        Date dateofbirth2 = cal.getTime();       
        Player player2= new Player("Frodo", "Defender", dateofbirth2 , 3350.00);
        cal.set( 1996, Calendar.JULY, 21 );
        Date dateofbirth3 = cal.getTime();     
        Player player3= new Player("Dargo", "Mid-fielder",  dateofbirth3 , 4860.00);
        cal.set( 1992, Calendar.APRIL, 13 );
        Date dateofbirth4 = cal.getTime();
        Player player4= new Player("Buster", "Goal-keeper",  dateofbirth4 , 2470.00);
        cal.set(1998, Calendar.MARCH, 18);
        Date dateofbirth5 = cal.getTime();
        Player player5 = new Player("JoJo", "Defender", dateofbirth5, 2350.00);
      
        //Create team
        Team moctas = new Team("Paul", "St. Moctas", "Louth Village", 3000.00);
        //Add players to team
        moctas.addPlayer(player1);
        moctas.addPlayer(player2);
        moctas.addPlayer(player3);
        moctas.addPlayer(player4);
        moctas.addPlayer(player5);
        
        
        Scanner keyboard = new Scanner(System.in);

	int option;
        String password="moctas", passwordUser;
                
        System.out.print("Enter the password to enter the menu: ");
        passwordUser=keyboard.next();
        
        //Menu is password protected - Only enter if correct
       while (!passwordUser.toLowerCase().equals(password.toLowerCase()))
        {
         System.out.println("Access Denied!");    
         System.out.println("HINT! - Team name");  
         System.out.print("Enter the password to enter the menu: ");
         passwordUser=keyboard.next();
        } 
       
     if (passwordUser.toLowerCase().equals(password.toLowerCase()))
     {
        displayMenu();
          
        System.out.print("Please enter an option: ");
        option = keyboard.nextInt();
        while (option != 5)
        {
            if (option == 1)
            {
                doDisplays(moctas);                
            }
            else if (option == 2)
            {
                doCount(moctas);
            }
            else if (option == 3)
            {
                doFinances(moctas);
            }
            else if (option == 4)
            {
                doPlayer(moctas);
            }
            else
            {
                System.out.println("\nPlease enter valid option [1,4]");
            }

            displayMenu();
            System.out.print("Please enter option: ");
            option = keyboard.nextInt();
        }
    }
    }

    public static void displayMenu()
    {
        System.out.println();
        System.out.println("------  MENU -------");
        System.out.println("|1. - Displays     |");
        System.out.println("|2. - Counts       |");
        System.out.println("|3. - Finances     |");
        System.out.println("|4. - Players      |");
        System.out.println("|5. - Exit Program |");
        System.out.println("--------------------");
    }
	
    public static void displaySubMenu1()
    {
        System.out.println();
        System.out.println("-----------SUB MENU DISPLAY-----------");
        System.out.println("|1. - Display All                    |");
        System.out.println("|2. - Display all players by position|");
        System.out.println("|3. - Display salaries greater than  |");
        System.out.println("|4. - Display salaries less than     |");
        System.out.println("|5. - Display player by initial      |");
        System.out.println("|6. - Display players sorted         |");
        System.out.println("|7. - Exit Sub Menu                  |");
        System.out.println("--------------------------------------");
    }

    public static void displaySubMenu2()
    {
        System.out.println();
        System.out.println("-----------SUB MENU COUNT-----------");
        System.out.println("|1. - Count of players on team     |");
        System.out.println("|2. - Count of players in positon  |");
        System.out.println("|3. - Count of Junior players      |");
        System.out.println("|4. - Count of Senior players      |");
        System.out.println("|5. - Count of high earning players|");
        System.out.println("|6. - Exit Sub Menu                |");
        System.out.println("------------------------------------");
    }

    public static void displaySubMenu3()
    {
        System.out.println();
        System.out.println("----- SUB MENU FINANCES-----");
        System.out.println("|1. - Total players salary |");
        System.out.println("|2. - Increase budget      |");
        System.out.println("|3. - Remaining budget     |");
        System.out.println("|4. - Exit Sub Menu        |");
        System.out.println("----------------------------");
    }

    public static void displaySubMenu4()
    {
        System.out.println();
        System.out.println("----SUB MENU PLAYERS----");
        System.out.println("|1. - Add player       |");
        System.out.println("|2. - Delete player    |");
        System.out.println("|3. - Players younger  |");
        System.out.println("|4. - Players older    |");
        System.out.println("|5. - Player DOB       |");
        System.out.println("|6. - Exit Sub Menu    |");
        System.out.println("------------------------");
    }

    public static void doDisplays(Team moctas)
    {
         Scanner keyboard = new Scanner(System.in);

        displaySubMenu1();
        System.out.print("Please enter an option: ");

        int subMenu1 = keyboard.nextInt();
        while (subMenu1 != 7)
        {
            if (subMenu1 == 1)
            {
                //Displays all player names within team moctas
                moctas.displayAll();
            }
            else if (subMenu1 == 2)
            {
                //Displays players in a chosen position
                System.out.print("Please enter a position to display: ");
                String position = keyboard.next();
                moctas.displayByPos(position);
            }
            else if (subMenu1 == 3)
            {
                //Displays players who earn more than a set amount
                System.out.print("Please enter a salary: ");
                double salaryGreater = keyboard.nextDouble();
                moctas.salaryGreaterThan(salaryGreater);
            }
            else if (subMenu1 == 4)
            {
                //Displays players who earn less than a set amount
                System.out.print("Please enter a salary: ");
                double salaryLess = keyboard.nextDouble();
                moctas.salaryLessThan(salaryLess);
            }
            else if (subMenu1 == 5)
            {
                //Displays players by their initial
                moctas.displayFirstLetter();
            }
            else if (subMenu1 == 6)
            {
                //Alphabetically sorts players
                moctas.sortPlayers();
            }
            else
            {
                System.out.println("\nPlease enter valid option [1-7]");
            }
            displaySubMenu1();
            System.out.print("Please enter option: ");
            subMenu1 = keyboard.nextInt();
        }
    }
    
    public static void doCount(Team moctas) throws ParseException
    {
         Scanner keyboard = new Scanner(System.in);
        displaySubMenu2();
        System.out.print("Please enter an option: ");
        int subMenu2 = keyboard.nextInt();
        while (subMenu2 != 6)
        {
            if (subMenu2 == 1)
            {
                //Counts number of players on team
                int count = moctas.countPlayer();
                System.out.println("Players on the team: " + count);
                
            }
            else if (subMenu2 == 2)
            {
                //Counts number of players in chosen position
                System.out.print("Please enter a position to count: ");
                String positionCount = keyboard.next();
                int countPosition = moctas.countPlayerPosition(positionCount);
                System.out.println("Numbers of players playing in " + positionCount + " : " + countPosition);              
            }
             else if (subMenu2 == 3)
            {
                //Counts number of juvenile players
                int countJuniorAge = moctas.dateCompareCountBefore("1996-01-01");
                System.out.println("Numbers of players born after 1996-01-01: " + countJuniorAge);
            }
              else if (subMenu2 == 4)
            {
                //Counts number of senior players
                int countSeniorAge = moctas.dateCompareCountAfter("1996-01-01");
                System.out.println("Numbers of players born before 1996-01-01: " + countSeniorAge);
            }
              else if (subMenu2 == 5)
            {
                //Counts players who earn more than a certain amount
                System.out.print("Please enter salary: ");
                double salaryCount = keyboard.nextDouble();
                int countSalary = moctas.salaryGreaterThanCount(salaryCount);
                System.out.println("Numbers of players with a salary over " + salaryCount + ": " + countSalary);
            }
            else
            {
                System.out.println("\nPlease enter valid option [1-5]");
            }
            displaySubMenu2();
            System.out.print("Please enter option: ");
            subMenu2 = keyboard.nextInt();
        }
    }
    
    public static void doFinances(Team moctas)
    {
         Scanner keyboard = new Scanner(System.in);
        displaySubMenu3();
        System.out.print("Please enter an option: ");
        int subMenu3 = keyboard.nextInt();
        while (subMenu3 != 4)
        {
            if (subMenu3 == 1)
            {
                //Calculates total of all player salaries
                moctas.totalSalaryCalc();          
            }
            else if (subMenu3 == 2)
            {
                //Increases budget by a percent
                System.out.print("Enter percentage to increase budget by: ");
                double budgInc = keyboard.nextDouble();
                moctas.increaseBudget(budgInc);
                System.out.println("New budget: €" + moctas.getBudget());
            }

            else if (subMenu3 == 3)
            {
                double budgetLeft = moctas.budgetRemaining(1500.00);
                System.out.println("There is a total of €" + budgetLeft + " remaining");   
            }
            else
            {
                System.out.println("\nPlease enter valid option [1-4]");
            }
            
            displaySubMenu3();
            System.out.print("Please enter option: ");
            subMenu3 = keyboard.nextInt();
        }
    }
    
    public static void doPlayer(Team moctas) throws ParseException
    {
         Scanner keyboard = new Scanner(System.in);
        displaySubMenu4();
        System.out.print("Please enter an option: ");
        int subMenu4 = keyboard.nextInt();
        while (subMenu4 != 6)
        {
            if (subMenu4 == 1)
            {
                Calendar cal = Calendar.getInstance();
                System.out.print("Please enter player name: ");
                String pName = keyboard.next();
                System.out.print("Please enter a position: ");
                String pPosition = keyboard.next();
                System.out.print("Please enter player birth Year: ");
                int year = keyboard.nextInt();
                System.out.print("Please enter player birth Month: ");
                int month = keyboard.nextInt();
                System.out.print("Please enter player birth Day: ");
                int day = keyboard.nextInt();
                cal.set(year,month,day);
                Date dateofbirth = cal.getTime();
                System.out.print("Please enter player Salary: ");
                double pSalary = keyboard.nextDouble();
                Player playerNew = new Player(pName, pPosition, dateofbirth, pSalary);
                moctas.addPlayer(playerNew);
            }
            else if (subMenu4 == 2)
            {
               System.out.println("Current team");
               moctas.sortPlayers();
               System.out.print("Enter players index to delete: ");
               int playerInd=keyboard.nextInt();
               moctas.deletePlayer(playerInd);
            }
            else if (subMenu4 == 3)
            {
                System.out.print("Enter a date in format yyyy-mm-dd: ");
                String ageLess = keyboard.next();
                System.out.println("Players born after " + ageLess);
                moctas.dateCompareBefore(ageLess);
            }
            else if (subMenu4 == 4)
            {
                System.out.print("Enter a date in format yyyy-mm-dd: ");
                String ageGreater = keyboard.next();
                System.out.println("Players born after " + ageGreater);
                moctas.dateCompareAfter(ageGreater);
            }
            else if (subMenu4 == 5)
            {
                System.out.print("Enter a date in format yyyy-mm-dd: ");
                String year = keyboard.next();
                if (moctas.dateCompareEqual(year) ==true){
                    System.out.println("There is a player with this DOB");
                }
                else{
                    System.out.println("There is no player with this DOB");
                }
            }
            else if (subMenu4 == 6)
            {
                System.out.print("Enter a date in format yyyy-mm-dd: ");
                String year = keyboard.next();
                if (moctas.dateCompareEqual(year) ==true){
                    System.out.println("There is a player with this DOB");
                }
                else{
                    System.out.println("There is no player with this DOB");
                }
            }
            
            else
            {
                System.out.println("\nPlease enter valid option [1-6]");
            }
            displaySubMenu4();
            System.out.print("Please enter option: ");
            subMenu4 = keyboard.nextInt();
        }
    }
}
