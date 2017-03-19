import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;


public class Triangle
{
   public static void main( String[] args )
   {
      //get vertices of the triangle
      Scanner in = new Scanner(System.in); 
      
      System.out.println("Enter the x and y coordinates of the three vertices of a triangle.");
      System.out.println(" ");  
      
      System.out.println("Enter x1... ");
      int x1 = in.nextInt();    
      
      System.out.println("Enter y1... ");
      int y1 = in.nextInt();    
      
      System.out.println("Enter x2... ");
      int x2 = in.nextInt();
     
      System.out.println("Enter y2... ");
      int y2 = in.nextInt(); 
     
      System.out.println("Enter x3... ");
      int x3 = in.nextInt(); 
      
      System.out.println("Enter y3... ");
      int y3 = in.nextInt();                  
      
      //compute the lenght of side A (1 to 2)
      double L12 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
      
      //compute the length of side B (2 to 3)
      double L23 = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
      
      
      //compute the length of side C (3 to 1)
      double L31 = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
   
      //spacing
      System.out.println(" ");
      
      //formatting
      NumberFormat format = NumberFormat.getInstance();
      format.setMaximumFractionDigits(2);

      
      //assign the sides by size (biggest = A middle = B, smallet = C)
      if(L12 > L23 && L12 > L31 && L23 > L31){
         double A = L12;
         double B = L23;
         double C = L31;
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
      }else if(L12 > L23 && L12 > L31 && L31 > L23){
         double A = L12;
         double B = L31;
         double C = L23;
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
      }else if(L12 > L23 && L31 > L12){
         double A = L31;
         double B = L12;
         double C = L23;   
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
      }else if(L23 > L12 && L31 > L23){
         double A = L31;
         double B = L23;
         double C = L12;   
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
      }else if(L23 > L12 && L23 > L31 && L12 > L31){
         double A = L23;
         double B = L12;
         double C = L31;   
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
      }else if(L23 > L12 && L23 > L31 && L31 > L12){
         double A = L23;
         double B = L31;
         double C = L12;   
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
      }else if(L12 == L23 && L23 == L31){
         double A = L12;
         double B = L23;
         double C = L31;
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         

      }else if(L12 == L23 && L12 > L31){
         double A = L12;
         double B = L23;
         double C = L31;
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
      }else if(L12 == L23 && L12 < L31){
         double A = L31;
         double B = L12;
         double C = L23;  
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
      }else if(L12 == L31 && L12 > L23){
         double A = L12;
         double B = L31;
         double C = L23;
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
      }else if(L12 == L31 && L23 > L12){
         double A = L23;
         double B = L12;
         double C = L31;
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
      }else if(L23 == L31 && L23 > L12){
         double A = L23;
         double B = L31;
         double C = L12; 
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
      }else if(L23 == L31 && L12 > L23){
         double A = L12;
         double B = L23;
         double C = L31; 
         System.out.println("The length of side A is " + A);
         System.out.println("The length of side B is " + B);
         System.out.println("The length of side C is " + C);
         System.out.println(" ");
         double aa = (Math.acos((B*B+C*C-A*A)/(2*B*C)));
         System.out.println("Angle a (across from side A) is " + format.format(aa*57.2958) + "¡");
         double ab = Math.asin((B*Math.sin(aa))/A);
         System.out.println("Angle b (across from side B) is " + format.format(ab*57.2958) + "¡");
         double ac = 180 - (57.2958*aa) - (57.2958*ab);
         System.out.println("Angle c (across from side C) is " + format.format(ac) + "¡");
         double perim = A+B+C;
         System.out.println(" ");
         System.out.println("The perimeter is " + format.format(perim));
         double area = Math.abs((A*B*Math.sin(ac))/2);
         System.out.println(" ");
         System.out.println("The area is " + format.format(area));
         
         }
   }
}