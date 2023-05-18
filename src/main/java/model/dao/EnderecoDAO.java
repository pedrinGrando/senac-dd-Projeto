package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.vo.EnderecoVO;

public class EnderecoDAO {

	public EnderecoVO salvarEnderecoDAO(EnderecoVO novoEndereco) {
		
		String query = "INSERT INTO endereco (rua, cep, bairro, cidade, estado, numero)"
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		Connection conn = Banco.getConnection();
		PreparedStatement pstmt = Banco.getPreparedStatementWithPk(conn, query);
		
		try {
			pstmt.setString(1, novoEndereco.getRua());
			pstmt.setString(2, novoEndereco.getCep());
			pstmt.setString(3, novoEndereco.getBairro());
			pstmt.setString(4, novoEndereco.getCidade());
			pstmt.setString(5, novoEndereco.getEstado());
			pstmt.setString(6, novoEndereco.getNumero());
			pstmt.execute();
			ResultSet resultado = pstmt.getGeneratedKeys();
			if (resultado.next()) {
				novoEndereco.setIdEndereco(Integer.parseInt(resultado.getString(1)));	
			   }
			} catch (SQLException erro) {
				System.out.println("Erro ao executar a query do método salvarEnderecoDAO");
				System.out.println("Erro: " +erro.getMessage());
			}finally {
				Banco.closeConnection(conn);
				Banco.closePreparedStatement(pstmt);
			}
		return novoEndereco;

	}
	
}
