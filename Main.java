package OOP.Homework1;

public class Main {
    static Person Father;

    static Person Mother; 

    static Person Daughter; 

    static Person Son; 

    static Person Grandmother; 
    
    static Person Grandfather;  

    public static void main(String[] args){
        Father = new Person("Thomas", 27);

        Mother = new Person("Claudia", 32);

        Son = new Person("Albert", 12);

        Daughter = new Person("Alevtina", 17);

        Relations var = new Relations();
        var.GetRelation(Son, Daughter); 
    }
        
}
