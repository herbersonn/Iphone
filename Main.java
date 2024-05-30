public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();
        
        // Testando métodos de ReprodutorMusical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine");

        // Testando métodos de AparelhoTelefonico
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando métodos de NavegadorInternet
        meuIPhone.exibirPagina("www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
