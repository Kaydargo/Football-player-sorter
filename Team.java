package javaprojectFootball;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Collections;

/**
 *
 * @author D00194469 Kayleigh Hoey
 */

public class Team
{
    private String Manager;
    private String TeamName;
    private String location;
    private double budget;
    private ArrayList<Player> players;

    public Team(String Manager, String TeamName, String location, double budget)
    {
        this.Manager = Manager;
        this.TeamName = TeamName;
        this.location = location;
        this.budget = budget;
        players = new ArrayList();
    }

    public String getManager()
    {
        return Manager;
    }

    public String getTeamName()
    {
        return TeamName;
    }

    public String getLocation()
    {
        return location;
    }

    public double getBudget()
    {
        return budget;
    }

    public ArrayList<Player> getPlayer()
    {
        return players;
    }

    public void setManager(String Manager)
    {
        this.Manager = Manager;
    }

    public void setTeamName(String TeamName)
    {
        this.TeamName = TeamName;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public void setBudget(double budget)
    {
        this.budget = budget;
    }

    public void setPlayer(ArrayList<Player> players)
    {
        this.players = players;
    }

    //Displays all player names
    public void displayAll()
    {
        System.out.println("All players in the team " + TeamName);
        
         for (int i=0; i<players.size(); i++)
        {
            System.out.println(players.get(i).getName());
        }
    }
     
    //Adds player onto team
    public void addPlayer(Player players)
    {
        this.players.add(players);
    }
    
    //Deletes player from team
    public void deletePlayer(int remove)
    {
        this.players.remove(remove);
    }

    //Counts total number of players
    public int countPlayer()
    {
       return this.players.size();
    }
    
    //Counts number of players in a position
    public int countPlayerPosition(String position)
    {
        int count=0;
        for (int i=0; i<players.size(); i++)
        {
            if (players.get(i).getPosition().toLowerCase().equals(position.toLowerCase()))
            {
                count++;
            }
        }  
       return count;
    }
    
    //Increases team budget by percent
    public void increaseBudget(double percent)
    {
        this.budget = this.budget * percent;
    }
    
    //Displays players by entered position
    public void displayByPos(String position)
    {
         System.out.println("All players who play in position " + position);
        
         for (int i=0; i<players.size(); i++)
        {
            if(players.get(i).getPosition().toLowerCase().equals(position.toLowerCase()))
            {
                System.out.println(players.get(i).getName());
            }
        }
    }
    
     //Displays salaries over a set amount
    public void salaryGreaterThan(double highPayer)
    {
        for(int i=0; i<players.size(); i++)
        {
            if (players.get(i).getSalary()> highPayer)
            {
                System.out.println("Name: " + players.get(i).getName() + "\t Salary: €" + players.get(i).getSalary());
            }
        }    
    }
     //Displays a count of Salaries over a set amount
     public int salaryGreaterThanCount(double highPayer)
    {
        int count=0;
        for(int i=0; i<players.size(); i++)
        {
            if (players.get(i).getSalary()> highPayer)
            {
                count++;
            }
        }
        return count;
    }
    
     //Displays Salaries under a set amount
    public void salaryLessThan(double lowPayer)
    {
        for(int i=0; i<players.size(); i++)
        {
            if (players.get(i).getSalary() < lowPayer)
            {
                System.out.println("Name: " + players.get(i).getName() + "\t Salary: €" + players.get(i).getSalary());
            }
        }  
    }

    //Displays players under a certain age - INT
    public void ageLessThan(int age)
    {
        for(int i=0; i<players.size(); i++)
        {
            if (players.get(i).getAge() < age)
            {
                System.out.println("Name: " + players.get(i).getName() + "\t Age: " + players.get(i).getAge());
            }
            else 
            {
                System.out.println("There are no junior players on the team");
            }
        }   
    }
    //Displays players over a certain age - INT
     public void ageGreaterThan(int age)
    {
        for(int i=0; i<players.size(); i++)
        {
            if (players.get(i).getAge() > age)
            {
                System.out.println("Name: " + players.get(i).getName() + "\t Age: " + players.get(i).getAge());
            }
            
            else 
            {
                System.out.println("There are no senior players on the team");
            }
        }  
    }
    
     //Counts number of players under a certain age
//     public int ageLessThanCount(int age)
//    {
//        int count=0;
//        for(int i=0; i<players.size(); i++)
//        {
//            if (players.get(i).getAge() < age)
//            {
//             count++;     
//            }
//        }   
//        return count;
//    }
//     
//    //Counts number of players over a certain age
//     public int ageGreaterThanCount(int age)
//    {
//        int count=0;
//        for(int i=0; i<players.size(); i++)
//        {
//            if (players.get(i).getAge() > age)
//            {
//                count++;
//            }
//        }
//        return count;
//    }
     
     //Counts number of players under a certain age - DOB
//     public int ageLessThanCountDoB(int year)
//    {
//        Calendar cal = Calendar.getInstance();
//        int count=0;
//        for(int i=0; i<players.size(); i++)
//        {
//             Date dob = players.get(i).getBirthDate();
//            cal.setTime(dob);
//            int yob = cal.get(Calendar.YEAR);
//            if (yob < year)
//            {        
//             count++;     
//            }
//        }   
//        return count;
//    }
     
    //Counts number of players over a certain age - DOB
//     public int ageGreaterThanCountDoB(int year)
//    {
//        Calendar cal = Calendar.getInstance();
//        int count=0;
//        
//        for(int i=0; i<players.size(); i++)
//        {
//             Date dob = players.get(i).getBirthDate();
//            cal.setTime(dob);
//            int yob = cal.get(Calendar.YEAR);
//            if (yob > year)
//            {
//                count++;
//            }
//        }
//        return count;
//    }
    
     //Displays players over a certain age - DATE
//    public void ageLessThanDoB(int year)
//    {
//        Calendar cal = Calendar.getInstance();
//        for(int i=0; i<players.size(); i++)
//        {
//            Date dob = players.get(i).getBirthDate();
//            cal.setTime(dob);
//            int yob = cal.get(Calendar.YEAR);            
//            
//            if (yob >= year )
//            {
//                System.out.println("Name: " + players.get(i).getName() + "\t Date of birth: " + players.get(i).getBirthDate());
//            }
//        }
//    }
    
    //Displays players over a certain age - DATE
//    public void ageGreaterThanDoB(int year)
//    {
//        Calendar cal = Calendar.getInstance();
//        for(int i=0; i<players.size(); i++)
//        {
//            Date dob = players.get(i).getBirthDate(); //1997
//            cal.setTime(dob);
//            int yob = cal.get(Calendar.YEAR); 
//            if (yob <= year)
//            {
//                System.out.println("Name: " + players.get(i).getName() + "\t Date of birth: " + players.get(i).getBirthDate());
//            }
//        }        
//    }
      public void dateCompare (String year) throws ParseException
      {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        for (int i=0; i<players.size(); i++)
        {
            String dateStr = sdf.format(players.get(i).getBirthDate());
            Date date1 = sdf.parse(year);
            Date date2 = sdf.parse(dateStr);
            
//            System.out.println("date1 : " + sdf.format(date1));
//            System.out.println("date2 : " + sdf.format(date2));
            
            if (date1.after(date2)) {
                System.out.println("Born after Date");
                System.out.println(players.get(i).getName());
            }
            
            if (date1.before(date2)) {
                System.out.println("Born before Date");
                System.out.println(players.get(i).getName());
            }
//            
//            
        }
      }
      
      public boolean dateCompareEqual (String year) throws ParseException
      {
          boolean dateEqual= false;
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
          for (int i=0; i<players.size(); i++)
          {
          String dateStr = sdf.format(players.get(i).getBirthDate());
            Date date1 = sdf.parse(year);
            Date date2 = sdf.parse(dateStr);
            
          if (date1.equals(date2)) 
            {
              dateEqual= true;
            }
          }
          return dateEqual;
      }
      
       public int dateCompareCountAfter (String year) throws ParseException
      {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int count=0;
        for (int i=0; i<players.size(); i++)
        {
            String dateStr = sdf.format(players.get(i).getBirthDate());
            Date date1 = sdf.parse(year);
            Date date2 = sdf.parse(dateStr);
            
            if (date1.after(date2)) {
                count++;
            }
        }
        return count;
      }
       
       public void dateCompareAfter (String year) throws ParseException
      {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i=0; i<players.size(); i++)
        {
            String dateStr = sdf.format(players.get(i).getBirthDate());
            Date date1 = sdf.parse(year);
            Date date2 = sdf.parse(dateStr);
            
            if (date1.after(date2)) {
                System.out.println(players.get(i).getName());
            }
        }
      }
       
