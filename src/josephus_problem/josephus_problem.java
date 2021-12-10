package josephus_problem;

// Q:)
//There are N people standing in a circle waiting to be executed.
//The counting begins at some point in the circle and proceeds around the circle in a fixed direction.
//In each step, a certain number of people are skipped and the next person is executed.
//The elimination proceeds around the circle (which is becoming smaller and smaller,
//as the executed people are removed), until only the last person remains, who is given freedom.
//Given the total number of persons N and a number K which indicates that K-1 persons are skipped and
//the kth person is killed in a circle. The task is to choose a place in the initial circle.
//So that you are the last one remaining, and you survive.


// references: https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/

public class josephus_problem {
    static int josephus(int n, int k) {
        if (n == 1)  // base condition
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        int n = 100;
        int k = 2;
        System.out.println(josephus(n, k));
    }
}
