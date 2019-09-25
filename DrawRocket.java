// Melissa Tran
// 7/26/19
//CSE 142 
  
   public class DrawRocket {

      public static final int HEIGHT = 3;
   
         public static void main (String[] args){
      
            head();
            belt();
         
            top();
            bottom();
            
            belt();
            
            bottom();
            top();
            
            belt();
            head();
      
         } // end of main 
         
         public static void head(){
            for (int i=HEIGHT*2-1; i>=1; i--) {
            
               for (int space=1; space<=i;space++){
                  System.out.print(" ");
               } // space amount per row
               
               for (int r_dash=i; r_dash<=HEIGHT*2-1;r_dash++){
                  System.out.print("/");
               } // right dash amount when space ends
               
               System.out.print("**"); // middle stars
               
               for (int l_dash=i; l_dash<=HEIGHT*2-1;l_dash++){
               System.out.print("\\");
               } // left dash after stars
               
               
               System.out.println(); // move to next row
             } // end of  for head()
         } // end of head()
         
         public static void top(){
            
            for(int i=1; i<=HEIGHT; i++){
               
               System.out.print("|"); // left side bar
            
            for(int dot=i; dot<=HEIGHT-1; dot++){
               System.out.print(".");
               } // left dot
               
            for(int triangle=1; triangle<=i; triangle++){
               System.out.print("/\\");
               } // triangle
            
            for(int m_dot=1; m_dot<=2*HEIGHT-2*i; m_dot++){
               System.out.print(".");
               } // middle dot
               
            for(int triangle=1; triangle<=i; triangle++){
               System.out.print("/\\");
               } // triangle
               
            for(int dot=i; dot<=HEIGHT-1; dot++){
               System.out.print(".");
               } //  right dot
               
               System.out.print("|"); // right side bar
            
            System.out.println();
            
            } //for height
           
         } // end of top()
         
         public static void bottom(){
          
            for(int i=HEIGHT; i>=1; i--){
               
               System.out.print("|"); // left side bar
            
            for(int dot=i; dot<=HEIGHT-1; dot++){
               System.out.print(".");
               } // left dot
               
            for(int triangle=1; triangle<=i; triangle++){
               System.out.print("\\/");
               } // triangle
            
            for(int m_dot=1; m_dot<=2*HEIGHT-2*i; m_dot++){
               System.out.print(".");
               } // middle dot
               
            for(int triangle=1; triangle<=i; triangle++){
               System.out.print("\\/");
               } // triangle
               
            for(int dot=i; dot<=HEIGHT-1; dot++){
               System.out.print(".");
               } //  right dot
               
               System.out.print("|"); // right side bar
            
            System.out.println();
            
            } //for height
           
         } // end of bottom()
         
         public static void belt(){
            
            System.out.print("+");
            
            for(int equal=1; equal<=HEIGHT*2; equal++){
               System.out.print("=*");
            
            } // end of for belt
            
            System.out.print("+");
            
            System.out.println();
         
         } // end of belt()
      
      } // end of class
         
         
         
            
