public class App {
    public static void main(String[] args) throws Exception {
        Suporte yuumi = new Suporte();

        yuumi.setNome("Yuumi");
        String nome = yuumi.getNome();

        System.out.println(nome);
    }
}
