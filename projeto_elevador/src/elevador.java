public class elevador {

    int andarAtual;
    int totalAndares;
    int andarMax;
    boolean portaAberta;

    //total andares sera dada como parametro
    public elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        andarAtual = 0;
        portaAberta = false;
    }

    void subir() {
        if (portaAberta) {
            System.out.println("Fecha a porta primeiro!");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no último andar");
        }
    }

    void descer() {
        if (portaAberta) {
            System.out.println("Fecha a porta primeiro!");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no térreo");
        }
    }

    void abrirPorta() {
        portaAberta = true;
        System.out.println("Porta aberta");
    }

    void fecharPorta() {
        portaAberta = false;
        System.out.println("Porta fechada");
    }

    void mostrarAndar() {
        System.out.println("Andar atual: " + andarAtual);
    }

    void mostrarPorta() {
        if (portaAberta) {
            System.out.println("Porta aberta");
        } else {
            System.out.println("Porta fechada");
        }

    }
}


