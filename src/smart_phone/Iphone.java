package smart_phone;

import aparelho_telefonico.AparelhoTelefonico;
import navegador_de_internet.NavegadorDeInternet;
import reprodutor_multimidia.ReprodutorMultimidia;

public class Iphone implements AparelhoTelefonico, ReprodutorMultimidia, NavegadorDeInternet {
    @Override
    public void ligar() {
        System.out.println("Ligando do Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Ligando ligação através do Iphone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de Voz pelo Iphone");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina no navegador do Iphone");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do Iphone");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina pelo navegador do Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica no Iphone");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica no Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica no Iphone");

    }
}
