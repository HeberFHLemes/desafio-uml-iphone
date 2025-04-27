package implementandoDiagrama;

public class IPhone implements ReprodutorMusica, AparelhoTelefonico, NavegadorInternet{
    
    public IPhone(){}

    @Override
    public void tocar(){
        System.out.println("Tocando música selecionada. ");
    }
    
    @Override
    public void pausar(){
        System.out.println("Música pausada.");
    }
    
    @Override
    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }
    
    @Override
    public void atender(){
        System.out.println("Ligação atendida");
    }
    
    @Override
    public void ligar(String numero){
        System.out.println("Ligando para " + numero + "...");
    }
    
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz... ");
    }
    
    @Override
    public void exibirPagina(String url){
        System.out.println("Página atual: " + url);
    }
    
    @Override
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada. ");
    }
    
    @Override
    public void atualizarPagina(){
        System.out.println("Página atualizada. ");
    }
}
