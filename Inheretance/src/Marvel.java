
    public class Marvel {
    
    private String hero;
    private String power;
   
    
        public Marvel(){
        
            hero = " ";
            power = " ";
       
        } // Marvel
    
        public Marvel(String hero, String power) {
        
            this.hero = hero;
            this.power = power;
       
        }// Marvel
//      ===============
//      Set mutator
//      ===============
        public void setHero(String hero) {
        
            this.hero = hero;
        }// setHero
        public void setPower(String power) {
        
            this.power = power;
        }// Set Power
//      ===============
//      Get mutator
//      ===============
        public String getHero() {
        
            return hero;
        }// get Hero
        public String getPower() {
        
            return power;
        }// get Power
//      ===============
//      Overide
//      ===============
        @Override
        public String toString() {
        
            String string;
        
                string = this.getHero() + " has " + this.getPower();
        
            return string;
        } // toString
        
} // Marvel class
