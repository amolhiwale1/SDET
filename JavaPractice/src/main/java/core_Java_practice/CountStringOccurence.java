package core_Java_practice;

public class CountStringOccurence {

    public static void main(String[] args) {
        int count = countOccurance("aaagaad", 'a');
        System.out.println(count);
    }

    private static int countOccurance(String word, char a) {
        int count = 0;
        for(int i = 0;i<word.length();i++){
            if (word.charAt(i)==a){
                count++;
            }
        }
        return count;
    }
}
