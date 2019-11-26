
public class Employee {
	private String name;
	private int age;
    private String dateOfBirth;
    private String city;
    private double salary;
    
    public Employee(){//Default Constructor
	   
   }
    public Employee(String _name,int _age,String _dateOfBirth,String _city,double _salary)//Parameterised Constructor
   {
	   this.name=_name;
	   this.age=_age;
	   this.dateOfBirth=_dateOfBirth;
	   this.city=_city;
	   this.salary=_salary;
   }
    
    //setter method
    public void setName(String name) {
    	this.name=name;
    }
    public void setAge(int age) {
    	this.age=age;
    }
    public void setDateOfBirth(String dateOfBirth) {
    	this.dateOfBirth=dateOfBirth;
    }
    public void setCity(String city) {
    	this.city=city;
    }
    public void setSalary(double salary) {
    	this.salary=salary;
    }
    
    //getter method
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
    public String getDateOfBirth() {
    	return dateOfBirth;
    }
    public String getCity() {
    	return city;
    }
    public double getSalary() {
    	return salary;
    }
    
    public static void main(String[] args) {//main method
    	Employee emp=new Employee();//Creation of object for default constructor
    	Employee emp1=new Employee();
    	Employee emp2=new Employee();
    	Employee emp3=new Employee();
    	Employee emp4=new Employee();
    	
    	Employee emp5=new Employee("Surbhi",22,"1997-06-24","Amravati",21000);
    	Employee emp6=new Employee("Dipali",22,"1997-09-26","Wardha",35000);
    	Employee emp7=new Employee("Palak",22,"1997-07-22","Nagpur",21000);
    	Employee emp8=new Employee("Shubham",22,"1997-06-24","Delhi",21700);
    	Employee emp9=new Employee("Ashutosh",22,"1997-06-24","Meerut",51000);
    	
    	emp.setName("Suru");
    	emp.setAge(22);
    	emp.setDateOfBirth("1997-06-24");
    	emp.setCity("Amravati");
    	emp.setSalary(21709);
    	
    	emp1.setName("Dipa");
    	emp1.setAge(22);
    	emp1.setDateOfBirth("1997-07-02");
    	emp1.setCity("Raigad");
    	emp1.setSalary(21909);
    	
    	emp2.setName("Vasu");
    	emp2.setAge(52);
    	emp2.setDateOfBirth("1984-06-24");
    	emp2.setCity("Haryana");
    	emp2.setSalary(21709);
    	
    	emp3.setName("Vedant");
    	emp3.setAge(22);
    	emp3.setDateOfBirth("1998-06-24");
    	emp3.setCity("Akola");
    	emp3.setSalary(21799);
    	
    	emp4.setName("Sunny");
    	emp4.setAge(22);
    	emp4.setDateOfBirth("1997-06-30");
    	emp4.setCity("Raipur");
    	emp4.setSalary(51709);
    	
    }

}
