package com.practice.lis;
import java.util.ArrayList;  
import java.util.List;

public class Lis {  
    static List<Integer> findLIS(int[] arr) {
        List<List<Integer>> N = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            N.add(new ArrayList<>());
        }

        N.get(0).add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && N.get(i).size() < N.get(j).size() + 1) {
                    N.set(i, new ArrayList<>(N.get(j)));
                }
            }
            N.get(i).add(arr[i]);
        }

        List<Integer> longest = N.get(0);
        for (int i = 0; i < N.size(); i++) {
            if (longest.size() < N.get(i).size()) {
                longest = new ArrayList<>(N.get(i));
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        System.out.println(findLIS(arr).toString());
    }
}