public class newSorting {
    //passed an array of int pos/neg with dupes along with size to know when to swap to quick sort
    //not sure where size is gotten from, must ask michele tomorrow
    public void newSorting(int [] A, int size){
        //base case
        if(A.length < size){
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
    public void mergeSortedHalves(int [] A, int [] left, int [] right){

    }
    /////////////////////////////////////////////////////////////////////
    public void recursiveQuicksort(int [] A){
        int pivot = A[0];   //select pivot
        int mid = A.length/2;
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
