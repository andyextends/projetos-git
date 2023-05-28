package Animais;

public abstract class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    /*caso nao inicie ou defina uma variavel em java com valor, por default  ele tem uma valor segue exemplo
    int inteiro; // int, long, byte = 0;
    float $$; //double e float = 0.0
    boolean $87; // boolean tem como default false
    char ch; // char é vazio
    String teste; // valor default de qualquer objeto é null*/


    public Animal(String nome, String cor,  double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }


    protected void comer(){

    }
   protected void dormir(){

    }
   public abstract void soar ();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }
}
