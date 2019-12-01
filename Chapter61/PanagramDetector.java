import java.util.*;

class PanagramDetector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type a sentence and see if its a panagram");
        String sentence = scan.nextLine();

        int[] letterCount = new int[26];
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
         's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        for (int i = 0; i < sentence.length(); i++) {

            char currentChar = sentence.toLowerCase().charAt(i);

            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == currentChar) letterCount[j] += 1;
            }
        }

        int panagram = 0;

        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] <= 0){
              panagram = 1;
            }
        }

        if (panagram == 0) {
            System.out.println("PANAGRAM DETECTED");
        } else {
            System.out.println("PANAGRAM NOT DETECTED");
        }
    }
}
