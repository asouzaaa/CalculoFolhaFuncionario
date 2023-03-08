package Funcionario;

public class FuncionarioPorHora extends FuncionarioSalarioBase {

    private final double qtdHoraExtra;
    
    public FuncionarioPorHora(String nome, double SalarioBase, double qtdHoraExtra) {
        super(nome, SalarioBase);
        this.qtdHoraExtra = qtdHoraExtra;
    }
    
    @Override
    public double SalarioFinal(){
        return ((super.getSalarioBase()) + (((super.getSalarioBase() / 40) * qtdHoraExtra) * 1.5));
    }

    @Override
    public String toString() {
        return String.format("O salário final do %s é R$ %,.2f", super.getNome(), this.SalarioFinal());
    }
    
    
}
