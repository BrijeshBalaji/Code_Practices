        }
        if(target<0)return;
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            sub(i,nums,target-nums[i],ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}
