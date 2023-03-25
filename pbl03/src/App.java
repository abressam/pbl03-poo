public class App {
    public static void main(String[] args) throws Exception {
        Mapa mapa = new Mapa();
        Time timeAzul = new Time();
        Time timeVermelho = new Time();

        Suporte yuumi = new Suporte();
        Boneco draven = new Boneco();
        Boneco ahri = new Boneco();


        // Mapa escolhido
        mapa.setMapa("Summoner's Rift");
        String nomeMapa = mapa.getMapa();

        // Time azul
        timeAzul.setTime("Time Azul");
        String azul = timeAzul.getTime();

        // Suporte
        yuumi.setNome("Yuumi");
        yuumi.setDano(10);
        yuumi.setCura(30);
        yuumi.setVida(100);
        yuumi.setFrase("Ai ta na hora de salvar o mundo de novo!");

        String nomeYuumi = yuumi.getNome();
        int danoYuumi = yuumi.getDano();
        int curaYuumi = yuumi.getCura();
        int vidaYuumi = yuumi.getVida();
        String fraseYuumi = yuumi.getFrase();

        // Adcarry
        draven.setNome("Draven");
        draven.setDano(70);
        draven.setVida(400);
        draven.setFrase("Bem-vindos a League of Draven!");

        String nomeDraven = draven.getNome();
        int danoDraven = draven.getDano();
        int vidaDraven = draven.getVida();
        String fraseDraven = draven.getFrase();

        // Mid
        ahri.setNome("Ahri");
        ahri.setDano(40);
        ahri.setVida(320);
        ahri.setFrase("Você que brincar também? Vai ser divertido.");

        String nomeAhri = ahri.getNome();
        int danoAhri = ahri.getDano();
        int vidaAhri = ahri.getVida();
        String fraseAhri = ahri.getFrase();

        // Time vermelho
        timeVermelho.setTime("Time Vermelho");
        String vermelho = timeVermelho.getTime();

        
        System.out.println("Bem-vindos a " + nomeMapa + "!\n");
        System.out.println(azul);
        System.out.println("Suporte: " + nomeYuumi);
        System.out.println("Atirador: " + nomeDraven);
        System.out.println("Meio: " + nomeAhri);
    }
}
