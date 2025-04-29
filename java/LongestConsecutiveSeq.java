public class Solution {
    public int longestConsecutive(int[] num) {
        if(num.length<=1)
            return num.length;
        HashMap<Integer,Boolean> numberUsed = new HashMap<Integer,Boolean>();
        int longestSoFar = 1;
        for(int i:num) {
            numberUsed.put(i,false);
        }
        for(int i:num) {
            if(numberUsed.get(i) == false)
            {
                int localLongest = 1;
                int tmp = i+1;
                numberUsed.put(i,true);
                while(numberUsed.containsKey(tmp)&&numberUsed.get(tmp)==false)
                {
                    localLongest +=1;
                    numberUsed.put(tmp,true);
                    tmp+=1;
                }
                tmp = i-1;
                while(numberUsed.containsKey(tmp)&&numberUsed.get(tmp)==false)
                {
                    localLongest +=1;
                    numberUsed.put(tmp,true);
                    tmp-=1;
                }
                longestSoFar=Math.max(longestSoFar,localLongest);
            }
        }
        return longestSoFar;
    }
}
