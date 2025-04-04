import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao PC Mania! Estamos com 3 promoções no momento!");
        System.out.println();
        System.out.println("Aqui estão as promoções! Para adicionar a promoção 1 ao seu carrinho, tecle 1.");
        System.out.println("Para adicionar a promoção 2, tecle 2.");
        System.out.println("Para adicionar a promoção 3, tecle 3.");
        System.out.println("Para terminar, tecle 0.");
        System.out.println();


        HardwareBasico[] hard1 = new HardwareBasico[3];
        HardwareBasico h1 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico h2 = new HardwareBasico("Memoria RAM", 8);
        HardwareBasico h3 = new HardwareBasico("HD", 500);
        hard1[0] = h1;
        hard1[1] = h2;
        hard1[2] = h3;

        MemoriaUSB musb1 = new MemoriaUSB("Pendrive ", 16);

        Computador c1 = new Computador("Apple", 198, hard1);
        c1.sys.nome = "Linux Ubuntu";
        c1.sys.tipo = 32;

        System.out.println("Promoção 1:");
        c1.mostraPCConfigs();
        System.out.println();
        System.out.println("Pode levar também um " + musb1.nome + musb1.capacidade + "GB");
        System.out.println();

        HardwareBasico[] hard2 = new HardwareBasico[3];
        HardwareBasico h4 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico h5 = new HardwareBasico("Memoria RAM", 16);
        HardwareBasico h6 = new HardwareBasico("HD", 1000);
        hard2[0] = h4;
        hard2[1] = h5;
        hard2[2] = h6;

        MemoriaUSB musb2 = new MemoriaUSB("Pendrive ", 32);

        Computador c2 = new Computador("Samsung", 1432, hard2);
        c2.sys.nome = "Windows 8";
        c2.sys.tipo = 64;

        System.out.println("Promoção 2:");
        c2.mostraPCConfigs();
        System.out.println();
        System.out.println("Pode levar também um " + musb2.nome + musb2.capacidade + "GB");
        System.out.println();

        HardwareBasico[] hard3 = new HardwareBasico[3];
        HardwareBasico h7 = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico h8 = new HardwareBasico("Memoria RAM", 32);
        HardwareBasico h9 = new HardwareBasico("HD", 2000);
        hard3[0] = h7;
        hard3[1] = h8;
        hard3[2] = h9;

        MemoriaUSB musb3 = new MemoriaUSB("HD Externo ", 1000);

        Computador c3 = new Computador("Dell", 5876, hard3);
        c3.sys.nome = "Windows 10";
        c3.sys.tipo = 64;

        System.out.println("Promoção 3:");
        c3.mostraPCConfigs();
        System.out.println();
        System.out.println("Pode levar também um " + musb3.nome + musb3.capacidade + "GB");
        System.out.println();

        Cliente cliente = new Cliente("Maya", 123456789);


        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Qual promoção quer comprar?");
            x = sc.nextInt();
            switch (x) {

                case 0:
                    System.out.println("Obrigada pela compra!!");
                    System.out.println();
                    break;

                case 1:
                    cliente.addComputador(c1);
                    System.out.println("Quer add Memoria USB? 0 = Não, 1 = Sim");
                    y = sc.nextInt();
                    if (y == 1) {
                        c1.addMemoriaUSB(musb1);
                    }
                    break;
                case 2:
                    cliente.addComputador(c2);
                    System.out.println("Quer add Memoria USB? 0 = Não, 1 = Sim");
                    y = sc.nextInt();
                    if (y == 1) {
                        c2.addMemoriaUSB(musb2);
                    }
                    break;
                case 3:
                    cliente.addComputador(c3);
                    System.out.println("Quer add HD Externo? 0 = Não, 1 = Sim");
                    y = sc.nextInt();
                    if (y == 1) {
                        c3.addMemoriaUSB(musb3);
                    }
                    break;
                default:
                    System.out.println("Valor invalido.");
                    break;
            }
        } while (x != 0);

        System.out.println();
        System.out.println("A seguir estão os dados da sua compra!");

        System.out.println("Nome do Cliente: " + cliente.nome);
        System.out.println("CPF do cliente: " + cliente.cpf);
        System.out.println();
        System.out.println("Itens no Carrinho: ");
        System.out.println();
        for (int i = 0; i < cliente.computers.length; i++) {
            if (cliente.computers[i] != null) {
                int itemno = i + 1;
                System.out.println("Item " + itemno);
                cliente.computers[i].mostraPCConfigs();
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Total: R$ " + cliente.calculaTotalCompra());
        System.out.println();
        System.out.println("Obrigada por nos escolher! Volte sempre!!");
    }
}