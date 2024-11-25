public class Atbash implements metodoEncriptacao{
    @Override
    public String encriptar(String encriptar){
        char[] atbash = "zyxwvutsrqponmlkjihgfedcba".toCharArray();
        char[] ATBASH = "ZYXWVUTSRQPONMLKJIHGFEDCBA".toCharArray();
        char[] cArray = encriptar.toCharArray();
        StringBuilder decrypted = new StringBuilder();

        for (char c: cArray) {
            int i = c;
            if (c >= 65 && c <= 90) i = ATBASH[(i - 65)];
            if (c >= 97 && c <= 122) i = atbash[(i - 97)];
            decrypted.append((char) i);
        }
        return decrypted.toString();
    }
}
