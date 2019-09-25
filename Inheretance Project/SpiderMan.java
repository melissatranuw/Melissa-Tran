
    public class SpiderMan extends Marvel{
    private int XP;
    private int powerLVL;
         
        public SpiderMan() {
      
            XP = 0;
            powerLVL = 0;
        }// spider man
    
        public SpiderMan(String hero, String power, int powerLVL, int XP) {
            super(hero, power);
            this.XP = XP;
            this.powerLVL = powerLVL;
        } // Spiderman super
        
        public SpiderMan (SpiderMan sm) {
        
            XP = sm.XP;
            powerLVL = sm.powerLVL;
        
        }// spiderman
//      =================
//      Set Mutator
//      =================        
        public void setXP() {
        
            this.XP = XP;
        }// set XP
        
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
//      Overide
//      ================= 

        @Override
        public String toString() {
        
            String string;
        
                string = super.toString()+ " with " 
                    + this.getPowerLVL() + " energy left";; 
  
            return string;
        }// Override
        
} // Spiderman class

