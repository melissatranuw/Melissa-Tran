
    import java.util.Scanner;
    
    public class Menu {
    public enum MenuChoices {Quit, BP, hulk, SM, display, bp, h, sm, q}
    private MenuChoices userMenuSelection;
    private MenuChoices userMenuSelection2;
    
//      ===============================
//      Public Default Constructor Menu
//      ===============================
        public Menu() {
    
            
            userMenuSelection = MenuChoices.Quit;
            userMenuSelection = MenuChoices.BP;
            userMenuSelection = MenuChoices.hulk;
            userMenuSelection = MenuChoices.SM;
            userMenuSelection = MenuChoices.display;
            userMenuSelection2 = MenuChoices.bp;
            userMenuSelection2 = MenuChoices.h;
            userMenuSelection2 = MenuChoices.sm;
            userMenuSelection2 = MenuChoices.q;
            

        } // Public Defualt

//      ==================
//      Method Display
//      ================
        public void Display() {
            
            System.out.println("Choose two Marvel heroes you want to battle against:");
            System.out.println("=================================");
            System.out.println("1: Quit!        2: Black Panther");
            System.out.println("3: HULK!        4: Spider Man");
            System.out.println("5: Display all heroes' power level!");
            System.out.println("=================================");

        } // Display
        
//      ===================
//      Methid QueryUser
//      ===================
        public void QueryUser(BlackPanther bp, Hulk h, SpiderMan sm) {
        
            Scanner keyboard = new Scanner(System.in);
        
            int selection = keyboard.nextInt();
        
                switch (selection) {
                    case 1:
                    userMenuSelection = MenuChoices.Quit;
                    System.exit(0);
                    break;
                    
                    case 2:
                    userMenuSelection = MenuChoices.BP;
                    break;
                    
                    case 3:
                    userMenuSelection = MenuChoices.hulk;
                    break;
                    
                    case 4:
                    userMenuSelection = MenuChoices.SM;
                    break;
                    
                   case 5:
                    userMenuSelection = MenuChoices.display;
                    Menu menu = new Menu();
                    System.out.println("************************************");
                    System.out.println(bp.toString());
                    System.out.println(sm.toString());
                    System.out.println(h.toString());
                    System.out.println("************************************");
                    System.out.println();
                    do { menu.Display();
                         menu.QueryUser(bp, h, sm);
                        menu.ProcessCommand(bp, h, sm);
                    }while (menu.Continue());
                
                              
                    break;
                    
                    default : 
                    userMenuSelection = MenuChoices.Quit;
            } // switch
                
             int second = keyboard.nextInt();
             
             switch (second) {
   
                    case 1:
                    userMenuSelection2 = MenuChoices.q;
                    System.exit(0);
                    break;
                    
                    case 2:
                   userMenuSelection2 = MenuChoices.bp;
                    break;
                    
                    case 3:
                   userMenuSelection2 = MenuChoices.h;
                    break;
                    
                    case 4:
                    userMenuSelection2 = MenuChoices.sm;
                    break;
                    
                    case 5:
                    userMenuSelection2 = MenuChoices.display; 
                    break;
                    
                    default : 
                    userMenuSelection2 = MenuChoices.q;
            } // switch
            
                System.out.println();
                System.out.println("1, 2, 3, FIGHT %&$#!!");
                System.out.println();

        } // QueryUser
        
//      ===============
//      Method Continue
//      ================
        public boolean Continue() {

            return userMenuSelection != MenuChoices.Quit || userMenuSelection2 != MenuChoices.q;
        
        } // Method Contune
//      =====================
//      Method ProcessCommand
//      =======================
        public void ProcessCommand(BlackPanther bp, Hulk h, SpiderMan sm) {
            
     
           
            if (userMenuSelection == MenuChoices.Quit || userMenuSelection2 == MenuChoices.q) {      
                System.exit(0);
                } // if quit
         
                else if (userMenuSelection == MenuChoices.BP && 
                        userMenuSelection2 == MenuChoices.h) {
                int powerLVL = h.getPowerLVL() - bp.getXP();
                    h.setPowerLVL(powerLVL);
                    System.out.println(h.toString());
                    System.out.println(bp.toString());
                    System.out.println();
                }
                else if (userMenuSelection == MenuChoices.hulk && 
                        userMenuSelection2 == MenuChoices.bp) {
                int powerLVL = h.getPowerLVL() - bp.getXP();
                    h.setPowerLVL(powerLVL);
                    System.out.println(h.toString());
                    System.out.println(bp.toString());
                    System.out.println();
                }
                else if (userMenuSelection == MenuChoices.BP && 
                        userMenuSelection2 == MenuChoices.sm) {
                int powerLVL = bp.getPowerLVL() - sm.getXP();
                    bp.setPowerLVL(powerLVL);
                    System.out.println(bp.toString());
                    System.out.println(sm.toString());
                    System.out.println();
                }
                else if (userMenuSelection == MenuChoices.SM && 
                        userMenuSelection2 == MenuChoices.bp) {
                int powerLVL = bp.getPowerLVL() - sm.getXP();
                    bp.setPowerLVL(powerLVL);
                    System.out.println(bp.toString());
                    System.out.println(sm.toString());
                    System.out.println();
                }
                else if (userMenuSelection == MenuChoices.hulk && 
                        userMenuSelection2 == MenuChoices.sm) {
                int powerLVL = sm.getPowerLVL() - h.getXP();
                    sm.setPowerLVL(powerLVL);
                    System.out.println(sm.toString());
                    System.out.println(h.toString()); 
                    System.out.println();
                }  
                else if (userMenuSelection == MenuChoices.SM && 
                        userMenuSelection2 == MenuChoices.h) {
                int powerLVL = sm.getPowerLVL() - h.getXP();
                    sm.setPowerLVL(powerLVL);
                    System.out.println(sm.toString());
                    System.out.println(h.toString());
                    System.out.println();
                }
               
               else if ( userMenuSelection2 == MenuChoices.display) {
                    System.out.println("************************************");
                    System.out.println(bp.toString());
                    System.out.println(sm.toString());
                    System.out.println(h.toString()); 
                    System.out.println();
                    System.out.println("************************************");
                }
               
            }// else

        } // Method ProcessCommand

