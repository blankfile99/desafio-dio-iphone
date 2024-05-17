package reprodutor_multimidia;

public class Ipod implements ReprodutorMultimidia{
    @Override
    public void tocar() {
        System.out.println("Reproduzindo no Ipod");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica no Ipod");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica no Ipod");
    }

}
