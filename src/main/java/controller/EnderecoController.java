package controller;

import model.vo.EnderecoVO;
import Exceptions.CampoInvalidoException;
import model.bo.*;

public class EnderecoController {

	public EnderecoVO salvarEnderecoController(EnderecoVO novoEndereco) throws CampoInvalidoException {
		EnderecoBO enderecoBO = new EnderecoBO();
		validarCamposObrigatorios(novoEndereco);
		
		return enderecoBO.salvarEnderecoBO(novoEndereco);
	}
	
	private void validarCamposObrigatorios(EnderecoVO novoEndereco) throws CampoInvalidoException{
		String mensagemValidacao = "";
		
		mensagemValidacao += validarString(novoEndereco.getCep(), "Cep");
		mensagemValidacao += validarString(novoEndereco.getRua(), "Rua");
		mensagemValidacao += validarString(novoEndereco.getNumero(), "Número");
		mensagemValidacao += validarString(novoEndereco.getBairro(), "Bairro");
		mensagemValidacao += validarString(novoEndereco.getCidade(), "Cidade");
		mensagemValidacao += validarString(novoEndereco.getEstado(), "Estado");
		
		if (!mensagemValidacao.isEmpty()) {
			throw new CampoInvalidoException(mensagemValidacao);
		}
	}
	
	private String validarString(String texto, String nomeCampo) {
		boolean valido = (texto != null) && !texto.trim().isEmpty();
		
		if(valido) {
			return "";
		} else {
			return "- " + nomeCampo + "\n";
		}
		
	}
	
}
