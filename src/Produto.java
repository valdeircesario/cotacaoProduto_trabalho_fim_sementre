public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;

    public Produto(int codigo, String nome, String descricao, String preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = this.preco;
        this.descricao = descricao;
    }

    // Métodos para acessar os atributos (getters)
    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    // Métodos para atualizar os atributos (setters)
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(int codigo, String nome, String descricao, double preco) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }


    public void consultarProduto() {
    }

    public void atualizarProduto() {
    }

    public double fazerCotacao() {
        return 0;
    }

    public void cadastrarProduto() {
    }
}

