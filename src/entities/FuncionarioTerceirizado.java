package entities;

public class FuncionarioTerceirizado extends Funcionario{
    private double despesasAdicionais;

    public FuncionarioTerceirizado(){
    }
    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, double despesasAdicionais) {
        super(nome, horas, valorPorHora);
        this.despesasAdicionais = despesasAdicionais;
    }
    @Override
    public double pagamento(){
        return super.pagamento() + despesasAdicionais * 1.1;
    }
}
