public class movedZeros{
   public int[] moveZeros(int[] nums){
   
      ArrayList<Integer> nonZeros = new ArrayList<>();
      ArrayList<Integer> zeros = new ArrayList<>();
      
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] != 0) {
            nonZeros.add(nums[i]);
         }else {
            zeros.add(nums[i]);
         }
      }
      
      Collections.sort(nonZeros);
      
      int[] sortedArray = new int[nonZeros.size() + zeros.size()];
      
      for (int i = 0; i < nonZeros.size(); i++) {
         sortedArray[i] = nonZeros.get(i);
      }
      
      for (int i = nonZeros.size(); i < sortedArray.length; i++) {
         sortedArray[i] = zeros.get(i - nonZeros.size());
      }
      
      return sortedArray;
   }
}