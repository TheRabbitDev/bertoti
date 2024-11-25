class Strategy {
    public static void main (String[] args){
        FerramentaDeEncriptacao tool = new FerramentaDeEncriptacao(new Atbash());
        tool.encript("The Quick Brown Fox Jumps Over The Lazy Dog");

        tool.setMethod(new A1Z26());
        tool.encript("The Quick Brown Fox Jumps Over The Lazy Dog");

        tool.setMethod(new Caesar());
        tool.encript("The Quick Brown Fox Jumps Over The Lazy Dog");
    }
}