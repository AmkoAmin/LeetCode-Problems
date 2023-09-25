public class findComplement{

   public int findComplement(int num){
      
      String binarZahl = decimalToBinary(num);
      
      StringBuilder sb = new StringBuilder();
      
      for (int i = 0; i < binarZahl.length(); i++) {
         if (binarZahl.charAt(i) == '1') {
            sb.append('0');
         }else {
            sb.append('1');
         }
      }
      
      String returnString = sb.toString();
      
      int returnInteger = binaryToDecimal(returnString);
      
      return returnInteger;
   }
      
      
   public int binaryToDecimal(String binaryString) {
      int decimal = 0;
      int binaryLength = binaryString.length();
      
      for (int i = 0; i < binaryLength; i++) {
         char binaryDigit = binaryString.charAt(i);
         
         
         if (binaryDigit != '0' && binaryDigit != '1') {
            throw new IllegalArgumentException("Ungueltiges binaeres Zeichen: " + binaryDigit);
         }
         
         
         int digitValue = binaryDigit - '0'; // '0' hat den ASCII-Wert 48
         decimal = decimal * 2 + digitValue;
      }
      
      return decimal;
   }
   
   public String decimalToBinary(int decimalNumber) {
      
      if (decimalNumber == 0) {
         return "0"; 
      }
      
      StringBuilder binaryBuilder = new StringBuilder();
      
      while (decimalNumber > 0) {
         int remainder = decimalNumber % 2;
         binaryBuilder.insert(0, remainder);
         decimalNumber /= 2; 
      }
      
      return binaryBuilder.toString();
   }

}