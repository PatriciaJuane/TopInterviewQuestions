public class MergeSortedArrays {

/*Merge from MergeSort*/
 public void merge1(int[] nums1, int m, int[] nums2, int n) {    
        int i=0, j= 0, k=0;     
        while(i<m && j<n) {
            if(nums1[i]<nums2[j]) {
                nums1[k] = nums1[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }       
        while(i<m) {
            nums1[k] = nums1[i];
            k++;
            i++;
        }   
        while(j<n) {
            nums1[k] = nums2[j];
            k++;
            j++;
        } 
        
    }
    	
      /*Our solution Merge*/
public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int first = m-1;
        int second =  n-1;

        for (int i = m + n - 1; i >= 0; i--) {
            if (second < 0) {
              break;
            }

            if (first >= 0 && nums1[first] > nums2[second]) {
              nums1[i] = nums1[first];
              first--;
            } else {
              nums1[i] = nums2[second];
              second--;
            }
        }
    }    

}