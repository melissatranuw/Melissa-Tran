
    public class BlackPanther extends Marvel{
    
    private int XP;
    private int powerLVL;
    
        public BlackPanther() {
                 
            XP = 0;
            powerLVL = 0;
        }// BlackPanther
    
        public BlackPanther(String hero, String power, int powerLVL, int XP) {
            super(hero, power);
            this.XP = XP;
            this.powerLVL = powerLVL;
        } // BlackPanther super
        
        public BlackPanther (BlackPanther bp) {
        
            XP = bp.XP;
            powerLVL = bp.powerLVL;
        
         }// BlackPanther
//      =================
//      Set Mutator
//      =================
        public void setXP() {
        
            this.XP = XP;
         } // Set XP
        
        public void setPowerLVL(int powerLVL) {
        
            this.powerLVL = powerLVL;
        } // set power lvl 
//      =================
//      Get Mutator
//      =================
        public int getXP() {
        
            return XP;   
        
        }// get XP

        public int getPowerLVL() {
        
            return powerLVL;
        } // get power lvl
//      =================
//      Override
//      =================    

        @Override
        public String toString() {
        
            String string;
        
            string = super.toString()+ " with " 
                    + this.getPowerLVL() + " energy left";; 
               
        
            return string;
        }// toString
        
    } // BlackPanther Class
