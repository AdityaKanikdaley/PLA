package Permutations;

public class permutations {
    static void permute(char[] letters,int position) {

        if (position == letters.length-1){  // base condition
            System.out.print(letters);
            System.out.println();
            return;
        }

        for(int index=position;index<letters.length;index++) {
            char temp = letters[position];
            letters[position] = letters[index];
            letters[index] = temp;

            permute(letters, position+1);

            temp = letters[position];
            letters[position] = letters[index];
            letters[index] = temp;
        }
    }
    public static void main(String[] args) {
        String  word = "ABC";
        char[] letters = word.toCharArray();
        permute(letters, 0);
    }
}