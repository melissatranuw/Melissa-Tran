// Melissa Tran
// 7/15/19
// CSE142

/* The program "Song" produces the song “There Was an Old Woman Who Swallowed a Fly.”
   The program consist of classes and a main. */

   public class Song{

   public static void main(String[] args){
      
      fly();
      spider();
      bird();      
      dog();      
      cow();     
      horse();
      
   }
   
   public static void fly(){
         System.out.println("There was an old woman who swallowed a fly.");
         fly_verse();
     }

   public static void fly_verse(){
         System.out.println("I don't know why she a swallowed that fly,");
         System.out.println("Perhaps she'll die.");
         System.out.println();
      }
      
   public static void spider(){
         System.out.println("There was an old woman who swallowed a spider,");
         System.out.println("That wiggle and iggled and jiggles inside her.");
         spider_verse();
      }
   
   public static void spider_verse(){
         System.out.println("She swallowed the spider to catch the fly,");
         fly_verse();
      }
  
   public static void bird(){
         System.out.println("There was an old woman who swallowed a bird,");
         System.out.println("How absurd to swallow a bird.");
         bird_verse();
      } 
    
   public static void bird_verse(){
         System.out.println("She swallowed the bird to catch the spider,");
         spider_verse();
      }
      
   public static void dog(){
         System.out.println("There was an old woman who swallowed a dog,");
         System.out.println("What a hog to swallow a dog.");
         dog_verse();
      }
      
   public static void dog_verse(){
         System.out.println("She swallowed the dog to catch the bird,");
         bird_verse();
      }
   
   public static void cow(){
         System.out.println("There was an old woman who swallowed a cow,");
         System.out.println("She is not allowed to swallow a cow.");
         cow_verse();
      }
   public static void cow_verse(){
         System.out.println("She swallowed the cow to catch the dog,");
         dog_verse();
      }
   public static void horse(){
         System.out.println("There was an old woman who swallowed a horse,");
         System.out.println("She died of course.");
      }
      
   }
      
   
