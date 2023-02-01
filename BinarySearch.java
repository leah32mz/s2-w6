public class BinarySearch {

   int [ ] values = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
   
   public BinarySearch ( ) {
   }
   
   public boolean contains (int x) {
      return helper (k, 0, values.length-1);
   }
   
   private boolean helper (int x, int low, int high) {
      while (low < high) {
         int mid = (low + high) / 2;
         if (x > values[mid]) {
            low = ____ ;
         } else {
            high = ____ ;
         }
      }
      return values[low] == x;
   }
}