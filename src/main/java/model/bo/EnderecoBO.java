package model.bo;

import model.vo.EnderecoVO;
import model.dao.*;

public class EnderecoBO {

	public EnderecoVO salvarEnderecoBO(EnderecoVO novoEndereco) {
		
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		
		novoEndereco = enderecoDAO.salvarEnderecoDAO(novoEndereco);
		
		return novoEndereco;
	}

}
