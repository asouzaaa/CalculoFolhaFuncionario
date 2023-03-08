package Funcionario;

public class FuncionarioComissionado extends Funcionario {

    private final double totalVendas;
    private final double percentualComissao;
   
    public FuncionarioComissionado(String nome, double valorVendido, double percentualComissao) {
        super(nome);
        this.totalVendas = valorVendido;
        this.percentualComissao = percentualComissao;
    }
    
    @Override
    public double SalarioFinal(){
        return this.totalVendas * this.percentualComissao;
                
    }

    @Override
    public String toString() {
        return String.format("O salário final do %s é R$ %,.2f", super.getNome(), this.SalarioFinal());
    }
    
     
    
}
