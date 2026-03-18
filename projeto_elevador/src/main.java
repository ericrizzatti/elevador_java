//criei a main para ter um ambiente para testas as funções
public class main {
    public static void main(String[] args) {

        elevador e = new elevador(3);//defina o valor para o andar maximo do predio

//utilizando o codigo, pode usar na ordem que quiser
//ufunções possiveis para uso:
// e.subir(),
// e.descer(),
// e.abrir(),
// e.fechar()
// e.mostrarAndar()
// ,e.mostrarPorta(),
//exemplo de uso:
        e.mostrarAndar();
        e.descer();
        e.mostrarAndar();
        e.descer();
        e.abrirPorta();
        e.subir();
        e.fecharPorta();
        e.subir();
        e.subir();
        e.mostrarAndar();
        e.descer();
        e.mostrarAndar();


    }
}