package controller;

import model.vo.EnderecoVO;
import model.bo.*;

public class EnderecoController {

	public EnderecoVO salvarEnderecoController(EnderecoVO novoEndereco) {
		EnderecoBO enderecoBO = new EnderecoBO();
		
		novoEndereco = enderecoBO.salvarEnderecoBO(novoEndereco);
		
		return novoEndereco;
	}

}
