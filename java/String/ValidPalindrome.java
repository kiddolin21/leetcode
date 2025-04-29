public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        return new StringBuilder(s).reverse().toString().equals(s);
    }
