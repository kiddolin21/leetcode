public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder res = new StringBuilder();
        String sign = (numerator < 0 == denominator < 0 || numerator == 0)? "" : "-";
        res.append(sign);
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        res.append(num / den);
        long remainder = num % den;
        if(remainder == 0)
            return res.toString();
        res.append(".");
        
        Map<Long,Integer> map = new HashMap<Long,Integer>();
        while(!map.containsKey(remainder)) {
            map.put(remainder, res.length());
            res.append(remainder * 10 / den);
            remainder = remainder * 10 % den;
        }
        res.insert(map.get(remainder), "(");
        res.append(")");
        return res.toString().replace("(0)", "");
    }
