import Animal.*;
import Webshop.Webshop;

import java.util.Date;

public class MainMaven {
    public static void main(String args[]){

        Webshop webshop = new Webshop();

        Dog test = new Dog("Lucie", Gender.Female, new Date());
        Dog test2 = new Dog("Rex", Gender.Female, new Date());
        Dog test3 = new Dog("Foefje", Gender.Female, new Date());


        webshop.addDog(test3);
        webshop.addDog(test);
        webshop.addDog(test2);

    }
}
