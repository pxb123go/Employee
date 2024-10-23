class Employee
{

int id;
String name;
float salary;

Employee(int id, String name, float salary){
this.id=id;
this.name=name;
this.salary=salary;
}
void show(){
System.out.println("Hello I am "+this.name+" I am in the ID of "+this.id+" I earn this much money: "+this.salary);
}
}
class program{
    public static void main(String[] args) {
        Employee em=new Employee(110,"neel",  10000);
        em.show();
    }
}