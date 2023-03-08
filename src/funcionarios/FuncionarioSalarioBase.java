package Funcionario;

public class FuncionarioSalarioBase extends Funcionario implements ISalarioBase {
    private double salarioBase;  

    public FuncionarioSalarioBase(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double getSalarioBase(){
        return this.salarioBase;
    }
    
}