public class Main {
    public static void main(String[] args) {
        Guerreiro b = new Guerreiro("Guerreiro");
        Mago m = new Mago("Mago");
        m.getLife();
        b.swordStrike(m);
        m.getLife();
        m.heal(null);
        m.getLife();
    }
    
}
