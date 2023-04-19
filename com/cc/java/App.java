package com.cc.java;

public class App {
    
    public static void main(String[] args) {
      
        /*Instanzierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

        Cat cat1 = new Cat();  
        output("Blick von aussen: "+ cat1);
        output(cat1.tellYourAddress());

        //Wertzuweißung
        cat1.name = "Grizabella";
        cat1.furColor = "white";
        cat1.age = 29;





        //Ausgabe
        output(cat1.name);
        output(cat1.furColor);
        output(Integer.toString((cat1.age)));
        // output(cat1.age); // geht nicht*/
        // output(String.valueOf(2));
        // output("Ausgabe Zahl " + 2); // geht auch so..*/

        output("-------------------------");

        Cat cat2 = new Cat();  
        output("Blick von aussen: "+cat2);
        output(cat2.tellYourAddress());

        cat2.name = "Alonzo";
        cat2.furColor = "grey";
        cat2.age = 35;

        output(cat2.name);
        output(cat2.furColor);
        output(Integer.toString((cat2.age)));
    }

    public static void output(String outStr) {
        System.out.println(outStr);
    }

}

