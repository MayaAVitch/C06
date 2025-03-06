//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "Kart1";
        kart2.nome = "Kart2";

        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 95.20f;
        kart2.motor.cilindradas = "50";
        kart2.motor.velocidadeMaxima = 76.10f;

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "Mario";
        piloto2.nome = "Luigi";

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart1.motor.mostraInfo();
        kart1.pular();
        kart1.soltarTurbo();
        kart2.motor.mostraInfo();
        kart2.pular();
        kart2.fazerDrift();

    }
}