class WordFilter {
    TreeMap<String,Integer> map = new TreeMap<>();
    public WordFilter(String[] words) {
        int i=0;
        for(String w:words){
            genAllCombination(w,i);
            i++;
        }     
    }
    
    private void genAllCombination(String word,int index){
        String initialStr = "#"+word;
        map.put(initialStr,index);
        for(int i=0;i< word.length();i++) map.put(word.substring(word.length()-1-i,word.length()) +initialStr,index);      
    }
    
    public int f(String prefix, String suffix) {
        String strToSearch = suffix+"#"+prefix;
         Map<String,Integer> m = map.subMap(strToSearch,strToSearch +Character.MAX_VALUE);
        int max = -1;
        for (Map.Entry<String,Integer> entry : m.entrySet())
            if(max<entry.getValue()) max = entry.getValue();
         return max;
    }
}



/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */