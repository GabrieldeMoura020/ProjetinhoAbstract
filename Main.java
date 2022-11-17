public class Main {

    public static void main (String [] args){

//        Pessoa pessoa = new PessoaFisica("nome");
//        pessoa.getTipo();

        Funcionario funcionario = new Diretor("Bruno");
        funcionario.setSalario(1500.00);
        System.out.println(funcionario.getBonificacao());

        }

    }
