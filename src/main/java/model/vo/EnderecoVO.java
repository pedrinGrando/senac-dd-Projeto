package model.vo;
public class EnderecoVO {

	private int idEndereco;
	private String Rua;
	private String Cep;
	private String Bairro;
	private String cidade;
	private String estado;
	private String numero;
	
	public EnderecoVO(int idEndereco, String rua, String cep, String bairro, String cidade, String estado,
			String numero) {
		super();
		this.idEndereco = idEndereco;
		Rua = rua;
		Cep = cep;
		Bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
	}

	public EnderecoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public String getCep() {
		return Cep;
	}

	public void setCep(String cep) {
		Cep = cep;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
