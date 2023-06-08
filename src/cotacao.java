import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class cotacao {
    private Connection conectarBancoDeDados() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/nome_do_banco"; // URL do banco de dados
        String usuario = "usuario"; // Usuário do banco de dados
        String senha = "senha"; // Senha do banco de dados
        return DriverManager.getConnection(url, usuario, senha);
    }

    // Método para criar um novo produto no banco de dados
    public void cadastrarProduto() {
        try (Connection conexao = conectarBancoDeDados()) {
            String query = "INSERT INTO produto (codigo, nome,preco ,descricao) VALUES (?, ?,?, ?)";
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(toString()));
            statement.setString(2,toString());
            statement.setString(3,toString());
            statement.setString(4,toString());
            statement.executeUpdate();
            System.out.println("Produto criado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }
    }
    public void cadastrarEstabelecimento() {
        try (Connection conexao = conectarBancoDeDados()) {
            String query = "INSERT INTO estabelecimento (cnpj,nomeEstabelecimento ,endereco,telefone) VALUES (?, ?,?, ?)";
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(toString()));
            statement.setString(2,toString());
            statement.setString(3,toString());
            statement.setString(4,toString());
            statement.executeUpdate();
            System.out.println("Estabelecimento criado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }
    }

    // Método para atualizar um produto no banco de dados
    public void atualizarProduto() {
        try (Connection conexao = conectarBancoDeDados()) {
            String query = "UPDATE produto SET nome = ?, descricao = ?,preco = ? WHERE codigo = ?";
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.setString(1,toString());
            statement.setString(2,toString());
            statement.setInt(3, Integer.parseInt(toString()));
            statement.setInt(4, Integer.parseInt(toString()));
            statement.executeUpdate();
            System.out.println("Produto atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    // Método para consultar um produto no banco de dados
    public void consultarProduto() {
        try (Connection conexao = conectarBancoDeDados()) {
            String query = "SELECT nome FROM produto WHERE codigo = ?";// corrigir essa linha refere ao preco
            PreparedStatement statement = conexao.prepareStatement(query);
            int codigo = 0;
            statement.setInt(1, codigo);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                codigo = resultSet.getInt("codigo");
                String nome = resultSet.getString("nome");
                String descricao = resultSet.getString("descricao");
                String preco = resultSet.getString("preco;");
                System.out.println("Produto encontrado:");
                exibirInformacoes();
            } else {
                System.out.println("Produto não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar produto: " + e.getMessage());
        }
    }

    private void exibirInformacoes() {
    }

    // Método para fazer cotação do produto no banco de dados
    public double fazerCotacao() {
        double preco = 0;
        try (Connection conexao = conectarBancoDeDados()) {
            String query = "SELECT preco FROM produtos WHERE codigo = ?";
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(toString()));
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                preco = resultSet.getDouble("preco");
                System.out.println("Cotação realizada com sucesso!");
                System.out.println("Preço do produto: R$" + preco);
            } else {
                System.out.println("Produto não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fazer cotação: " + e.getMessage());
        }

        return preco;
    }
}


