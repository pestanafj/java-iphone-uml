package estabelecimento;

import equipamentos.iphone.Iphone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Fabrica {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        //Aparelho Telefonico
        iphone.ligar("98965487636");
        iphone.atender("98965487636");
        iphone.iniciarCorreioVoz();

        //Reprodutor Musical
        iphone.selecionarMusica("Como uma Onda");
        iphone.tocar();
        iphone.pausar();

        //Navegador Internet
        iphone.conectarInternet();
        iphone.adicionarAba();
        iphone.exibirPagina("google.com");
        iphone.atualizarPagina();


    }
}