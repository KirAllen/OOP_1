package OOP.Homework1;

public class Person {

    private String name; 

    private String surname;

    private int age; 

    private String status; 

    private String city; 

    public Person(String name, int age) {

        this.name = name;
        this.age = age; 

    }

    public void SetStatus(String status){
        this.status = status;
    }

    public String GetStatus(){
        return status; 
    }

}
