package ToDo01.Heranca;

import ToDo01.Polimorfismo.AnimalInterface;

public class Passaro extends Animal implements AnimalInterface {

    private String classe;
    public String getClasse() {
        return classe;
    }

    public void seClasse(String classe) {
        this.classe = classe;
    }

}
