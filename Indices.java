import java.io.*;
import java.util.*;

class Indices {
    public static void main(String[] Args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        AllIndexes(arr,n,x);
    } 
    public static int AllIndexesRecursive(int[] input, int size,int x, int[] output){
        //if the inpur array becomes empty
        if(size == 0){
            return 0;
        }
        int smallAns = AllIndexesRecursive(input,size -1,x,output);
        if(input[size - 1]==0){
            output[smallAns++] = size - 1;
        }
        return smallAns;
    }
    static void AllIndexes(int[] input,int n,int x){
        int[] output = new int[n];
        int size = AllIndexesRecursive(input, n, x, output);
        for(int i = 0;i<size;i++){
            System.out.print(output[i] + ' ');
        }
    }
}