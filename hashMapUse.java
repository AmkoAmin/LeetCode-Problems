public class hashMapUse{
   public boolean wordPattern(String pattern, String s){
      
      ArrayList<String> woerterListe = new ArrayList<>();
      StringBuilder wordBuilder = new StringBuilder();
      
      for (int i = 0; i < pattern.length(); i++) {
         if (pattern.charAt(i) != ' ') {
            wordBuilder.append(pattern.charAt(i));
         }else {
            woerterListe.add(wordBuilder.toString());
            wordBuilder.setLength(0);
         }
      }
      
      woerterListe.add(wordBuilder.toString());
      
      HashMap<String, String> map = new HashMap<>();
      
      map.put(woerterListe.get(0), "a");
      
      int i = 1;
      
      if (!woerterListe.get(i).equals(woerterListe.get(0))) {
         map.put(woerterListe.get(i), "b");
      }else {
         while (woerterListe.get(i).equals(woerterListe.get(0))) { 
            i++;
         }
         map.put(woerterListe.get(i), "b"); 
      }
      
      StringBuilder hashBuilder = new StringBuilder();

      for (int k = 0; k < woerterListe.size(); k++) {
         hashBuilder.append(map.get(woerterListe.get(k)));
      }
      
      String str = hashBuilder.toString();
      
      if (str.equals(s)) {
         return true;
      }else {
         return false; 
      }
   }
}
