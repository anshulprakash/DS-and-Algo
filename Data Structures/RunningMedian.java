import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        double[] medians = getMedians(a);
        for(double median: medians){
            System.out.println(median);
        }
    }
    
    public static void addNumber(int num, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){

        if(lowers.size() == 0 || num < lowers.peek()){
            lowers.add(num);
        }else{
            highers.add(num);
        }
    }

    public static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
        PriorityQueue<Integer> biggerHeap = lowers.size() > higher.size()? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > higher.size()? highers : lowers;

        if(biggerHeap.size() - smallerHeap.size() >= 2){
            smallerHeap.add(biggerHeap.poll());
        }
    }

    public static double rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
        PriorityQueue<Integer> biggerHeap = lowers.size() > higher.size()? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > higher.size()? highers : lowers;

        if(biggerHeap.size() == smallerHeap.size()){
            
            return (biggerHeap.peek() + smallerHeap.peek()) / 2.0;
        }else{
            return biggerHeap.peek();
        }
    }

    public static void getMedians(int[] arr){

        PriorityQueue<Integer> highers = new PriorityQueue<>();
        PriorityQueue<Integer> lowers = new PriorityQueue<>(10, new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                return -1 * i1.compareTo(i2);
            }
        });

        int[] medians = new int[arr.length];

        for(int i = 0; i < arr.length; i++){

            int num = arr[i];
            addNumber(num, lowers, highers);
            rebalance(lowers, highers);
            double median = getMedian(lowers, highers);
            medians[i] = median;
        }
    }
}
