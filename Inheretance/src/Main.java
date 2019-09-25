
    public class Main {


        public static void main(String[] args) {
        
            Menu menu = new Menu();
        
            BlackPanther bp = new BlackPanther ("Black Panther", "Panther Powers", 100, 36);
            Hulk h = new Hulk ("Hulk", "Muscles", 100, 27);
            SpiderMan sm = new SpiderMan ("Spider Man", "Spider Sense", 100, 45);
        
                System.out.println("Rules: 1)Select two heroes.");
                System.out.println("       2)Once you selected, they are going to battle against"
                          + " \n         each other, one losing XP points, the other maintaining"
                          + " \n         their current XP power level.");
                System.out.println("       3)Battle as long as you want!");
                System.out.println("       4)Note: A hero cannot battle itself...");
                System.out.println();
        
            do {
                menu.Display();      
                menu.QueryUser(bp, h, sm);
                menu.ProcessCommand(bp, h, sm);
            
                }while (menu.Continue());
        
        } // main
    
} // main class
