import java.util.*;
 abstract class Shape
{
    
     void Numberofsides()
     {}
   
}

 class Rectangle extends Shape
 {
     void Numberofsides()
     {
         System.out.println("The side of Rectangle:4");
     }
 }
 
 class Triangle extends Shape
 {
      void Numberofsides()
     {
         System.out.println("The side of Triangle:3");
     }
 }
 
 class Hexagon extends Shape
 {
     void Numberofsides()
     {
         System.out.println("The side of Hexagon:6");
     } 
 }
 
 class side
 {
     public static void main(String[]args)
     {
       
       Rectangle r = new Rectangle();
       Triangle t = new Triangle();
       Hexagon h = new Hexagon();
          r.Numberofsides();
          t.Numberofsides();
          h.Numberofsides();
   
     }
}
