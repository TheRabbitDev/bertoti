public class FacadeConversor {
    private ArquivoCarregar carregar;
    private FormatoAnalisar analisar;
    private ArquivoConversor conversor;
    private ArquivoSalvar salvar;
    public FacadeConversor(){
        this.carregar = new ArquivoCarregar();
        this.analisar = new FormatoAnalisar();
        this.conversor = new ArquivoConversor();
        this.salvar = new ArquivoSalvar();
    }

    public void convertFile(String name, String outputFormat){
        System.out.println("\t* Começando a conversão de arquivos *");

        carregar.load(name);
        analisar.parse(name);
        conversor.convert(outputFormat);
        salvar.save(name, outputFormat);

        System.out.println("\t* Encerrando a conversão de arquivos *");
    }
}
