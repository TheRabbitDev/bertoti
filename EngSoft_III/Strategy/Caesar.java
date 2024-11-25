public class Caesar implements metodoEncriptacao{
    @Override
    public String encriptar(String encriptar){
        char[] cArray = encriptar.toCharArray();
        StringBuilder decifrado = new StringBuilder();

        for (char c: cArray) {
            int i = c + 3;
            if ((i >= 91 && i <= 93) || (i>= 123 && i<= 125)) i -= 26;
            if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
                decifrado.append((char) i);
            } else {
                decifrado.append(c);
            }
        }
        return decifrado.toString();
    }
}
