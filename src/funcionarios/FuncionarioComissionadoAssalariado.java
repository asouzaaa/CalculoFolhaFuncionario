package Funcionario;

public class FuncionarioComissionadoAssalariado extends FuncionarioSalarioBase {

    private final double totalVendas;
    private final double percentualComissao;   
    private final double percentualBonus;
    
    public FuncionarioComissionadoAssalariado(String nome, double salarioBase, double valorVendido, double percentualComissao, double percentualBonus) {
        super(nome, salarioBase);
        
        this.totalVendas = valorVendido;
        this.percentualComissao = percentualComissao;
        this.percentualBonus = percentualBonus;
    }
    
    @Override
    public double SalarioFinal(){
        return ((super.getSalarioBase() + (super.getSalarioBase() * this.percentualBonus) + (this.percentualComissao * this.totalVendas)));                
    }

    @Override
    public String toString() {
        return String.format("O salário final do %s é R$ %,.2f", super.getNome(), this.SalarioFinal());
    }
    
    
    
}
