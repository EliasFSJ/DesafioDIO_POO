public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical musica = new ReprodutorMusical();
        AparelhoTelefonico telefonar = new AparelhoTelefonico();
        NavegadorNaInternet navegar = new NavegadorNaInternet();

        musica.pausar();
        telefonar.ligar();
        navegar.atualizarPagina();
        telefonar.iniciarCorreioVoz();


    }
}