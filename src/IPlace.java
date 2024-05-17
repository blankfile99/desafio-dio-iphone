import aparelho_telefonico.AparelhoTelefonico;
import aparelho_telefonico.Nokia;
import navegador_de_internet.NavegadorDeInternet;
import navegador_de_internet.Safari;
import reprodutor_multimidia.Ipod;
import reprodutor_multimidia.ReprodutorMultimidia;
import smart_phone.Iphone;

public class IPlace {
    public static void main(String[] args) {

        //Telefone
        System.out.println("** Exibindo Métodos do nokia **");
        AparelhoTelefonico nokia = new Nokia();
        nokia.ligar();
        nokia.atender();
        nokia.iniciarCorreioDeVoz();

        //Navegador
        System.out.println("\n** Exibindo Métodos do safari **");
        NavegadorDeInternet safari = new Safari();
        safari.exibirPagina();
        safari.adicionarNovaAba();
        safari.atualizarPagina();

        //Reprodutor Multimidia
        System.out.println("\n** Exibindo Métodos do Ipod **");
        ReprodutorMultimidia ipod = new Ipod();
        ipod.tocar();
        ipod.selecionarMusica();
        ipod.pausar();

        //Iphone
        System.out.println("\n** Exibindo métodos do telefone no iphone **");
        Iphone iphone = new Iphone();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        System.out.println("\n** Exibindo metodos do navegador do Iphone **");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("\n** Exibindo métodos do media player do iphone ** ");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();


    }
}
