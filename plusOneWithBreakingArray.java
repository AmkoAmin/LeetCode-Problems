public class plusOneWithBreakingArray{
   public int[] plusOneV2(int[] digits){
      
      StringBuilder inputDigitsIntoArrayBuilder = new StringBuilder();
      
      for (int i = 0; i < digits.length; i++) {
         inputDigitsIntoArrayBuilder.append(Integer.toString(digits[i]));
      }
      
      String DigitsIntoBuilderArrayString = inputDigitsIntoArrayBuilder.toString();
      
      int arrayAddingInteger = Integer.parseInt(DigitsIntoBuilderArrayString);
      
      arrayAddingInteger++;
      
      String arrayAddingIntegerToString = Integer.toString(arrayAddingInteger);
      
      StringBuilder builderForBreaking = new StringBuilder();
      
      for (int i = 0; i < arrayAddingIntegerToString.length(); i++) {
         builderForBreaking.append(arrayAddingIntegerToString.charAt(i));
      }
      
      int[] returnArray = new int[builderForBreaking.length()];
      
      for (int i = 0; i < returnArray.length; i++) {
         String forConvertingBuilder = Character.toString(builderForBreaking.charAt(i));
         returnArray[i] = Integer.parseInt(forConvertingBuilder);
      }
      
      return returnArray;
   }
}