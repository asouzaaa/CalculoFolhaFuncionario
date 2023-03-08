package folhadepagamento.nea;

import Funcionario.FuncionarioAssalariado;
import Funcionario.FuncionarioComissionado;
import Funcionario.FuncionarioComissionadoAssalariado;
import Funcionario.FuncionarioPorHora;

public class FolhaDePagamentoNea {    
    public static void main(String[] args) {
        
        FuncionarioAssalariado fAssalariado;
        FuncionarioComissionado fComissionado;
        FuncionarioComissionadoAssalariado fComissionadoAss;
        FuncionarioPorHora fPorHora;
    
        fAssalariado = new FuncionarioAssalariado("Assalariado", 10);
        fComissionado = new FuncionarioComissionado("Comissionado", 10500, 0.15);
        fComissionadoAss = new FuncionarioComissionadoAssalariado("Comissionado Assalariado", 100, 500, 0.10, 0.10);
        fPorHora = new FuncionarioPorHora("Hora Extra", 1000, 12);
        
        System.out.println(fAssalariado.toString());
        System.out.println(fComissionado.toString());
        System.out.println(fComissionadoAss.toString());
        System.out.println(fPorHora.toString());
    }
    
}
