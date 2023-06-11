public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;

    public Produto(int codigo, String nome, String descricao, String preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = Double.parseDouble(preco);
        this.descricao = descricao;
    }

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

    //Esse código é um método chamado toString() que está sendo sobrescrito na classe atual.
    // O método toString() é um método da classe Object em Java que converte um objeto em uma representação de string.
    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome='" + nome + '\''
                + ", descricao='" + descricao + '\'' + ", preco=" + preco + '}';
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

