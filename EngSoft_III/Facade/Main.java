class Facade {
    public static void main (String[] args){
        FacadeConversor converterArquivo= new FacadeConversor();
        converterArquivo.convertFile("file.png", ".jpg");
    }
}