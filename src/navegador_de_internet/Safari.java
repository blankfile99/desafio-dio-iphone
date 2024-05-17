package navegador_de_internet;

public class Safari implements NavegadorDeInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina no Safari");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba no Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no Safari");
    }
}