        public void dateCompareBefore (String year) throws ParseException
      {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i=0; i<players.size(); i++)
        {
            String dateStr = sdf.format(players.get(i).getBirthDate());
            Date date1 = sdf.parse(year);
            Date date2 = sdf.parse(dateStr);
            
            if (date1.before(date2)) {
                System.out.println(players.get(i).getName());
            }
        }
      }
       
        public int dateCompareCountBefore (String year) throws ParseException
      {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int count=0;
        for (int i=0; i<players.size(); i++)
        {
            String dateStr = sdf.format(players.get(i).getBirthDate());
            Date date1 = sdf.parse(year);
            Date date2 = sdf.parse(dateStr);
            
            if (date1.before(date2)) {
                count++;
            }
        }
        return count;
      }           
            
    //Calculates remaining budget from money spent
    public double budgetRemaining(double spent)
    {
        this.budget= this.budget - spent;
        return budget;
    }
    
    //Calculates average salary
    public double salaryAvg(double salary)
    {
        this.budget= this.budget - salary;
        return budget;
    }
    
    public void totalSalaryCalc()
    {
        double total=0;
        
        for (int i=0; i<players.size(); i++)
        {
            total = total + players.get(i).getSalary();
        }
        
         System.out.println("The total of all players salaries are: €" + total);  
    }
    
    //Displays players initials
    public void displayFirstLetter()
    {
        for (int i=0; i<players.size(); i++)
        {
            System.out.println(players.get(i).getName().charAt(0));
           
        }
    }
    
    @Override
    public String toString()
    {
        return "Team { " + "Manager: " + Manager + ", TeamName: " + TeamName + ", location: " + location + ", budget: " + budget + ", player: " + players + '}';
    }
    

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.Manager);
        hash = 97 * hash + Objects.hashCode(this.TeamName);
        hash = 97 * hash + Objects.hashCode(this.location);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.budget) ^ (Double.doubleToLongBits(this.budget) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.players);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Team other = (Team) obj;
        if (Double.doubleToLongBits(this.budget) != Double.doubleToLongBits(other.budget))
        {
            return false;
        }
        if (!Objects.equals(this.Manager, other.Manager))
        {
            return false;
        }
        if (!Objects.equals(this.TeamName, other.TeamName))
        {
            return false;
        }
        if (!Objects.equals(this.location, other.location))
        {
            return false;
        }
        if (!Objects.equals(this.players, other.players))
        {
            return false;
        }
        return true;
    } 
        public void sortPlayers()
        {
        Collections.sort(players);
        for (int i=0; i<players.size(); i++)
        {
            System.out.println(players.get(i).getName());
        }
        
        }
}


