class Solution {
    public boolean canWePlace(int position[],int dist,int balls){
        int cntballs=1,last=position[0];
        for (int i=1;i<position.length;i++){
            if ((position[i]-last)>=dist){
                cntballs++;
                last=position[i];
            }
            if (cntballs>=balls)
                return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int low=1,high=position[n-1]-position[0];
        while (low<=high){
            int mid=(low+high)/2;
            if (canWePlace(position,mid,m)==true)
                low=mid+1;
            else
                high=mid-1;
        }
        return high;
    }
}