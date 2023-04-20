package com.cc.java;

public class Cat {

    private String name;
    private String furColor; 
    private int age; 
    
    
    // Custom-Constructor
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;

        
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getFurColor() {
        return furColor;
    }


    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }



    // this -- Instanzvariable (wird nach dem Constructor
    // nicht mehr benötigt)
    // public String tellYourAddress() {
    //     return "Blick von innen: " + this;
    // }

//     public String tellYourName() {
//         return this.name;   
//     }
    
//     public String tellYourFurColor() {
//         return this.furColor;
//     }
    
//     public int tellYourAge() {
//         return this.age;
//     }
    
//     // Change *//
//     public void changeName(String name) {
//         this.name = name;
//     }

//     public void changeFurColor(String furColor) {
//         this.furColor = furColor;
//     }

//     public void changeAge(int age) {
//         this.age = age;
//     }

}
    
