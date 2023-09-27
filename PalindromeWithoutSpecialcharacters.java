public class PalindromeWithoutSpecialcharacters{

   public boolean isPalindrome(String s){
   
      String firstCheck = s.trim();
   
      if (firstCheck.isEmpty()) {
         return true;
      }
   
      StringBuilder builder = new StringBuilder();
      
      ArrayList<Character> list = new ArrayList<>();
   
      for (int i = 0; i < s.length(); i++) {
         if (Character.isLetter(s.charAt(i))) {
            list.add(s.charAt(i));
         }
      }
      
      for (int k = 0; k < list.size(); k++) {
         builder.append(list.get(k));
      }
      
      // for (int j = 0; j < builder.length(); j++) {
      //    System.out.println(builder.charAt(j));
      // }
      
      String finString = builder.toString();
      String finalString = finString.toLowerCase();
      
      int iterator1 = 0;
      int iterator2 = list.size() -1;
      
      while(finalString.charAt(iterator1) == finalString.charAt(iterator2)){
         
         iterator1++;
         iterator2--;
         
         if (iterator2 < iterator1) {
            return true;
         }   
      }
      
      return false;
      
   }
   
}