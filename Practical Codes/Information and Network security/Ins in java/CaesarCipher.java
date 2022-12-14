import java.util.*;

public class CaesarCipher {
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	public static String encryptData(String inputStr, int shiftKey) {
		inputStr = inputStr.toLowerCase();
		String encryptStr = "";

		for (int i = 0; i < inputStr.length(); i++) {
			int pos = ALPHABET.indexOf(inputStr.charAt(i));
			int encryptPos = (shiftKey + pos) % 26;
			char encryptChar = ALPHABET.charAt(encryptPos);
			encryptStr += encryptChar;
		}

		return encryptStr;

	}
	public static String decryptData(String inputStr, int shiftKey){
		inputStr=inputStr.toLowerCase();
		String decryptStr="";

		for(int i=0;i<inputStr.length();i++){
			int pos=ALPHABET.indexOf(inputStr.charAt(i));
			int decryptPos=(pos-shiftKey)%26;
			char decryptChar=ALPHABET.charAt(decryptPos);
			decryptStr+=decryptChar;
		}
		return decryptStr;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter plaintext: ");
		String inputStr = sc.nextLine();
		System.out.println("Enter secret key: ");
		int shiftKey = sc.nextInt();
		System.out.println("Encrypted Data: " + encryptData(inputStr, shiftKey));
		System.out.println("Decrypted Data: "+ decryptData(encryptData(inputStr, shiftKey),shiftKey));
		sc.close();
	}
}