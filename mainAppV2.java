package javaprojectFootball;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author D00194469 Kayleigh Hoey
 */
public class mainAppV2
{

    public static void main(String[] args) throws ParseException
    {
        

        Calendar cal = Calendar.getInstance();
//        int year = cal.get(Calendar.YEAR);
//        int month = cal.get(Calendar.MONTH);
//        int day = cal.get(Calendar.DAY_OF_MONTH);
//          System.out.println("\t \t Player details as of " + day + "/" + month + "/" + year);       
//        cal.set( 1994, Calendar.JANUARY, 21 );
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("\t Player details as of day : %d  Month : %d  year : %d \t %n", day, month, year);
        
        
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
        Player player4= new Player("Buster", "Goal-keeper",  dateofbirth4 , 1570.00);
        cal.set(1998, Calendar.APRIL, 13);
        Date dateofbirth5 = cal.getTime();
        Player player5 = new Player("JoJo", "Defender", dateofbirth5, 2350.00);
      
        cal.setTime(dateofbirth);
        
        
        Team moctas = new Team("Paul", "St. Moctas", "Louth Village", 3000.00);
        moctas.addPlayer(player1);
        moctas.addPlayer(player2);
        moctas.addPlayer(player3);
        moctas.addPlayer(player4);
        moctas.addPlayer(player5);
        
        moctas.increaseBudget(2.5);
        System.out.println (moctas);
        
        player1.setBirthDate ( 1997, Calendar.MARCH, 3 );
        System.out.println (player1);
        System.out.println (player2);     
        System.out.println (player3);
        System.out.println (player4);
        System.out.println (player5);

        System.out.println();
        moctas.displayAll();
        
        //Deletes player at index 3
        moctas.deletePlayer(3);
        
        System.out.println();
        //Counts number of players playing for team
        int count = moctas.countPlayer();
        System.out.println("Number of Players playing for Moctas: " + count);
        
        System.out.println();
        //Displays all players in set position
        moctas.displayByPos("Forward");
       
        System.out.println();
        //Checks which name comes first alphabetically
        if (player1.compareTo(player2) < 0)
        {
            System.out.println(player1.getName() + " alphabetically comes after " + player2.getName());
        }
        else if (player1.compareTo(player2) > 0)
        {
            System.out.println(player2.getName() + " alphabetically comes before " + player1.getName());
        }
        else
        {
            System.out.println("The Players are equal");
        }
        
        System.out.println();
        //Displays players who earn over set amount
        System.out.println("High earning Players: ");
        moctas.salaryGreaterThan(3500.00);
        
        System.out.println();
        //Displays players who earn under set amount
        System.out.println("Low earning Players: ");
        moctas.salaryLessThan(2000.00);
        
//        Works with int Age rather than DOB
//        System.out.println();
//        System.out.println("Young players: ");
//        moctas.ageLessThan(21);
//        
//        System.out.println();
//        System.out.println("Old players: ");
//        moctas.ageGreaterThan(24);
        
//        System.out.println();
//        System.out.println("Young players DOB: ");
//        moctas.ageLessThanDoB(1997);
//        
//        System.out.println();
//        System.out.println("Old players DOB: ");
//        moctas.ageGreaterThanDoB(1992);
        
        System.out.println();
        System.out.println("Players born before 1997-01-01");
        moctas.dateCompareBefore("1997-01-01");
        
        System.out.println();
        System.out.println("Players born after 1997-01-01");
        moctas.dateCompareAfter("1997-01-01");
        
        System.out.println();
        //Counts number of players born after set date
        int countAfter = moctas.dateCompareCountAfter("1997-01-01");
        System.out.println("Number of players born after 1997 : " + countAfter);
        
        System.out.println();
        //Counts number of players born before set date
        int countBefore = moctas.dateCompareCountBefore("1997-01-01");
        System.out.println("Number of players born before 1997: " + countBefore);
        
        System.out.println();
        double budgetLeft = moctas.budgetRemaining(2500.50);
        System.out.println("There is a total of " + budgetLeft + " remaining for the budget");
         
        System.out.println();
        moctas.totalSalaryCalc();
        
         System.out.println();
        int positionCount= moctas.countPlayerPosition("Defender");
        System.out.println("There is " + positionCount + " player(s) in Defence");
        
         System.out.println();
         if (player1.compareTo(player2) < 0)
         {
         System.out.println("The player name's " + player1.getName() + " and " + player2.getName() + " are equal");
         }
         else
         {
         System.out.println("The player name's " + player1.getName() + " and " + player2.getName() + " are not equal");
         }
         
         System.out.println();
        int checkName = player2.compareTo(player4);
        if (checkName < 0)
        {
            System.out.println(player2.getName() + " comes before " + player4.getName());
        } 
        else if (checkName > 0)
        {
            System.out.println(player2.getName() + " comes after " + player4.getName());
        }
        else
        {
            System.out.println(player2.getName() + player4.getName() + " are equal");
        } 
         System.out.println();
         System.out.println("Players sorted in alphabetical order");
         moctas.sortPlayers();

         
        System.out.println();
        boolean check = player2.isSalaryEqual(player4);
        if (check == true)
        {
            System.out.println("Salaries for " + player2.getName() +" and " +  player4.getName() + " are equal");
        }
        else
        {
            System.out.println("Salaries for " + player2.getName() +" and " +  player4.getName() + " not are equal");
        }
        
        player2.setSalary(player4.getSalary());
        
        System.out.println();
        boolean check1 = player2.isSalaryEqual(player4);
        if (check1 == true)
        {
            System.out.println("New salaries for " + player2.getName() +" and " +  player4.getName() + " are equal");
        }
        else
        {
            System.out.println("New salaries for " + player2.getName() +" and " +  player4.getName() + " not are equal");
        }
}
}
