public class Guerreiro extends Entidade {

    public Guerreiro(String name) { 
        this.name = name;
        this.life = 100;
    }

    void swordStrike(Entidade alvo){
        int dano = 30;
        alvo.life = alvo.life - dano;
        System.out.println(name + " deu um Golpe de Espada no " + alvo + " causando " + dano + " de dano");
    }
}
