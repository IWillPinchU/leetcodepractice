class Solution {
  public String sortVowels(String s) {
        StringBuilder result = new StringBuilder();
        ArrayList<Character> vowels = new ArrayList<>();

        for(char c: s.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1) vowels.add(c);
        }
        Collections.sort(vowels);

        int idx = 0;
        for(char c:s.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1){
                result.append(vowels.get(idx));
                idx++;
            }
            else result.append(c);
        }
        return result.toString();
    }
}