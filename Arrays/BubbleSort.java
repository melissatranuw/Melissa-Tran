
    public class BubbleSort {
    

        public static void sort(double[] b) {

            for (int index = 0; index < b.length; index++) 
                for (int j = 1; j < (b.length - index); j++) 

                    if (b[j - 1] > b[j]) {
                         double temp = b[j - 1];
                         b[j - 1] = b[j];
                         b[j] = temp;
                    } // if

        
         } // sort
        
} //BubbleSort Class
   

