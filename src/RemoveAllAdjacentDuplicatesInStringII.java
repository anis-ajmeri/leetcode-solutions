class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb;
        int i,j,count;
        boolean isAdjDupFound;
        while(true)
        {
            sb = new StringBuilder();
            isAdjDupFound = false;
            i=0;
            while(i<s.length())
            {
                count = 1;
                j=i;
                while(j<s.length()-1 && s.charAt(j)==s.charAt(j+1))
                {
                    count++;
                    j++;
                    if(count==k)
                    {
                        i=++j;
                        isAdjDupFound = true;
                    }
                    
                }
                if(i<s.length())sb.append(s.charAt(i++));
                
            }
            s = sb.toString();
            if(!isAdjDupFound) break;
        }
        return s;
    }
}