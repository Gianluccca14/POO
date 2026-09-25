public class Retangulo {
    // Atributos privados
    private double largura;
    private double altura;

    // Construtor padrão: inicializa ambos com 1.0
    public Retangulo() {
        this.largura = 1.0;
        this.altura = 1.0;
    }

    // Construtor com parâmetros
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Getters e Setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return largura * altura;
    }

    // Método para verificar se é um quadrado
    public boolean isQuadrado() {
        return largura == altura;
    }

public class Retangulo {
    
    private double largura;
    private double altura;

    // Construtor padrão: inicializa ambos com 1
    public Retangulo() {
        this.largura = 1.0;
        this.altura = 1.0;
    }

    // Construtor com parâmetros
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return largura * altura;
    }

    // Método para verificar se é um quadrado
    public boolean isQuadrado() {
        return largura == altura;
    }

    // Classe Principal para teste
    public static void main(String[] args) {
        // Instancia um objeto Retangulo
        Retangulo ret = new Retangulo(5.0, 5.0);

        // Verifica se é quadrado
        if (ret.isQuadrado()) {
            System.out.println("O retângulo é um quadrado.");
        } else {
            System.out.println("O retângulo não é um quadrado.");
        }

        // Imprime a área
        System.out.println("Área: " + ret.calcularArea());
    }
}