import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.PetShop;

public class Main {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();
        Gato gato1 = new Gato( "Felix", "Preto",4.5);
        Animal gato2 = new Gato( "Toby", "Malhado",4.5);
        Animal passaro2 = new Passaro( "Tom", "Cinza",4.5);

        Passaro passaro1 = new Passaro("Frajola","Azul",0.5);

        Cachorro cachorro1 = new Cachorro("Puppy","Marrom",25,5.5,5,"neutro");
        System.out.println(cachorro1.getNumerosDeCachorros());
        Cachorro cachorro2 = new Cachorro("Rex","branco",10,10.5,5,"neutro");
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
        petShop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
        petShop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());
        petShop.tosar(cachorro2);
        System.out.println(cachorro2.getEstadoDeEspirito());
        System.out.println(cachorro2.getNumerosDeCachorros());
        System.out.println(cachorro1.getNumerosDeCachorros());
        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());
        cachorro1.setNome("Puppy");
        cachorro1.setCor("Marrom");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);
        cachorro1.setTamanhoDoRabo(5);


        cachorro1.pegar();
        System.out.println("O cachorro pegou uma " +cachorro1.pegar());
        System.out.println("O cachorro está "+ cachorro2.interagir("Carinho"));
        System.out.println("O cachorro está "+ cachorro2.interagir("nada"));
        System.out.println("O cachorro está "+ cachorro2.interagir("vai dormir"));
        System.out.println("O cachorro está "+ cachorro2.interagir("pisar na patinha"));
        System.out.println(cachorro1);
        System.out.println(cachorro2);


        System.out.println("---------------");
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
        System.out.println(passaro1.toString());
        cachorro2.soar();
        gato2.soar();
        passaro2.soar();


    }

}
