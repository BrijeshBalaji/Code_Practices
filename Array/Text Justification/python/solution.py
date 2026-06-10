                while(ss.length()<maxWidth){
                    ss.append(" ");
                }
                    ss.append(words[i]);
                    if(i!=end) ss.append(" ");
            if(lastLine||start==end){ 
                StringBuilder ss=new StringBuilder();
                for(int i=start;i<=end;i++){
        }
        public static void text(String words[], int maxWidth , List<String> list , 
        int start , int end,boolean lastLine){
        text(words,maxWidth,list,start,words.length-1,true);
            return list;
                wc=0;
            }
        }
                start = i+1;
                tc=0;
            if(tc+wc-1>maxWidth){
                i--; // to reject excess word 
                text(words,maxWidth,list,start,i,false);
            tc+=words[i].length();
            wc++; 
        for(int i=0;i<words.length;i++){
        int wc=0; //word count
        int start =0; 
    public List<String> fullJustify(String[] words, int maxWidth) {
        List <String> list =new ArrayList<>();
        int tc=0; // total count
