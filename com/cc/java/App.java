package com.cc.java;

public class App {
    
    public static void main(String[] args) {
      
        /*Instanzierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

        Cat cat1 = new Cat();  
        output("Blick von aussen: "+ cat1);
        output(cat1.tellYourAddress());

        output(cat1.name);
        output(cat1.furColor);
        // output(cat1.age);
        // output(String.valueOf(2));
        output(Integer.toString((cat1.age)));

        output("-------------------------");

        Cat cat2 = new Cat();  
        output("Blick von aussen: "+cat2);
        output(cat2.tellYourAddress());
    }

    public static void output(String outStr) {
        System.out.println(outStr);
    }

}

