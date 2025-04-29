public boolean isUniqueChar(String str){
	if(str.length()>128) return false;
	
	boolean[] charSet = new boolean[256];
	for(int i=0;i<str.length();i++) {
		int val = str.charAt(i);
		if(charSet[val]){
			return false;
		}
		charSet[val] = true;
	}
	return true;
}
