import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(sc.nextInt());
        }

        List<Integer> list = gradingStudents(ls);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        sc.close();
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int x = grades.get(i);
            if (x >= 38 && (((x + 5) - (x % 5)) - x < 3)) {
                list.add((x + 5) - (x % 5));
            } else {
                list.add(x);
            }
        }

        return list;
    }
}