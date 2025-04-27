package implementandoDiagrama;

public class ImplementandoDiagrama{
    public static void main(String[] args) {
        
        IPhone meuIPhone = new IPhone();
        
        // Músicas
        meuIPhone.selecionarMusica("Música Um");
        meuIPhone.tocar();
        meuIPhone.pausar();
        System.out.println();
        
        // Telefone
        meuIPhone.atender();
        meuIPhone.ligar("+550090123-4567");
        meuIPhone.iniciarCorreioVoz();
        System.out.println();
        
        // Navegador
        meuIPhone.adicionarNovaAba();
        meuIPhone.exibirPagina("www.dio.me");
        meuIPhone.atualizarPagina();
    }
}

