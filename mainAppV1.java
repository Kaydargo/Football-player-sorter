package javaprojectFootball;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author D00194469 Kayleigh Hoey
 */
public class mainAppV1
{

    public static void main(String[] args)
    {
        //TESTS BASIC PLAYER CLASS
        
//        System.out.println("\t \t Player details");
        //SET WITH AGE
//        Player player1= new Player("Kayleigh", "Forward",  20 , 2000.00);
//        Player player2= new Player("Frodo", "Defender",  26 , 2350.00);
//        Player player3= new Player("Dargo", "Mid-fielder",  24 , 2860.00);
        
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("\t Player details as of day : %d  Month : %d  year : %d \t %n", day, month, year);

        Calendar cal = Calendar.getInstance();
        Date dateofbirth = cal.getTime();
        Player player1 = new Player("Kayleigh", "Forward", dateofbirth, 2000.00);
        cal.set(1994, 2 , 21);
        Date dateofbirth2 = cal.getTime();
        Player player2 = new Player("Frodo", "Defender", dateofbirth2, 3350.00);
        cal.set(1996, Calendar.JULY, 21);
        Date dateofbirth3 = cal.getTime();
        Player player3 = new Player("Dargo", "Mid-fielder", dateofbirth3, 4860.00);
        cal.set(1992, Calendar.APRIL, 13);
        Date dateofbirth4 = cal.getTime();
        Player player4 = new Player("Buster", "Goal-keeper", dateofbirth4, 1570.00);
        cal.set(1998, Calendar.APRIL, 13);
        Date dateofbirth5 = cal.getTime();
        Player player5 = new Player("JoJo", "Defender", dateofbirth5, 2350.00);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
        System.out.println(player5);

        System.out.println();
        System.out.println("\t \t Player details Updated");
        //Updates player salary
        player1.setSalary(23000.99);
        System.out.println("Name: " + player1.getName() + "\t Position: " + player1.getPosition() + "\t DOB: " + player1.getBirthDate() + "\t Salary: " + player1.getSalary());

        //Decreases salary by percent
        player2.decreaseSalary(5);
        //Changes player position
        player2.setPosition("Forward");
        System.out.println("Name: " + player2.getName() + "\t Position: " + player2.getPosition() + "\t DOB: " + player2.getBirthDate() + "\t Salary: " + player2.getSalary());

        //Changes player position
        player3.setPosition("Defender");
        System.out.println("Name: " + player3.getName() + "\t Position: " + player3.getPosition() + "\t DOB: " + player3.getBirthDate() + "\t Salary: " + player3.getSalary());

        //Increases salary by percent
        player4.increaseSalary(20);
        player4.setPosition("Forward");
        System.out.println("Name: " + player4.getName() + "\t Position: " + player4.getPosition() + "\t DOB: " + player4.getBirthDate() + "\t Salary: " + player4.getSalary());

        //Checks if two player salaries are equal
        System.out.println();
        boolean check = player2.isSalaryEqual(player3);
        if (check == true)
        {
            System.out.println("Salaries for " + player2.getName() + " and " + player3.getName() + " are equal");
        } else
        {
            System.out.println("Salaries for " + player2.getName() + " and " + player3.getName() + " not are equal");
        }

        System.out.println();
        
        
        //Compares two player names to see which comes first in alphabetical order
        int checkName = player2.compareTo(player4);
        if (checkName < 0)
        {
            System.out.println(player2.getName() + " comes before " + player4.getName() + " in alphabet ");
        } 
        else if (checkName > 0)
        {
            System.out.println(player2.getName() + " comes after " + player4.getName() + " in alphabet ");
        }
        else
        {
            System.out.println(player2.getName() + player4.getName() + " are equal");
        }
    }
}
