package Funcionario;

public class FuncionarioAssalariado extends FuncionarioSalarioBase{

    public FuncionarioAssalariado(String nome, double salarioBase) {
        super(nome, salarioBase);        
    }

    @Override
    public double SalarioFinal() {
        return super.getSalarioBase();
    }  
    
    
    @Override
    public String toString(){
        return String.format("O salário final do %s é R$ %,.2f", this.getNome(), this.getSalarioBase());
    }
}
