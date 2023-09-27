public class singleNumer{
   public int singleNumberFunc(int[] nums){
      
      int temp;
      
      ArrayList<Integer> list = new ArrayList<>(); 
      
      for (int i = 0; i < nums.length -2; i++) {
         temp = 1;
         for (int k = i +1; k < nums.length; k++) {
            
            if (nums[i] == nums[k]) {
               temp++;
            }
            
            if (temp == 3) {
               list.add(nums[i]);
            }
            
         }
      }
      
      for (int i = 0; i < nums.length; i++) {
         if (!list.contains(nums[i])) {
            return nums[i];
         } 
      }
      
      return 0;
   }
}
