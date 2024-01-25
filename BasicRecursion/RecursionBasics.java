package BasicRecursion;

public class RecursionBasics{

    public static int count=0;

    public static void fWithBaseCondition() {
        //base condition
        if(count==4)return;
        System.out.println(count);
        count++;
        fWithBaseCondition();
    }

    public static void fWithNoBaseConditio() {
        //infinite recursion
        System.out.println(count);
        count++;
        fWithNoBaseConditio();
    }

    //print name N times
    //Time Complexity: O(N)
    //Stack Space: O(N)
    public static void printNameNTimes(int i, int N){
        //base case
        if(i>N) return;
        System.out.println("Sam");
        //increment the index
        printNameNTimes(i+1,N);
    }

    //print linearly from 1 to N
    public static void printOneToN(int i, int N){
        if(i>N) return;
        System.out.println(i);
        printOneToN(i+1,N);
    }

    //print linearly from N to 1
    public static void printNToOne(int i, int N){
        if(i<1) return;
        System.out.println(i);
        printNToOne(i-1,N);
    }

    //print linearly from 1 to N using Backtract
    public static void printOneToNBacktrack(int i, int N){
        if(i<1) return;
        printOneToNBacktrack(i-1, N);
        System.out.println(i);
    }

    //print linearly from N to 1 using Backtract
    public static void printNToOneBacktrack(int i, int N){
        if(i>N) return;
        printNToOneBacktrack(i+1,N);
        System.out.println(i);
    }

    public static void main(String[] args) {
        // fWithNoBaseConditio();
        // fWithBaseCondition();
        // printNameNTimes(1,5);
        // printOneToN(1, 4);
        // printNToOne(5,5);
        // printOneToNBacktrack(5,5);
        printNToOneBacktrack(1,5);
    }
}