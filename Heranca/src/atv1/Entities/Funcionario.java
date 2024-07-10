package atv1.Entities;

public class Funcionario {
	protected String name;
	protected Integer hora;
	protected Double valorHora;
	
	public Funcionario() {
		
	}

	public Funcionario(String name, Integer hora, Double valorHora) {
		super();
		this.name = name;
		this.hora = hora;
		this.valorHora = valorHora;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public String toString() {
		return "Funcionario [name=" + name + ", hora=" + hora + ", valorHora=" + valorHora + "]";
	}
	
	public Double pagamento() {
		return valorHora * hora;
	}
	

}
