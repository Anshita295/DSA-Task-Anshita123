public class twosum {
    public static void main(String[] args) {
        int[]nums={2,7,11,15};
        int target = 9;
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }  
        for(int k=0;k<ans.length;k++){
            System.out.print(ans[k]+" ");

        }
   
    
}
}
