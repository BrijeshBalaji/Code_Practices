                while(ss.length()<maxWidth){
                    ss.append(" ");
                }
                list.add(ss.toString());
                return;
            }
            List<StringBuilder> temp=new ArrayList<>();
            int tc=0;
            for(int i=start;i<=end;i++){
                temp.add(new StringBuilder(words[i]));
                tc+=words[i].length();
            }
            int remainingSpace = maxWidth-tc;
            int ind=0;
            while(remainingSpace > 0){
                temp.get(ind).append(" ");
                ind++;
                remainingSpace--;
                if(ind == temp.size()-1)ind =0;
            }
            StringBuilder sb=new StringBuilder();
            for(StringBuilder word: temp)sb.append(word);
            list.add(sb.toString());
        }
}
