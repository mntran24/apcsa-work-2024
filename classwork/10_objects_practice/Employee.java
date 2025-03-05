public class Employee{
    private String name;
    private int age;
    private double hours_worked;
    private double overtime;
    private double hourly_wage = 15;
    private double overtime_rate = 1.5;
    public Employee(String myName,int myAge,double myHoursWorked,double myOvertime){
        name = myName;
        age = myAge;
        hours_worked = myHoursWorked;
        overtime = myOvertime;
    }
    public Employee(String myName,int myAge,double myHoursWorked){
        name = myName;
        age = myAge;
        hours_worked = myHoursWorked;
        overtime = 0;
    }
    public Employee(){
        name = "Firstname Lastname";
        age = 0;
        hours_worked = 0;
        overtime = 0;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHoursWorked(){
        return hours_worked;
    }
    public double getHourlyWage(){
        return hourly_wage;
    }
    public double getOvertime(){
        return overtime;
    }
    public double getOvertimeRate(){
        return overtime_rate;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setHoursWorked(double newHoursWorked){
        hours_worked = newHoursWorked;
    }
    public void setHourlyWage(double newHourlyWage){
        hourly_wage = newHourlyWage;
    }
    public void setOvertime(double newOvertime){
        overtime = newOvertime;
    }
    public void setOvertimeRate(double newOvertimeRate){
        overtime_rate = newOvertimeRate;
    }
    public String createEmailAddress(){
        String first = name.substring(0,name.indexOf(" "));
        String last = name.substring(name.indexOf(" ")+1);
        String add = first + "." + last + "@company.co.uk";
        return add;
    }
    public double calcSalary(){
        double salary = hours_worked*hourly_wage + overtime*overtime_rate*hourly_wage;
        return salary;
    }
    public static double convertToEuros(double usd_salary){
        return usd_salary*0.95;
    }
}