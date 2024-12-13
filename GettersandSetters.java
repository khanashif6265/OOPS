public class GettersandSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();// created a pen object called p1
       p1.setColor("Blue");
       System.out.println(p1.getColor());
       p1.setTip(5 );  
       System.out.println(p1.getTip());
      //p1.setColor("Yellow");
      p1.setColor("yellow");
      System.out.println(p1.getColor());
         
       
      }
  
 } 
 class Pen {  
 private  String color;


 private int tip;

String getColor(){
    return this.color;
}
int getTip(){
    return this.tip;
}
void setColor(String newColor){
    this.color = newColor;

}
  
void setTip(int  Tip){
    this.tip = tip;
}
 }

 class Student {
    String name;
    int age; 
    float percentage; //cgpa
       
     void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
     }
  
}
