package esanto.lucas.continumn.exeptions;

public class TitleNotFoundExepion extends RuntimeException {
    private String mensagem;
    public TitleNotFoundExepion(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage(){
        return this.mensagem;
    }
}
