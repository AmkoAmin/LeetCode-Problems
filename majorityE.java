public class majorityE{
   public int majorityElement(int[] nums){
   
      ArrayList<Integer> anzahlListe = new ArrayList<>(); 
   
      for (int i = 0; i < nums.length; i++) {
         if (!anzahlListe.contains(nums[i])) {
            anzahlListe.add(nums[i]);
         }
      }
      
      int[][] addArray = new int[anzahlListe.size()][2];
      
      for (int k = 0; k < anzahlListe.size(); k++) {
         int temp = 0;
         
         addArray[k][0] = anzahlListe.get(k);
         for (int i = 0; i < nums.length; i++) {
            if (anzahlListe.get(k) == nums[i]) {
               temp++;
            }
         }
         addArray[k][1] = temp;
      }
      
      int temp = addArray[0][1];
      int returnWert = addArray[0][0];
      
      for (int j = 1; j < anzahlListe.size(); j++) {
         if (temp < addArray[j][1]) {
            temp = addArray[j][1];
            returnWert = addArray[j][0];
         }
      }
      
      return returnWert;
   }
}
