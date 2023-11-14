public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Bob", 4);
        Gato gato1 = new Gato("Sérgio", 2);
        System.out.print(cachorro1.nome + " diz: ");
        cachorro1.FazerSom();
        System.out.print(gato1.nome + " diz " );
        gato1.FazerSom();
    }
}
