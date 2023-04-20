package com.cc.java;

public class App {
    
    public static void main(String[] args) {
      
        /*Instanzierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

        Cat cat1 = new Cat("Grizabella", "white", 29);  
        // output("Blick von aussen: "+ cat1); (inst.Var. wird
        // output(cat1.tellYourAddress());  - wird nicht mehr gebraucht)

        //Wertzuweißung (wird nach Costructor nicht mehr benötigt)
        // cat1.changeName("Grizabella");
        // cat1.changeFurColor( "white");
        // cat1.changeAge(29);
        
        // cat1.furColor = "grey"; = Designschwäche */    //
        // jeder der diese Adresse kennt kann diese Zeile ändern
        // Behebung: Einträge der Klasse Cat auf privat setzen! 
       
        //Ausgabe
        output(cat1.getName());
        output(cat1.getFurColor());
        output(Integer.toString(cat1.getAge()));
        
        // output(cat1.age);                  // geht nicht*/
        // output(String.valueOf(2));         // geht auch..
        // output("Ausgabe Zahl " + 2);       // geht auch so..*/


        output("-------------------------");


        Cat cat2 = new Cat("Alonzo", "grey", 35);  
        // output("Blick von aussen: "+cat2);
        // output(cat2.tellYourAddress());

        // Alte Option ohne change..-funktion
        // cat2.name = "Alonzo";
        // cat2.furColor = "grey";
        // cat2.age = 35;

        // cat2.changeName("Alonzo");
        // cat2.changeFurColor( "grey");
        // cat2.changeAge(35);

        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));

        
    }

    public static void output(String outStr) {
        System.out.println(outStr);
    }

}

