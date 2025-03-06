//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z2.nome = "Zumbi2";
        z2.vida = 20;

        z1.nome = "Zumbi";
        z1.vida = 10;
        System.out.println(z1.mostrarVida());

        z1.transfereVida(z2, 5);

    }
}