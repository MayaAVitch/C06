public class Computador {
    String marca;
    float preco;
    MemoriaUSB musb;
    SistemaOperacional sys = new SistemaOperacional();
    HardwareBasico[] hardwares;

    public Computador(String marca, float preco, HardwareBasico[] hardwares) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = hardwares;
    }

    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        if(musb != null) {
            System.out.println("Memória: " + musb.nome + " " + musb.capacidade);
        }
        System.out.println("Hardwares: ");
        System.out.println("Sistema Operacional: " + sys.nome + " " + sys.tipo);
        for (int i = 0; i < hardwares.length; i++) {
            if (hardwares[i] != null){
                System.out.println(hardwares[i].nome + hardwares[i].capacidade);
            }
        }
    }

    void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
    }
}
