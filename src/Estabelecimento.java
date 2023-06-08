public class Estabelecimento {
    private String cnpj;
    private String nomeEstabelecimento;
    private String endereco;
    private String telefone;

    public Estabelecimento(String cnpj, String nomeEstabelecimento, String endereco, String telefone) {
        this.cnpj = cnpj;
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Estabelecimento(String cnpj, String rua_teste, String nome_estabelecimento) {
    }

    public static void setnomestabelecimento(String nomestabelecimento) {
    }

    public static void setEndereco(String endereco) {
    }

    public static void setTelefone(int telefone) {
    }

    public static void atualizarProduto() {
    }

    public void cadastrarEstabelecimento() throws Exception {
        // Código para cadastrar o estabelecimento no banco de dados
        if (cnpj.isEmpty() || nomeEstabelecimento.isEmpty() || endereco.isEmpty() || telefone.isEmpty()) {
            throw new Exception("Todos os campos devem ser preenchidos.");
        }

        // Implementação do cadastro no banco de dados
        // ...
        System.out.println("Estabelecimento cadastrado com sucesso!");
    }

    public void excluirEstabelecimento() throws Exception {
        // Código para excluir o estabelecimento do banco de dados
        if (cnpj.isEmpty()) {
            throw new Exception("O CNPJ do estabelecimento deve ser informado.");
        }

        // Implementação da exclusão no banco de dados
        // ...
        System.out.println("Estabelecimento excluído com sucesso!");
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "cnpj='" + cnpj + '\'' +
                ", nomeEstabelecimento='" + nomeEstabelecimento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}