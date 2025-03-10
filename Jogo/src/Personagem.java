public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    void usarArma(){
        System.out.println("Usando arma!");
        arma.resistencia -= 2;
    }

    void tomarDano(){
        System.out.println("Personagem tomou dano!");
        pontos = pontos - 5;
    }
}
