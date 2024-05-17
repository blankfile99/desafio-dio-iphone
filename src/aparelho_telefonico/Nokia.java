package aparelho_telefonico;

public class Nokia implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Realizando ligação do Nokia");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação do Nokia");

    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Realizando correio de voz do Nokia");
    }
}
