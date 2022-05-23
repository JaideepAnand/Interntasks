class Main {

public static int subsetXORSum(int[] nums) {
    
    int n=nums.length;
    int bits = 0;
    for(int i=0; i<n; i++){
        bits |= nums[i];
    
    }
    return bits * (int)Math.pow(2,n-1);
}
    public static void main(String[]args)
    { int a[]={1,3,4,5};
   System.out.print(subsetXORSum(a));
}

}
