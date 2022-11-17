public class Diretor extends Gerente {

    public Diretor(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        return getSalario() * 1.20;
    }
}
