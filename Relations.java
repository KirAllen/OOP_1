package OOP.Homework1;


import java.util.Objects;

import static OOP.Homework1.Main.Son;
import static OOP.Homework1.Main.Daughter;


public class Relations {

    public void GetRelation(Person pers1, Person pers2){
        if(Objects.isNull(pers1)||Objects.isNull(pers2)) {

            System.out.println("You should set Character!");
        }

        if (pers1.equals(Son)&pers2.equals(Daughter)){
            Son.SetStatus("Brother");
            Daughter.SetStatus("Sister");
            System.out.println(pers1 + "to " + pers2 + "is " + pers1.GetStatus());
            System.out.println(pers2 + "to " + pers1 + "is " + pers2.GetStatus());

        }
        else{
            System.out.println("Unknown");
        }
    }
}
