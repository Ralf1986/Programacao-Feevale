import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Equipamento> equipamentos = new ArrayList<>();
        Locale.setDefault(Locale.US);// mudar para ponto

        Equipamento equipamento1 = new Equipamento(123, "Noot book", new Usuario("Ralf", "Vendas"));
        Equipamento equipamento2 = new Equipamento(124, "Telefone", new Usuario("Lucas", "Gerencia"));

        Equipamento equipamento3 = new Equipamento(125, "Impressora");
        Usuario usuario1 = new Usuario("Maicom", "Manutenção");
        equipamento3.setUsuario(usuario1);


        int escolha;
        do {
            System.out.println("=====================Escolha uma opção=====================");
            System.out.println("\t1-Incluir Equipamento");
            System.out.println("\t2-Pesquisar Equipamento");
            System.out.println("\t3-Remover Equipamento");
            System.out.println("\t4-Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    IncluirEquipamento(equipamentos);
                    break;
                case 2:
                    pesquisaEquipamento(equipamentos);
                    break;
                case 3:
                    excluirEquipamento(equipamentos);
                    break;
                case 4:
                    sair(equipamentos);
                    break;
                default:
                    System.out.println("Opção invalida!");

            }


        }
        while (escolha != 4);
        scanner.close();

    }

    public static void IncluirEquipamento(List<Equipamento> equipamentos) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        int aux = 0;
        for (int i = 0; i < equipamentos.size(); i++) {
            Equipamento equipamento = equipamentos.get(i);
            if (equipamento.getCodigo() == codigo) {
                aux = 1;
                break;
            }
        }
        if (aux == 1) {
            System.out.println("Código já existe. Digite novamente");
        } else {
            codigo = scanner.nextInt();
            scanner.nextLine();
        }


        System.out.println("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Nome de usuario: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Setor: ");
        String setorUsuario = scanner.nextLine();

        System.out.println("DIgite o peso do equipamento! zero para equipamento fixo: ");
        double peso = scanner.nextDouble();

        int sala = 0;
        String seguro = "";

        if (peso > 0) {

            do {
                scanner.nextLine();
                System.out.println("Seguro (S/N): ");
                seguro = scanner.nextLine().toUpperCase();
                if (!seguro.equals("S") && !seguro.equals("N")) {
                    System.out.println("Valor invalido. Digite novamente! ");
                }

            } while (!seguro.equals("S") && !seguro.equals("N"));

        } else {
            System.out.println("Sala: ");
            sala = scanner.nextInt();
        }

        Equipamento equipamento = new Equipamento(codigo, descricao, new Usuario(nomeUsuario, setorUsuario));
        equipamentos.add(equipamento);

        System.out.println("Equipamento adicionado com sucesso!");
    }

    public static void pesquisaEquipamento(List<Equipamento> equipamentos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o codigo do equipamento desejado: ");
        int codigo = scanner.nextInt();

        for (int i = 0; i < equipamentos.size(); i++) {
            Equipamento equipamento = equipamentos.get(i);
            if (equipamento.getCodigo() == codigo) {
                equipamento.exibirDados();
                return;
            }
        }

        System.out.println("Equipamento não encontrado.");
    }

    public static void excluirEquipamento(List<Equipamento> equipamentos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do equipamento a excluir: ");
        int codigo = scanner.nextInt();

        for (int i = 0; i < equipamentos.size(); i++) {
            Equipamento equipamento = equipamentos.get(i);
            if (equipamento.getCodigo() == codigo) {
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
            System.out.println("A lista contem " + quant + " equipamentos.");

        }

    }


}

