//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Personagem p1 = new Personagem();
        Arma a1 = new Arma();

        p1.nome = "Player1";
        p1.pontos = 50;
        p1.arma = a1;

        a1.nome = "ak47";
        a1.poder = 15;
        a1.resistencia = 20;
        a1.descricao = "rifle";

        a1.mostraInfoArma();
        p1.tomarDano();
        p1.usarArma();
        a1.mostraInfoArma();
    }
}