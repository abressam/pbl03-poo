public class App {
    public static void main(String[] args) throws Exception {
        Suporte yuumi = new Suporte();
        Mapa mapa = new Mapa();

        mapa.setMapa("Summoner's Rift");
        String nomeMapa = mapa.getMapa();

        yuumi.setNome("Yuumi");
        String nome = yuumi.getNome();

        System.out.println("Bem-vindos a " + nomeMapa);
        System.out.println(nome);
    }
}
