public class Employee{
    private String name;
    private double salary;

    public Employee(){
        name="Unknown";
        salary=0.0;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "Employee [name= "+name+", salary= "+salary+"]";
    }
}