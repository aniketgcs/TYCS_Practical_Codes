public class MonoAlphabetic2 {
    public static char normalChar[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z' };

    public static char codedChar[] = { 'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R',
            'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I',
            'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A' };

    public static String stringEncryption(String s) {
        String encryptedString = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {

                if (s.charAt(i) < 'a' || s.charAt(i) > 'z') {
                    encryptedString += s.charAt(i);
                    break;
                }

            }
        }
        return encryptedString;
    }

    public static String stringDecryption(String s){
        String decryptedString="";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<26;j++){
                if(s.charAt(i)==codedChar[j]){
                    decryptedString+=normalChar[j];
                        break;}
                if(s.charAt(i)<'A' || s.charAt(i)>'Z'){
                    decryptedString+=s.charAt(i);
                        break;

                        }
                        }
                        }
return decryptedString;
                            }}
