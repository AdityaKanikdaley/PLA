package combination_r_elements;

// Q
// print all possible combinations of r elements on a given number say of size n
// example: input number say = 1,2,3,4
//          r = 2
//          output = (1,2), (1,3), (1,4), (2,3), (2,4), (3,4)
public class combination_r_elements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int combSize = 2;
        int numSize = numbers.length;
        int[] comb = new int[combSize];
        combinations(numbers, comb, combSize, numSize, 0, 0);
    }

    static void combinations(int[] numbers, int[] comb, int combSize, int numSize, int combIndex, int numIndex) {

        if (combIndex == combSize) {  // after selecting numSize elements
            for (int i : comb)
                System.out.print(i + " ");
            System.out.println();
            return;
        }

        if (numIndex >= numSize)
            return;

        comb[combIndex] = numbers[numIndex];
        combinations(numbers, comb, combSize, numSize, combIndex + 1, numIndex + 1);
        combinations(numbers, comb, combSize, numSize, combIndex, numIndex + 1);
    }
}
