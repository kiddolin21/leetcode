public class Solution {
    
    Map<Integer, String> units = new HashMap<Integer, String>() {{
        put(1, "One");put(2, "Two");put(3, "Three");
        put(4, "Four");put(5, "Five");put(6, "Six");
        put(7, "Seven");put(8, "Eight");put(9, "Nine");
    }};
    
    Map<Integer, String> tens = new HashMap<Integer, String>() {{
        put(10, "Ten");put(11, "Eleven");put(12, "Twelve");
        put(13, "Thirteen");put(14, "Fourteen");put(15, "Fifteen");
        put(16, "Sixteen");put(17, "Seventeen");put(18, "Eighteen");
        put(19, "Nineteen");put(20, "Twenty");put(30, "Thirty");
        put(40, "Forty");put(50, "Fifty");put(60, "Sixty");
        put(70, "Seventy");put(80, "Eighty");put(90, "Ninety");
    }};
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        StringBuilder sb = new StringBuilder();
        
        if(num / 1000000000 > 0) {
            sb.append(getHundreds(num / 1000000000)+" Billion ");
            num %= 1000000000;
        }
        if(num / 1000000 > 0) {
            sb.append(getHundreds(num / 1000000) + " Million ");
            num %= 1000000;
        }
        if(num / 1000 > 0) {
            sb.append(getHundreds(num / 1000) + " Thousand ");
            num %= 1000;
        }
        if(num > 0)
            sb.append(getHundreds(num));
        return sb.toString().trim();
        
    }
    
    private String getUnits(int n) {
        return units.get(n);
    }
    
    private String getTens(int n) {
        if(n / 10 > 0) {
            if(n <= 20 || n % 10 == 0) return tens.get(n);
            else return tens.get(n - n % 10) + " " + units.get(n % 10);
        } else return getUnits(n);
    }
    
    private String getHundreds(int n) {
        if(n / 100 == 0) return getTens(n);
        else {
            String snum = getUnits(n / 100) + " Hundred";
            if(n % 100 > 0) snum = snum + " " + getTens(n % 100);
            return snum;
        }
    }
}
