package ClassesObjects;

class Employee{
    String name;
    double salary;

    Employee(String n,double s){
        name=n;
        salary=s;
    }
}

class Manager extends Employee{

    Manager(String n,double s){
        super(n,s);
    }

    void display(){
        System.out.println(name+" "+salary);
    }

    public static void main(String[] args){
        Manager m=new Manager("Rahul",80000);
        m.display();
    }
}