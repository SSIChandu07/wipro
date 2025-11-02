/*Question 3
Marks: 0/1

Reverse each word in a string
Write a function to reverse each word in a string.

Description :- A method has to be created that takes a string as input and extracts each word from that string and then reverse each word individually and gives the output as a reversed string. 

Example :-

Input:- great learning

output :- taerg gninrael

input :- hello guys how are you

output :- olleh syug woh era uoy



Explanations :- As the input string is great learning, each word has to be extracted i.e. great and learning then individually each word has to be reversed so it will be taerg and gninrael. after combining these two words into as single string the final output will be taerg gninrael.

Your answer
*/
public class Ma {

    // Reverse each word individually and return the transformed string
    public static String reverseWords(String input) {
        if (input == null || input.isEmpty()) return input;

        // split on any whitespace (handles multiple spaces/tabs)
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // convert to lowercase, then reverse the characters of the word
            StringBuilder reversed = new StringBuilder(word.toLowerCase());
            result.append(reversed.reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        // If you want manual input for testing, set this string directly:
        // String input = "great learning";

        // For the judge (reading from stdin):
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String input = "";
        if (sc.hasNextLine()) {
            input = sc.nextLine();
        }
        sc.close();

        System.out.println(reverseWords(input));
    }
}