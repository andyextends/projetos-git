package Animais;

public class Cachorro extends Animal {
    //atributos
    static int numeroDeCachorros;

    private int tamanhoDoRabo;


    //construtor vazio default



// construto definido pelo usuario
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoEspirito) {
        super(nome,cor,peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoEspirito;

        numeroDeCachorros ++;
    }

    // metodos


    public static int getNumerosDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumerosDeCachorros(int numerosDeCachorros) {
        Cachorro.numeroDeCachorros = numerosDeCachorros;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }



    public String pegar() {
        return "Bolinha";

    }

    public String interagir(String acao) {
        switch (acao) {
            case "Carinho":
                this.estadoDeEspirito = "Feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "Bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
                break;

        }
        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU!");
    }
}







