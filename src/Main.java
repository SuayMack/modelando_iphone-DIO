public class Main {
  public static void main(String[] args) {
      iPhone meuIphone = new iPhone("iPhone 13", "12345678", 128.0);

      // Usando o reprodutor musical
      meuIphone.selecionarMusica("Minha Música Favorita");
      meuIphone.tocar();
      meuIphone.pausar();

      // Usando o aparelho telefônico
      meuIphone.ligar("123-456-7890");
      meuIphone.atender();
      meuIphone.iniciarCorreioVoz();

      // Usando o navegador na internet
      meuIphone.exibirPagina("https://www.exemplo.com");
      meuIphone.adicionarNovaAba();
      meuIphone.atualizarPagina();

      // Usando a câmera
      meuIphone.tirarFoto();
      meuIphone.gravarVideo();
  }
}
