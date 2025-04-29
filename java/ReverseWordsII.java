public  void reverseWords(String s) {
	    	reverse(s.toCharArray(),0,s.length());
	    	for(int i = 0,j = 0;j<s.length();j++) {
	    		if(j==s.length()||s.charAt(j)==' '){
	    			reverse(s.toCharArray(),i,j);
	    			i = j+1;
	    		}
	    	}
	}
	    public void reverse(char[] s,int begin,int end) {
	    	for(int i= 0;i<(end-begin)/2;i++) {
	    		char temp;
	    		temp = s[begin+i];
	    		s[begin+i] = s[end-i-1];
	    		s[end-i-1] = temp;
	    	}
	    }
