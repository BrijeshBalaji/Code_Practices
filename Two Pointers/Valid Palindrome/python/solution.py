                right--;
             }
             else if(!Character.isLetterOrDigit(r)){
                left++;
             }
            char r = s.charAt(right);
             if(!Character.isLetterOrDigit(l)){
            char l = s.charAt(left);
             else{
                if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                    return false;
                }
                left++;
                right--;
