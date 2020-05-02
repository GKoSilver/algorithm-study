package 力扣题;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1,len2;
        int i,j;
        int a=0,b=0;
        len1=nums1.length;
        len2=nums2.length;
        int []nums3=new int[len1+len2];
        System.arraycopy(nums1,0,nums3,0,len1);
        System.arraycopy(nums2,0,nums3,len1,len2);
        nums3=mergeSort(nums3, 0, nums3.length - 1);
        double z=0;
        if((len1+len2)%2==0){
            a=nums3[(len1+len2-2)/2];
            b=nums3[(len1+len2)/2];
            z=(a+b)/2.0;
        }
        else{
            z=nums3[(len1+len2-1)/2]*1.0;
        }
        return z;
        
        
    }
    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }
    }

    public static int[] mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            mergeSort(a, low, mid);
            // 右边
            mergeSort(a, mid + 1, high);
            // 左右归并
            merge(a, low, mid, high);
            
            //System.out.println(Arrays.toString(a));
            
        }
        return a;

    }
}
