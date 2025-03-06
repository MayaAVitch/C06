public class Zumbi {
    String nome;
    double vida;
    int dano;

    double mostrarVida(){
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida = vida - quantia;
        zumbiAlvo.vida += quantia;
        System.out.println("A nova vida do que transfere é " + vida);
        System.out.println("A nova vida do que recebe é " + zumbiAlvo.vida);
    }

    void seAlimentar(){
        System.out.println("Zumbi " + nome + " está se alimentando...");
    }

    void mostraInfo(){
        System.out.println("Zumbi");
    }
}
