package ToDo01.Heranca;

import ToDo01.Polimorfismo.AnimalInterface;

public class Cavalo extends Animal implements AnimalInterface {
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
