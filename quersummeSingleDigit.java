public class quersummeSingleDigit{
   public int addDigits(int num){
      
      ArrayList<Character> arrList = new ArrayList<>();    
      
      String sConverter = Integer.toString(num);
      
      for (int i = 0; i < sConverter.length(); i++) {
         arrList.add(sConverter.charAt(i));
      }
      
      ArrayList<Integer> intList = new ArrayList<>();
      
      for (int i = 0; i < arrList.size(); i++) {
         intList.add(Integer.parseInt(Character.toString(arrList.get(i))));
      }
      
      int sum = 0;
      
      for (int i = 0; i < arrList.size(); i++) {
         sum = sum + intList.get(i);
      }
      
      String lastStringTest = Integer.toString(sum);
      
      if (lastStringTest.length() > 1) {
         return addDigits(sum);
      }
      
      return sum;
   }
}