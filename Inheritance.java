public class Inheritance {
//     public static void main(String[] args) {
//         Fish shark = new Fish();
//         shark.eat();
        
//     }
    
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eats");

//     }
//     void breathe(){
//         System.out.println("breathes");

//     }
// }

// //Derived class / sub class
// class Fish extends Animal{
//     int fins;  
//     void swim(){
//         System.out.println("swims in water");
//     }
// }

// multilevel level Inheritance

// public static void main(String[] args) {
//     Dog dobby = new Dog();
//     dobby.eat();
//     dobby.legs = 4;
//     System.out.println(dobby.legs);
    
// }

// }
// class Animal{
// String color;
// void eat(){
//     System.out.println("eats");

// }
// void breathe(){
//     System.out.println("breathes");

// }
// }
//  class Mammals extends Animal {
//     int legs;

//  }
//  class Dog extends Mammals {
//     String breed;

//  }
//Derived class / sub class
// class Fish extends Animal{
// int fins;  
// void swim(){
//     System.out.println("swims in water");
// }
// }

// HIERARCHICAL INHERITANCE

public static void main(String[] args) {
    bird biddy = new bird();
    biddy.eat();
   // biddy.legs = 2;
    //System.out.println(biddy.legs);
    
}

}
//Base class

class Animal{
String color;
void eat(){
    System.out.println("eats");

}
void breathe(){
    System.out.println("breathes");

}
}
 class Mammals extends Animal {
    void walk(){
        System.out.println("walks");
    }

 }
 
 class Fish extends Animal {
    void swim(){
        System.out.println("swim");
 }
}

class bird extends Animal {
    void fly(){
        System.out.println("fly");
    }

}