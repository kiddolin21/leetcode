public int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        
        int i = 0;
        while(i<str1.length||i<str2.length) {
            if(i<str1.length && i<str2.length) {
                if(Integer.parseInt(str1[i])>Integer.parseInt(str2[i])) return 1;
                else if(Integer.parseInt(str1[i])<Integer.parseInt(str2[i])) return -1;
            } else {
                if(i<str1.length)  {
                    if(Integer.parseInt(str1[i])!=0)
                    return 1;
                }
                if(i<str2.length) 
                {
                    if(Integer.parseInt(str2[i])!=0)
                    return -1;
                }
            }
            i++;
        }
        return 0;
    }
