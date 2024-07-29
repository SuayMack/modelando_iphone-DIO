public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet, Camera {
  private String modelo;
  private String numeroDeSerie;
  private double capacidadeDeArmazenamento;
  private double espacoDisponivel;

  // Construtor
  public iPhone(String modelo, String numeroDeSerie, double capacidadeDeArmazenamento) {
      this.modelo = modelo;
      this.numeroDeSerie = numeroDeSerie;
      this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
      this.espacoDisponivel = capacidadeDeArmazenamento; // Inicialmente, todo o espaço está disponível
  }

  // Getters e Setters
  public String getModelo() {
      return modelo;
  }

  public void setModelo(String modelo) {
      this.modelo = modelo;
  }

  public String getNumeroDeSerie() {
      return numeroDeSerie;
  }

  public void setNumeroDeSerie(String numeroDeSerie) {
      this.numeroDeSerie = numeroDeSerie;
  }

  public double getCapacidadeDeArmazenamento() {
      return capacidadeDeArmazenamento;
  }

  public void setCapacidadeDeArmazenamento(double capacidadeDeArmazenamento) {
      this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
  }

  public double getEspacoDisponivel() {
      return espacoDisponivel;
  }

  public void setEspacoDisponivel(double espacoDisponivel) {
      this.espacoDisponivel = espacoDisponivel;
  }

  // Implementação dos métodos da interface ReprodutorMusical
  @Override
  public void tocar() {
      System.out.println("Reproduzindo música...");
  }

  @Override
  public void pausar() {
      System.out.println("Música pausada.");
  }

  @Override
  public void selecionarMusica(String musica) {
      System.out.println("Música selecionada: " + musica);
  }

  // Implementação dos métodos da interface AparelhoTelefonico
  @Override
  public void ligar(String numero) {
      System.out.println("Ligando para: " + numero);
  }

  @Override
  public void atender() {
      System.out.println("Atendendo chamada...");
  }

  @Override
  public void iniciarCorreioVoz() {
      System.out.println("Iniciando correio de voz...");
  }

  // Implementação dos métodos da interface NavegadorInternet
  @Override
  public void exibirPagina(String url) {
      System.out.println("Exibindo página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
      System.out.println("Nova aba adicionada.");
  }

  @Override
  public void atualizarPagina() {
      System.out.println("Página atualizada.");
  }

  // Implementação dos métodos da interface Camera
  @Override
  public void tirarFoto() {
      System.out.println("Foto tirada.");
  }

  @Override
  public void gravarVideo() {
      System.out.println("Gravando vídeo...");
  }
}
