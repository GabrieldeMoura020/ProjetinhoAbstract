public abstract class Funcionario {

    private String nome;
    private Double salario;

    public Funcionario(String nome) {
        this.nome = nome;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Double getBonificacao(); //{
        //return bonificacao;
    //}

//    public void setBonificacao(Double bonificacao) {
//        this.bonificacao = bonificacao;
//    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
