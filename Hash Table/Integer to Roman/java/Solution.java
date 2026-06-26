class Solution {
    public String intToRoman(int num) {
      Map<Integer, Character> map = new HashMap<>();  
      StringBuilder sb = new StringBuilder();
        map.put(1,'I');
        map.put(5,'V');
        map.put(10,'X');
        map.put(50,'L');
        map.put(100,'C');
        map.put(500,'D');
        map.put(1000,'M');
        
        int sum=0;
        while(sum<num){
            if(num-sum >= 1000){
              sum+=1000;
              sb.append(map.get(1000));
            }
            else if(num-sum>=900 && num-sum < 1000)
            {
                sum+=1000-100;
                sb.append(map.get(100));
                sb.append(map.get(1000));
            }
            else if(num-sum >= 500){
                sum+=500;
                sb.append(map.get(500));
            }
            else if(num-sum >=400 && num-sum <500)
            {
                sum+=400;
                sb.append(map.get(100));
                sb.append(map.get(500));
            }
            else if(num-sum >= 100){
                sum+=100;
                sb.append(map.get(100));
            }
            else if(num-sum >=90 && num-sum<100)
            {
                sum+=90;
                sb.append(map.get(10));
                sb.append(map.get(100));
            }
            else if(num-sum >= 50){
                sum+=50;
                sb.append(map.get(50));
            }
            else if(num-sum >= 40 && num-sum < 50){
                sum+=50-10;
                sb.append(map.get(10));
                sb.append(map.get(50));
            }
            else if(num - sum >=10){
                sum +=10;
                sb.append(map.get(10));
            }
            else if(num-sum ==9){
                sum+=9;
                sb.append(map.get(1));
                sb.append(map.get(10));
            }
            else if(num - sum >=5){
                sum+=5;
                sb.append(map.get(5));
            }
            else if(num-sum == 4){
                sum+=4;
                sb.append(map.get(1));
                sb.append(map.get(5));
            }
            else{
                sum+=1;
                sb.append(map.get(1));
            }
        }
        return sb.toString();
    }
}