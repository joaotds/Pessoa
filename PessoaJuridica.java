package modelo;

public class PessoaJuridica extends Pessoa {

	private String nomeFantasia;
	private String cnpj;
	
	public String getDados() {
		String dadosPessoaJ = " A Pessoa Juridica ";
		dadosPessoaJ += this.getNome() + "| De CNPJ: " + this.getCnpj() + " | Tem o nome fantasia de: " ;
		dadosPessoaJ += this.getNomeFantasia();
		return dadosPessoaJ;
	}
	/**
	 * @return the nomeFantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	/**
	 * @param nomeFantasia the nomeFantasia to set
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
