package cliente.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidade.cliente.Cliente;
import sistema_de_venda.jdbc.ConexaoBanco;

public class ClienteDao {
	private Connection conexao;

	public ClienteDao() {

		this.conexao = new ConexaoBanco().pegarConexao();

	}

	public void CadastrarClientes(Cliente obj) {

		try {

			String sql = "insert into tb_clientes (id,nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
					+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, obj.getCodigo());
			stmt.setString(2, obj.getNome());
			stmt.setString(12, obj.getBairro());
			stmt.setString(7, obj.getCelular());
			stmt.setString(8, obj.getCep());
			stmt.setString(13, obj.getCidade());
			stmt.setString(11, obj.getComplemento());
			stmt.setString(4, obj.getCpf());
			stmt.setString(5, obj.getEmail());
			stmt.setString(14, obj.getEstado());
			stmt.setString(9, obj.getLogradouro());
			stmt.setString(3, obj.getRg());
			stmt.setString(6, obj.getTefefone());
			stmt.setInt(10, obj.getNumero());
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Cliente Cadastrado Com Sucesso ");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Cliente  " + e);
			// TODO: handle exception
		}

	}

	// alterar cliente
	public void alterarCliente(Cliente obj) {

		try {
			String sql = "UPDATE  tb_clientes SET nome=?,rg=?,cpf=?,email=?,telefone=?,celular=?,cep=?,endereco=?,numero=?,complemento=?,bairro=?,cidade=?,estado=?WHERE id= ?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, obj.getNome());
			stmt.setString(2, obj.getRg());
			stmt.setString(3, obj.getCpf());
			stmt.setString(4, obj.getEmail());
			stmt.setString(5, obj.getTefefone());
			stmt.setString(6, obj.getCelular());
			stmt.setString(7, obj.getCep());
			stmt.setString(8, obj.getLogradouro());
			stmt.setInt(9, obj.getNumero());
			stmt.setString(10, obj.getComplemento());
			stmt.setString(11, obj.getBairro());
			stmt.setString(12, obj.getCidade());
			stmt.setString(13, obj.getEstado());
			stmt.setInt(14, obj.getCodigo());

			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Cliente Alterado Com Sucesso");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					" Não FOI Possivel Alterar O Cliente ! VERIFIQUE OS DADOS SE ESTÃO DIGITADOS CORRETAMENTE " + e);
		}

	}

	public void excluirCliente(Cliente obj) {
		try {
			String sql = "delete from tb_clientes  where id = ?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, obj.getCodigo());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Cliente Excluido Com Sucesso");

		} catch (SQLException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, " Erro " + e);

		}

	}

	public List<Cliente> listarCliente() {
		try {
			List<Cliente> listaCliente = new ArrayList<>();
			// instrução sql
			String sql = "select * from tb_clientes"; // fazendo busca do banco de dado
			PreparedStatement stmt = conexao.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery(); // para executar a consulta
			while (rs.next()) {
				Cliente obj = new Cliente();
				obj.setBairro(rs.getString("bairro"));
				obj.setCelular(rs.getString("celular"));
				obj.setCep(rs.getString("cep"));
				obj.setCidade(rs.getString("cidade"));
				obj.setCodigo(rs.getInt("id"));
				obj.setComplemento(rs.getString("complemento"));
				obj.setCpf(rs.getString("cpf"));
				obj.setEmail(rs.getString("email"));
				obj.setEstado(rs.getString("estado"));
				obj.setLogradouro(rs.getString("endereco"));
				obj.setNome(rs.getString("nome"));
				obj.setNumero(rs.getInt("numero"));
				obj.setRg(rs.getString("rg"));
				obj.setTefefone(rs.getString("telefone"));
				listaCliente.add(obj);

			}
			return listaCliente;

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao Listar" + e);
		}
		return null;

	}
}
