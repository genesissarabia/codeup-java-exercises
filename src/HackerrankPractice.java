import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HackerrankPractice {


//    public static void main(String[] args) {

        //1. Find the missing strings:
        //Given two strings, s1, and s2, find the missing strings in s1 that are not in s2 and return them as an ArrayList of Strings.
        //Example: If s1 = "Hello my name is Cody" and s2 = "My is Cody", return a list of missing words, such as ["hello", "name"].

//        String s1 = "Howdy all my friends from Aggieland";
//        String s2 = "All friends Aggieland again";
//
//        String[] arrS1 = s1.split(" ");
//        System.out.println(Arrays.stream(arrS1).toList());
//
//        String[] arrS2 = s2.split(" ");
//        System.out.println(Arrays.stream(arrS2).toList());
//
//        Set<String> set1 = new HashSet<>();
//        Set<String> set2 = new HashSet<>();
//
//        for (String word : arrS1) {
//            set1.add(word.toLowerCase());
//        }
//
//        for (String word : arrS2) {
//            set2.add(word.toLowerCase());
//        }
//
//        System.out.println("Missing words in s2:");
//
//        for (String word : set1) {
//            if (!set2.contains(word)) {
//                System.out.println(word);
//            }
//        }
//
//        System.out.println("Missing words in s1:");
//
//        for (String word : set2) {
//            if (!set1.contains(word)) {
//                System.out.println(word);
//            }
//        }
        //2. Find the first word that contains the maximum number of even characters:
        //Given a sentence as a String, find the first word in the sentence with the highest number of even characters.
        //If there are no words with an even number of characters, return "00".
        //Example: For the sentence "This is a sentence, and my name is John", the result would be "This". If the sentence is "hit the hay", the result would be "00".



//        public static void main(String[] args) {
//            String sentence = "[Hi, from all my friends in Aggieland]";
//            String strSentence = removeNonAlphanumeric(sentence);
//            String result = findWordWithMaxEvenCharacters(strSentence);
//            System.out.println(result);  // Output: This
//        }
//
//    public static String
//    removeNonAlphanumeric(String str)
//    {
//        // replace the given string
//        // with empty string
//        // except the pattern "[^a-zA-Z0-9]"
//        str = str.replaceAll(
//                "[^a-zA-Z0-9]", " ");
//
//        // return string
//        return str;
//    }
//
//
//        public static String findWordWithMaxEvenCharacters (String sentence){
//            String[] words = sentence.split(" ");
//
//            int maxEvenCount = 0;
//            String wordWithMaxEvenCharacters = "00";
//
//            for (String word : words) {
//                int evenCount = 0;
//                for (char c : word.toCharArray()) {
//
//                    if (Character.isLetter(c) && c % 2 == 0) {
//                        evenCount++;
//                        System.out.println(c);
//                        System.out.println(evenCount);
//                    }
//                }
//                if (evenCount > maxEvenCount) {
//                    maxEvenCount = evenCount;
//                    wordWithMaxEvenCharacters = word;
//                }
//            }
//
//            return wordWithMaxEvenCharacters;
//
//        }

//3. Find the next greatest permutation given a word:
//Given a word as a String, return the next greatest permutation.
//If there is no next greatest permutation, return "no answer".
//Example: For the word "abc", the result would be "bac". If there is no next-greatest permutation, the result would be "no answer".
//    public static void main(String[] args) {
//
//        String string = "howdy";
//       findPermutation(string, "");
//
//    }
//
//    static void findPermutation(String word, String currentPerm){
//
//        if (word.length() == 0) {
//            // print ans
//            System.out.print(currentPerm + " ");
//
//        }
//
//        for (int i =0; i < word.length(); i++){
//            char ch = word.charAt(i);
//            String restOfStringAfterCh = word.substring(0, i) + word.substring(i + 1);
//            findPermutation(restOfStringAfterCh, currentPerm + ch);
//        }
//
//    }
//    }

//4. A question about a game involving Bob and Wendy moving color pieces, where you need to build an array to determine the winner.

//    public static boolean winnerOfGame(String colors) {
//        int countA = 0;
//        int countB = 0;
//
//        for (int i = 1; i < colors.length() - 1; i++) {
//            if (colors.charAt(i) == 'A') {
//                if (colors.charAt(i - 1) == 'A' && colors.charAt(i + 1) == 'A')
//                    countA++;
//            } else {
//                if (colors.charAt(i - 1) == 'B' && colors.charAt(i + 1) == 'B')
//                    countB++;
//            }
//        }
//
//        if (countA > countB) {
//            Boolean alice = true;
//            return alice;
//        }else {
//            boolean bob = false;
//            return bob;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(winnerOfGame("AAAAAAABBBBBB"));
//    }


//5. A question about array removal and addition, where two values are removed and two new values are added to an array, resulting in a numeric output.







}



















