class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

int n=grid.length;
int size=n*n;

long expectedsum=(long)size*(size+1)/2;
long expectedsumsq=(long)size*(size+1)*(2*size+1)/6;

long actualsum=0, actualsumsq=0;

for(int[]row:grid){
    for(int num:row){
        actualsum+=num;
        actualsumsq+=(long)num*num;
            }
}

long diff1=expectedsum-actualsum;
long diff2=expectedsumsq-actualsumsq;

long sum=diff2/diff1;

int missing=(int)(diff1+sum)/2;
int repeated=(int)sum-missing;

return new int[]{repeated,missing};

    







    }
}