class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        int i=0;
        int j=0;
        while(true)
        {
            if(Math.pow(x,i)>bound) break;
            j=0;
            while(true)
            {
                int sum = (int)Math.pow(x,i)+ (int)Math.pow(y,j);
               // System.out.println("sum: "+sum);
                if(sum<=bound) set.add(sum);
                else break;
                if(y==1) break;
                j++;
            }
            if(x==1) break;
            i++;
        }
     //  System.out.println(set);
        List<Integer> list = new ArrayList<>();
        for(Integer s:set) list.add(s);
        return list;
    }
}