class Animal { // Classe Geral || Classe Base
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void FazerSom() {
        // Ainda vai ter bagulho aq
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void FazerSom() {
        System.out.println("au au, pega no meu pau");
    }
}

class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void FazerSom() {
        System.out.println("miau, miau caralho");
    }
}