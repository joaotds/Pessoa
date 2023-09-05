package modelo;

public class PessoaFisica extends Pessoa {

	private Integer idade;
	private String cpf;
	
	public String getDados() {
		String dadosPessoa = "A Pessoa Fisica: ";
		dadosPessoa += this.getNome() + " | De CPF: " + this.getCpf() + " | Tem uma idade de: " ;
		dadosPessoa += this.getIdade();
		return dadosPessoa;
	}
	/**
	 * @return the idade
	 */
	public Integer getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}

