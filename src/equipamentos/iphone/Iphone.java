package equipamentos.iphone;

import equipamentos.aparelhotelefonico.AparelhoTelefonico;
import equipamentos.navegadorinternet.NavegadorInternet;
import equipamentos.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {


    private boolean isMusicaSelecionada=false;
    private String musicaSelecionada = null;
    private boolean conexaoInternet = false;
    private boolean sinalTelefonico = true;

    @Override
    public void ligar(String numero) {
        if(sinalTelefonico){
            System.out.println("Iphone: Ligando para numero: " + numero);
        }
        else{
            System.out.println("Iphone: Telefone sem sinal");
        }
    }

    @Override
    public void atender(String numero) {
        System.out.println("Iphone: Atendendo ligação do numero: "+numero);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone: Iniciando correio de voz");
    }

    @Override
    public void conectarInternet(){
        System.out.println("Conectando à internet...");
        conexaoInternet = true;
    }
    @Override
    public void exibirPagina(String url) {
        if(conexaoInternet){
            System.out.println("Iphone: Exibindo página "+url);
        }
        else{
            System.out.println("Iphone: Não há conexão com a internet");
        }
    }

    @Override
    public void adicionarAba() {
        System.out.println("Iphone: Adicionando aba");
    }

    @Override
    public void atualizarPagina() {
        if(conexaoInternet){
            System.out.println("Iphone: Atualizando página");
        }
        else{
            System.out.println("Iphone: Não há conexão com a internet");
        }
    }

    @Override
    public void tocar() {
        if(isMusicaSelecionada){
            System.out.println("Iphone: Tocando música " + musicaSelecionada);
        }
        else{
            System.out.println("Iphone: Nenhuma música selecionada");
        }

    }

    @Override
    public void pausar() {
        System.out.println("Iphone: Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Iphone: Selecionando música "+musica);
        isMusicaSelecionada = true;
        musicaSelecionada = musica;
    }
}
