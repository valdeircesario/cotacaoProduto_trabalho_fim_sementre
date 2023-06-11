import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class cotacao {
    private Connection conectarBancoDeDados() throws SQLException {
        String url = "http://localhost/phpmyadmin/index.php?route=/database/structure&db=cotacao";
        String usuario = "usuario";
        String senha = "senha";
        return DriverManager.getConnection(url, usuario, senha);
    }

    // Método para criar um novo produto no banco de dados
    public void cadastrarProduto() {
        try (Connection conexao = conectarBancoDeDados()) {
            String query = "INSERT INTO produto (codigo, nome,preco ,descricao) VALUES (?, ?,?, ?)";
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(toString()));
            statement.setString(2, toString());
            statement.setString(3, toString());
            statement.setString(4, toString());
            statement.executeUpdate();
            System.out.println("Produto criado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }
    }
    public void excluirEstabelecimento(String cnpj) {
        try (Connection conexao = conectarBancoDeDados()) {
            String query = "DELETE FROM estabelecimento WHERE cnpj = ?";
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.setString(1, cnpj);
            statement.executeUpdate();
            System.out.println("Estabelecimento excluído com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir estabelecimento: " + e.getMessage());
        }
    }

    public cotacao() {
    }

    public void cadastrarEstabelecimento() {
        try (Connection conexao = conectarBancoDeDados()) {
            String query = "INSERT INTO estabelecimento (cnpj,nomeEstabelecimento ,endereco,telefone) VALUES (?, ?,?, ?)";
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(toString()));
            statement.setString(2, toString());
            statement.setString(3, toString());
            statement.setString(4, toString());
            statement.executeUpdate();
            System.out.println("Estabelecimento criado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar estabelecimento: " + e.getMessage());
        }
    }

    // Método para atualizar um produto no banco de dados
    public void atualizarProduto() {
        try (Connection conexao = conectarBancoDeDados()) {
            String query = "UPDATE produto SET nome = ?, descricao = ?,preco = ? WHERE codigo = ?";
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.setString(1, toString());
            statement.setString(2, toString());
            statement.setInt(3, Integer.parseInt(toString()));
            statement.setInt(4, Integer.parseInt(toString()));
            statement.executeUpdate();
            System.out.println("Produto atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    public void excluirProduto(int produtoId) {
        try (Connection conexao = conectarBancoDeDados()) {
            String query = "DELETE FROM produto WHERE codigo = ?";
            PreparedStatement statement = conexao.prepareStatement(query);
            statement.setInt(1, produtoId);
            statement.executeUpdate();
            System.out.println("Produto excluído com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
        }
    }

        public void cotacao() {
        }

        // Método para consultar um produto no banco de dados
        public void consultarProduto() {
            try (Connection conexao = conectarBancoDeDados()) {
                String query = "SELECT p.preco " +
                        "FROM Produto p " +
                        "JOIN Cotacao c ON p.codigo = c.codigo " +
                        "JOIN Estabelecimento e ON c.cnpj = e.cnpj " +
                        "WHERE p.codigo = ?";
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

        private double exibirInformacoes() {


            // Método para fazer cotação do produto no banco de dados
            double fazerCotacao;
            {
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
    }



