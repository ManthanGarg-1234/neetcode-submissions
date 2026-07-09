class Solution {
    public boolean isHappy(int n) {
        int num=n;
        HashSet<Integer>set=new HashSet<>();
        while(num != 1 && !set.contains(num)){
            set.add(num);
            int sum=0;
            while(num>0){
                int digit=num%10;
                sum+=digit*digit;
                num/=10;
            }
            num=sum;
        }
        return num==1;
    }
}
