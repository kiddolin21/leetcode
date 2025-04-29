public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            if(words[i].equals("")) continue;
            sb.append(words[i]+" ");
        }
        if(sb.length() > 0) return sb.delete(sb.length() - 1, sb.length()).toString();
        else return sb.toString();
    }
