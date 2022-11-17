public class Gerente extends Funcionario {

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        return getSalario() * 1.15;
    }
}
