package atv1.Entities;

public class FuncionarioTercerizado extends Funcionario {
	private Double cobrancaAdicional;
	
	public FuncionarioTercerizado() {
		
	}

	public FuncionarioTercerizado(String name, Integer hora, Double valorHora, Double cobrancaAdicional) {
		super(name, hora, valorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}

	public Double getCobrancaAdicional() {
		return cobrancaAdicional;
	}

	public void setCobrancaAdicional(Double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}

	@Override
	public String toString() {
		return "FuncionarioTercerizado [cobrancaAdicional=" + cobrancaAdicional + ", name=" + name + ", hora=" + hora
				+ ", valorHora=" + valorHora + "]";
	}

	@Override
	public Double pagamento() {
		return super.pagamento() +cobrancaAdicional * 1.1;
	}
	
	

}
