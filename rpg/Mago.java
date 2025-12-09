public class Mago extends Entidade {
    

    public Mago(String name){
        this.name = name;
        this.life = 50;
    }

    void heal(Entidade alvo){
        if (alvo == null) {
            System.out.println(name + " esta se curando, mais 20 de vida ");
            life += 20;
            return;
        }
        else{
            alvo.life += 20;
            System.out.println(name + " esta curando " + alvo.name + " em mais 20 de vida");
        }
    }

}
