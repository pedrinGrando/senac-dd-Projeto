package model.bo;

import model.vo.EnderecoVO;
import model.dao.*;

public class EnderecoBO {

	public EnderecoVO salvarEnderecoBO(EnderecoVO novoEndereco) {
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		
		return enderecoDAO.salvarEnderecoDAO(novoEndereco);
	}

}
