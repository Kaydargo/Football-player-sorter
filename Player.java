package javaprojectFootball;

import java.util.Objects;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author D00194469 Kayleigh Hoey
 */

public class Player implements Comparable<Player>
{
   private String name;
   private String position;
   private int age;
   private String birthDate;
   private Date dateofbirth;
   private double salary;

    public Player(String name, String position, Date dateofbirth, double salary)
    {
        this.name = name;
        this.position = position;
        this.dateofbirth = dateofbirth;
        this.salary = salary;
    }

    public Player(String name, String position, int age, double salary)
    {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }
    
     public Player(String name, String position, String birthDate, double salary)
    {
        this.name = name;
        this.position = position;
        this.birthDate = birthDate;
        this.salary = salary;
    }
   
   

    public String getName()
    {
        return name;
    }

    public String getPosition()
    {
        return position;
    }
    
    public String getPosition(String position)
    {
        return position;
    }
    
    public int getAgeOf() {

      // Calendar objects for "today" and "date of birth"

      Calendar today    = Calendar.getInstance(); 
      Calendar birthday = new GregorianCalendar();
      birthday.setTime(dateofbirth);

      // Compute basic difference in years 

      int yearDiff = today.get( Calendar.YEAR ) - birthday.get( Calendar.YEAR );

      // Birthday still needs to occur this year

      if ( today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH) )
	  yearDiff = yearDiff - 1;
      else if (today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH) &&
               today.get(Calendar.DATE)   < birthday.get(Calendar.DATE) ) {
	  yearDiff = yearDiff - 1;
      }

      return yearDiff;
   }
    
public void setBirthDate(Date aBirthDate) {
      this.dateofbirth = aBirthDate;
   }

   public void setBirthDate(int iYear, int iMonth, int iDay ) {
      Calendar cal = Calendar.getInstance();
      cal.set( iYear, iMonth, iDay );
      this.dateofbirth = cal.getTime();
   }

   public Date getBirthDate() {
      return dateofbirth;
   }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    
   //    Increases salary by percentage
    public void increaseSalary(double percent)
    {
        this.salary = this.salary + percent/100 * this.salary;
    }
    
    //    Decreases salary by percentage
    public void decreaseSalary(double percent)
     {
         this.salary=this.salary - percent/100 * this.salary;
     }

    @Override
    public String toString()
    {
        return "Player{" + "name: " + name + ", position: " + position + ", d.o.b: " + dateofbirth + ", salary: " + salary + '}';
    }

//    @Override
//    public String toString()
//    {
//        return "Player {" + "Name: " + name + ",\t Position: " + position + ",\t Age: " + age + ",\t Salary: " + salary + '}';
//    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.position);
        hash = 29 * hash + this.age;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
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
        final Player other = (Player) obj;
        if (this.age != other.age)
        {
            return false;
        }
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary))
        {
            return false;
        }
        if (!Objects.equals(this.name, other.name))
        {
            return false;
        }
        if (!Objects.equals(this.position, other.position))
        {
            return false;
        }
        return true;
    }
    
    
   @Override
    public int compareTo(Player other)
    {
        if (name.compareTo(other.getName()) < 0)
            return -1;
        else if (name.compareTo(other.getName()) > 0)
            return 1;
        else
            return 0; 
    }

      public int compareToSalary(Player other)
    {
        if (salary < other.salary)
        {
            return -1;
        }
        else if (salary > other.salary)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public boolean isSalaryEqual(Player player)
    {
        boolean check;
        
        if (player.getSalary() == this.salary)
        {
            check = true;
        }
        else
        {
            check = false;
        }
        return check;
    }
}
