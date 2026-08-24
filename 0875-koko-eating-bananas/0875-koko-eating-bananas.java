class Solution {
    public int maxEl(int piles[]){
        int n=piles.length;
        int maxi=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            maxi=Math.max(piles[i],maxi);
        }
        return maxi;
    }
    public int totalHours(int piles[],int hourly){
        int totalh=0;
        for (int i=0;i<piles.length;i++){
            totalh+=Math.ceil((double)piles[i]/(double)hourly);
        }
        return totalh;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=maxEl(piles);
        while (low<=high){
            int mid=(low+high)/2;
            int totalh=totalHours(piles,mid);
            if (totalh<=h){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return low;
    }
}