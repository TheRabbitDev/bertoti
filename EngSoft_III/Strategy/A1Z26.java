public class A1Z26 implements metodoEncriptacao{
    @Override
    public String encriptar(String encriptar){
        char[] cArray = encriptar.toCharArray();
        StringBuilder decrypted = new StringBuilder();
        for (char c: cArray) {
            int i = c;
            if (c >= 65 && c <= 90) {
                i = (i - 64);
            }
            else if (c >= 97 && c <= 122) {
                i = (i - 96);
            }

            if (i >= 1 && i <= 26) {
                decrypted.append(i).append(" ");
            }
        }
        return decrypted.toString().trim();
    }
}
