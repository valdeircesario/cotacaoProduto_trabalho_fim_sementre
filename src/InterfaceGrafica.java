import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGrafica extends JFrame implements ActionListener {
    private final JButton btnCadastrar;
    private final Object btnEstabelecimento;
    private final JTextField txtNomeestabelecimento;
    private final JTextField txtCnpj;
    private final JTextField txtEndereco;
    private final JTextField txtTelefone;
    private JPanel panel;
    private JTextField txtCodigo;
    private JTextField txtNome;

    private JTextField txtPreco;

    private JTextField txtDescricao;
    private JButton btnCriar;
    private JButton btnAtualizar;
    private JButton btnConsultar;
    private JButton btnCotacao;

    private Produto produto;

    public InterfaceGrafica() {
        // Configurações da janela
        setTitle("MEU BANCO DE DADOS");
        setSize(750, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação do painel
        panel = new JPanel();

        // Criação das informacoes de entrada de dados do produto;

        JLabel lblCodigo = new JLabel("Código:");
        txtCodigo = new JTextField(12);
        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(12);
        JLabel lblDescricao = new JLabel("Descrição:");
        txtDescricao = new JTextField(12);
        JLabel lblPreco = new JLabel("Preco:");
        txtPreco = new JTextField(12);

        // botões de criação do estabelecimento

        JLabel lblCnpj = new JLabel("CNPJ:");
        txtCnpj = new JTextField(10);
        JLabel lblNomEstabelecimento = new JLabel("Nomestabelecimento:");
        txtNomeestabelecimento = new JTextField(10);
        JLabel lblEndereco = new JLabel("Endereco:");
        txtEndereco = new JTextField(10);
        JLabel lblTelefone = new JLabel("Telefone:");
        txtTelefone = new JTextField(10);




        // Criação dos botões
        btnCadastrar = new JButton("cadastrar produto");
        btnAtualizar = new JButton("Atualizar");
        btnConsultar = new JButton("Consultar");
        btnCotacao = new JButton("Fazer Cotação");
        btnEstabelecimento  = new JButton("cadastrar estabelecimento");

        // Adiciona os componentes ao painel
        panel.add(lblCnpj);
        panel.add(txtCnpj);
        panel.add(lblNomEstabelecimento);
        panel.add(txtNomeestabelecimento);
        panel.add(lblEndereco);
        panel.add(txtEndereco);
        panel.add(lblTelefone);
        panel.add(txtTelefone);
        panel.add(lblCodigo);
        panel.add(txtCodigo);
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblDescricao);
        panel.add(txtDescricao);
        panel.add(lblPreco);
        panel.add(txtPreco);
        panel.add(btnCadastrar);
        panel.add(btnAtualizar);
        panel.add(btnConsultar);
        panel.add(btnCotacao);
        panel.add((Component) btnEstabelecimento);

        // Adiciona o painel à janela
        add(panel);

        // Adiciona os listeners de evento aos botões
        btnCadastrar.addActionListener(this);
        btnAtualizar.addActionListener(this);
        btnConsultar.addActionListener(this);
        btnCotacao.addActionListener(this);
        btnEstabelecimento.equals(this);
    }

    public static void main(String[] args) {
        InterfaceGrafica interfaceGrafica = new InterfaceGrafica();
        interfaceGrafica.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object btnCadastrar = new Object();
        if (e.getSource() == btnCadastrar) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            String nome = txtNome.getText();
            String descricao = txtDescricao.getText();
            double preco = Double.parseDouble(txtPreco.getText());
            produto = new Produto(codigo, nome, descricao,preco);
            produto.cadastrarProduto();
        } else if(e.getSource() == btnEstabelecimento) {
            Label textCnpj = null;
            int CNPJ = Integer.parseInt(textCnpj.getText());
            Label txtNomEstabelecimento = null;
            String nomEstabelecimento = txtNomEstabelecimento.getText();
            String endereco = txtEndereco.getText();
            int telefone = Integer.parseInt((txtTelefone.getText()));
            Estabelecimento.setnomestabelecimento(nomEstabelecimento);
            Estabelecimento.setEndereco(endereco);
            Estabelecimento.setTelefone(telefone);
            Estabelecimento.atualizarProduto();


        }else if (e.getSource() == btnAtualizar) {
            String nome = txtNome.getText();
            String descricao = txtDescricao.getText();
            double preco = Double.parseDouble(txtPreco.getText());
            produto.setNome(nome);
            produto.setDescricao(descricao);
            produto.setPreco(preco);
            produto.atualizarProduto();
        } else if (e.getSource() == btnConsultar) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            double preco;
            produto = new Produto(codigo, "", "","");
            produto.consultarProduto();
        } else if (e.getSource() == btnCotacao) {
            double preco = produto.fazerCotacao();
            JLabel lblCotacao = new JLabel("Preço: R$" + preco);
            panel.add(lblCotacao);
        }
    }
}
