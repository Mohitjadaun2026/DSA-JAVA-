class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        

int n=arr.length;
int maxlen=0;

Set<Integer> set= new HashSet<>();

for(int num:arr){
    set.add(num);
}


for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        int a=arr[i],b=arr[j],count=2;

        while(set.contains(a+b)){
            int c=a+b;
            a=b;
            b=c;

            count++;
        }
        maxlen=Math.max(maxlen,count);
    }}

    return maxlen >=3 ? maxlen:0;
}
    }













        
    