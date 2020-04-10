import org.junit.jupiter.api.Test;

public class newSortingTester {
    //Test Case #1
    //Justification: Testing a sorted array of a single duplicated number. Even array length
    @Test
    public void testnewSorting1(){
        int A [] = {3,3,3,3,3,3};
        newSorting ns = new newSorting();
        ns.newSorting(A,3);
    }

    //Test Case #2
    //Justification: Testing an already sorted array to see if its moved at all. Even array length
    @Test
    public void testnewSorting2(){
        int A [] = {1,2,3,4,5,6,7,8,9,10};
        newSorting ns = new newSorting();
        ns.newSorting(A,5);
    }

    //Test Case #3
    //Justification: Testing an array of all negative unordered numbers to check program. Odd array length
    @Test
    public void testnewSorting3(){
        int A [] = {-1,-11,-5,-3,-4,-2,-6};
        newSorting ns = new newSorting();
        ns.newSorting(A,3);
    }

    //Test Case #4
    //Justification: Testing a standard array containing both pos and neg ints. Even array length
    @Test
    public void testnewSorting4(){
        int A [] = {3,-2,4,-5,7,2};
        newSorting ns = new newSorting();
        ns.newSorting(A,3);
    }

    //Test Case #5
    //Justification: Testing a standard unordered array with all pos ints, odd array length
    @Test
    public void testnewSorting5(){
        int A [] = {7,128,64,12,1,7,90,82,77};
        newSorting ns = new newSorting();
        ns.newSorting(A,4);
    }

}
