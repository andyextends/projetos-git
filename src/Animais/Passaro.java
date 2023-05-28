package Animais;

import java.sql.SQLOutput;

public class Passaro extends Animal {
    static int numeroDePassaros;


    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void soar() {
        System.out.println(" PIU PIU!");
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
