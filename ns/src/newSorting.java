public class newSorting {
    //passed an array of int pos/neg with dupes along with size to know when to swap to quick sort
    public void newSorting(int [] A, int size){
        //base case
        if(A.length <= size){
            recursiveQuicksort(A);  //if array is smaller then size recursive quick sort it
        }else{
            //new sort left and right of the array
            //merge sorted halves after
            int mid = A.length / 2; //find middle of the array
            int [] left = new int[mid];
            int [] right = new int[A.length - mid];

            //populate left half array with respective data
            for(int i=0; i<mid; i++){
                left[i] = A[i];
            }

            //populate right half array with respective data
            for(int i=mid; i<A.length; i++){
                right[i] = A[i];
            }

            //new sort left and right half sides of the array
            newSorting(left, size);
            newSorting(right, size);

            //merge sorted halves
            mergeSortedHalves(A,left,right);
        }
    }
    /////////////////////////////////////////////////////////////////////
    private void mergeSortedHalves(int [] A, int [] left, int [] right) {
        int cL = 0;     //counter for left array
        int cR = 0;     //counter for right array
        int cA = 0;     //counter for main array
        while (cL + cR != A.length) {   //while we haven't put the array together, do this
            if (left[cL] < right[cL]) { //if the left array data is smaller put it in the main array
                A[cA] = left[cL];
                cL++;                   //increment left side array as we don't need that spot anymore
                cA++;                   //increment main array counter so we don't override data just added
            }else{
                A[cA] = right[cR];  //else put the right array data in the main array
                cA++;               //increment right side array as we don't need that spot anymore
                cR++;               //increment main array counter so we don't override data just added
            }
        }
    }

    /////////////////////////////////////////////////////////////////////
    //initiator method
    private void recursiveQuicksort(int [] A){
        recursiveQuicksort(A,0,A.length-1);
    }

    //////////////////////////////////////////////////////////////////////
    //actually does the recursion
    private void recursiveQuicksort(int [] A, int start, int end){
        int pivot = A[0];                   //select pivot
        int mid = A.length/2;               //find middle of array
        int [] A1 = new int[mid];           //declare 2 new arrays to be used
        int [] A2 = new int[A.length - mid];
        //partition using the pivot into the new arrays
        for(int i=1; i<A.length; i++){
            if(A[i] < pivot){
                A1[i] = A[i];
            }else{
                A2[i] = A[i];
            }
        }
        recursiveQuicksort(A1);
        recursiveQuicksort(A2);
        mergeSortedHalves(A,A1,A2);
    }
}
