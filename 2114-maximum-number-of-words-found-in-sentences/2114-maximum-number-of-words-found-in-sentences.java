class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount = 0;
        for(int i = 0;i<sentences.length;i++){
            int count = 1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' ') count++;

            }
            maxcount = Math.max(maxcount,count); 

        }
        return maxcount;
    }
}