public class Driver{
    public static void main(String[] args){
        // I'm just guessing your age!
        Employee person = new Employee("Jessica Novillo", 35, 40,2.5);
        System.out.println(person.getHoursWorked());
        person.setHoursWorked(30);
        System.out.println(person.getHoursWorked());

        Employee person2 = new Employee("Jeremy Dodd", 65,20);
        System.out.println(person2.getHourlyWage());
        System.out.println(person2.calcSalary());
        person2.setOvertime(1);
        person2.setOvertimeRate(2);
        System.out.println(person2.calcSalary());
        
        //Can you call a static method from a non-static one? 
        // No

        //Or vice versa, can you call a non-static method from a static one? 
        // Yes
        System.out.println(Employee.convertToEuros(person2.calcSalary()));

        Employee person3 = new Employee();
        person3.setName("Paul Blaer");
        System.out.println(person3.createEmailAddress());
        System.out.println(Employee.convertToEuros(2.5));
    }
}