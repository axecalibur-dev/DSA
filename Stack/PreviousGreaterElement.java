import java.io.*;
import java.util.*;

class Solution {
    public static void print(int arr[]) {
        Stack<Integer> s = new Stack<>();
        s.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            while (s.isEmpty() == false && s.peek() <= arr[i]) {
                s.pop();
            }

            int exit = s.empty() ? -1 : s.peek();
            System.out.println(exit);
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 20, 30, 10, 5, 15 };

        print(arr);
    }
}