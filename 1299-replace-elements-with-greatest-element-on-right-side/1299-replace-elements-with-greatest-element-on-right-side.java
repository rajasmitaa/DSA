class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int mx=-1;
        for (int i=n-1;i>=0;i--){
            if (arr[i]>mx){
                int temp=arr[i];
                arr[i]=mx;
                mx=temp;
            }
            else
                arr[i]=mx;
        }
        return arr;
    }
}