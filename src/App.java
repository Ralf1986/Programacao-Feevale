import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Equipamento> equipamentos = new ArrayList<>();
        Locale.setDefault(Locale.US);// mudar para ponto

        JFrame frame = new JFrame("Menu de Opções");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        frame.setPreferredSize(new Dimension(600, 400));// Define o tamanho preferencial do JFrame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();// Obtém o tamanho da tela
        // Calcula a posição para centralizar o JFrame
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);// Define a posição do JFrame

        BufferedImage imagem = null;
        try {
            imagem = ImageIO.read(new File("src/img1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (imagem != null) {
            JLabel imagemLabel = new JLabel(new ImageIcon(imagem));
            frame.add(imagemLabel);
        }

        JLabel rotulo = new JLabel("Escolha uma das opões");
        frame.add(rotulo);
        rotulo.setBounds(20,5,200,50);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton btnIncluir = new JButton("Incluir equipamento");
        btnIncluir.setBounds(20,50,200,30);
        JButton btnPesquisar = new JButton("Pesquisar equipamento");
        btnPesquisar.setBounds(20,100,200,30);
        JButton btnRemover = new JButton("Remover equipamento");
        btnRemover.setBounds(20,150,200,30);
        JButton btnSair = new JButton("Sair do programa");
        btnSair.setBounds(20,200,200,30);

        panel.add(btnIncluir);
        panel.add(btnPesquisar);
        panel.add(btnRemover);
        panel.add(btnSair);

        frame.add(panel);

        btnIncluir.addActionListener(e -> {
            IncluirEquipamento(equipamentos);
        });
        btnPesquisar.addActionListener(e -> {
            pesquisaEquipamento(equipamentos);
        });
        btnRemover.addActionListener(e -> {
            excluirEquipamento(equipamentos);
        });
        btnSair.addActionListener(e -> {
            sair(equipamentos);
        });

        frame.setVisible(true);

    }

    public static void IncluirEquipamento(List<Equipamento> equipamentos) {
        // Crie uma janela de diálogo para entrada de dados
        JFrame frame = new JFrame("Incluir Equipamento");

        // Painel para conter os campos de entrada com layout GridLayout
        JPanel panel = new JPanel(new GridLayout(0, 2));

        // Painel para conter os campos de entrada
        //JPanel panel = new JPanel();

        // Crie os componentes para entrada de dados
        JTextField codigoField = new JTextField(10);
        JTextField descricaoField = new JTextField(20);
        JTextField nomeUsuarioField = new JTextField(20);
        JTextField setorUsuarioField = new JTextField(20);
        JTextField pesoField = new JTextField(10);

        // Adicione os componentes ao painel

        panel.add(new JLabel("Código: "));
        panel.add(codigoField);
        panel.add(new JLabel("Descrição: "));
        panel.add(descricaoField);
        panel.add(new JLabel("Nome de Usuário: "));
        panel.add(nomeUsuarioField);
        panel.add(new JLabel("Setor: "));
        panel.add(setorUsuarioField);
        panel.add(new JLabel("Peso: "));
        panel.add(pesoField);
        panel.add(new JLabel());

        // Botão para confirmar a inclusão
        JButton confirmButton = new JButton("Confirmar");
        panel.add(confirmButton);

        // Adicione o painel à janela
        frame.add(panel);

        // Defina as ações do botão
        confirmButton.addActionListener(e -> {
            int codigo = Integer.parseInt(codigoField.getText());
            String descricao = descricaoField.getText();
            String nomeUsuario = nomeUsuarioField.getText();
            String setorUsuario = setorUsuarioField.getText();
            double peso = Double.parseDouble(pesoField.getText());

            Equipamento equipamento = new Equipamento(codigo, descricao, new Usuario(nomeUsuario, setorUsuario));
            equipamentos.add(equipamento);

            // Feche a janela após a inclusão
            frame.dispose();

            System.out.println("Equipamento adicionado com sucesso!");
        });

        // Configure a janela
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void pesquisaEquipamento(List<Equipamento> equipamentos) {
        Scanner scanner = new Scanner(System.in);

        String codigo = JOptionPane.showInputDialog(null,"Digite o codigo");
        //System.out.println("Digite o codigo do equipamento desejado: ");
        int codigoInt = Integer.parseInt(codigo);

        for (int i = 0; i < equipamentos.size(); i++) {
            Equipamento equipamento = equipamentos.get(i);
            if (equipamento.getCodigo() == codigoInt) {
                equipamento.exibirDados();
                return;
            }
        }
        JOptionPane.showMessageDialog(null,"Equipamento não encontrado.");
        //System.out.println("Equipamento não encontrado.");
    }

    public static void excluirEquipamento(List<Equipamento> equipamentos) {
        Scanner scanner = new Scanner(System.in);



        String codigo = JOptionPane.showInputDialog(null,"Digite o código");
        //System.out.println("Digite o código do equipamento a excluir: ");
        int codigoInt = Integer.parseInt(codigo);

        for (int i = 0; i < equipamentos.size(); i++) {
            Equipamento equipamento = equipamentos.get(i);
            if (equipamento.getCodigo() == codigoInt) {
                equipamentos.remove(i);
            }
        }
    }

    public static void sair(List<Equipamento> equipamentos) {
        int quant = 0;
        for (int i = 0; i < equipamentos.size(); i++) {
            if (equipamentos.get(i) != null) {
                quant++;
            }
        }
        String mensagem = "A lista contém " + quant + " equipamentos.";
        JOptionPane.showMessageDialog(null, mensagem, "Quantidade de Equipamentos",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0); // Fecha o programa
    }
}

