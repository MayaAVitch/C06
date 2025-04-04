public class Cliente {
    String nome;
    long cpf;
    Computador[] computers = new Computador[10];

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra() {

        float total = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null) {
                total += computers[i].preco;
            }
        }

        return total;
    }

        public void addComputador(Computador computador){
            for (int i = 0; i < computers.length; i++) {
                if (computers[i] == null){
                    computers[i] = computador;
                    break;
                }

            }
        }
}
