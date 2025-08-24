import java.util.*;

public class CaesarCipher{

    public static StringBuilder Decoder(String sentence){
        int ascii;
        int shift = -23;
        int code;
        StringBuilder decodedSentence = new StringBuilder("");
        for (int i = 0; i<sentence.length(); i++){
            ascii = (int) sentence.charAt(i);
            if (97<=ascii && ascii<=122){
                // letter
                code = (ascii + shift - 97 + 26) % 26 + 97; 
            } else if ((65<=ascii && ascii <=90)){
                // capital letter
                code = (ascii + shift - 65 + 26) % 26 + 65; 
            } else {
                // special character
                code = ascii;
            }
            decodedSentence.append((char) code);
        }
        return decodedSentence;
    }

    public static StringBuilder Encoder(String sentence){
        int ascii;
        int shift = 23;
        int code;
        StringBuilder encodedSentence = new StringBuilder("");
        for (int i = 0; i<sentence.length(); i++){
            ascii = (int) sentence.charAt(i);
            if (97<=ascii && ascii<=122){
                // letter
                code = (ascii + shift - 97 + 26) % 26 + 97; 
            } else if ((65<=ascii && ascii <=90)){
                // capital letter
                code = (ascii + shift - 65 + 26) % 26 + 65; 
            } else {
                // special character
                code = ascii;
            }
            encodedSentence.append((char) code);
        }
        return encodedSentence;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence :- ");
        String sentence = sc.nextLine();
        System.out.print("Choose: (1) Encode  (2) Decode :- ");
        int choice = sc.nextInt();
        if (choice == 1){
            System.out.println(Encoder(sentence));
        } else {
            System.out.println(Decoder(sentence)); 
        }
        sc.close();
    }
}