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
        cat1.changeName("Grizabella");
        cat1.changeFurColor( "white");
        cat1.changeAge(29);

        //Ausgabe
        output(cat1.tellYourName());
        output(cat1.tellYourFurColor());
        output(Integer.toString(cat1.tellYourAge()));
        // output(cat1.age);                  // geht nicht*/
        // output(String.valueOf(2));         // geht auch..
        // output("Ausgabe Zahl " + 2);       // geht auch so..*/


        output("-------------------------");


        Cat cat2 = new Cat();  
        output("Blick von aussen: "+cat2);
        output(cat2.tellYourAddress());

        // Alte Option ohne change..-funktion
        // cat2.name = "Alonzo";
        // cat2.furColor = "grey";
        // cat2.age = 35;

        cat2.changeName("Alonzo");
        cat2.changeFurColor( "grey");
        cat2.changeAge(35);

        output(cat2.tellYourName());
        output(cat2.tellYourFurColor());
        output(Integer.toString((cat2.tellYourAge())));

        
    }

    public static void output(String outStr) {
        System.out.println(outStr);
    }

}

