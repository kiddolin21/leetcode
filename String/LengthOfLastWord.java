public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        if(strings.length < 1) return 0;
        else return strings[strings.length - 1].length();
    }
