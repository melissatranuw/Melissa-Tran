
    public class Hulk extends Marvel{
        
    private int XP;
    private int powerLVL;
    
        public Hulk() {
         
            XP = 0;
            powerLVL = 0;
        } // hulk
     
        public Hulk(String hero, String power, int powerLVL, int XP) {
            super(hero, power);
            this.XP = XP;
            this.powerLVL = powerLVL;
        }// hulk
    
        public Hulk (Hulk h) {
        
            XP = h.XP;
            powerLVL = h.powerLVL;
        
        }// Hulk
//      =================
//      Set Mutator
//      =================    
        public void setXP() {
        
            this.XP = XP;
        } // set xp
    
        public void setPowerLVL(int powerLVL) {
        
            this.powerLVL = powerLVL;
        }// set power lvl
    
//      =================
//      Get Mutator
//      =================
        public int getXP() {
        
            return XP;   
        
        }// get xp
  
        public int getPowerLVL() {
        
            return powerLVL;
        }// get power lvl

//      =================
//      Override
//      =================

        @Override
        public String toString() {
        
            String string;
        
                string = super.toString()+ " with " 
                    + this.getPowerLVL() + " energy left";; 
               
        
            return string;
        }// tostring

   
    }// Hulk Class

