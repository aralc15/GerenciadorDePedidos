package PedidoOnline;

import PedidoPadrao.Pedido;

import java.util.Scanner;

public class Online extends Pedido {

    static Scanner entrada = new Scanner(System.in);

    public static void menuOnline(){
        System.out.println("──────▄▀▄─────▄▀▄");
        System.out.println("─────▄█░░▀▀▀▀▀░░█▄");
        System.out.println("─▄▄──█░░░░░░░░░░░█──▄▄");
        System.out.println("█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█");
        System.out.println("_______________________________________");
        System.out.println("_______ BEM VINDO AO ATENDIMENTO ______");
        System.out.println("_______________ ONLINE  _______________");
        System.out.println("**SELECIONE QUE OPERAÇÃO DESEJA FAZER**");
        System.out.println("_______________________________________");
        System.out.println("|  Opção 1 - Listar                |");
        System.out.println("|  Opção 2 - Compra                |");
        System.out.println("|  Opção 3 - Ver Carrinho          |");
        System.out.println("|  Opção 4 - Delivery              |");
        System.out.println("|  Opção 5 - Retirada              |");
        System.out.println("|  Opção 6 - Sair                  |");

        int esco = entrada.nextInt();
        switch (esco) {
            case 1:
                // listarProdutos();
                break;
            case 2:
                //comprarProdutos();
                break;
            case 3:
                //verCarrinho();
                break;

            case 4:
              //delivery();
                break;

            case 5:
               // retirada();
                break;

            case 6:
                System.out.println("──────▄▀▄─────▄▀▄");
                System.out.println("─────▄█░░▀▀▀▀▀░░█▄");
                System.out.println("─▄▄──█░░░░░░░░░░░█──▄▄");
                System.out.println("█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█");
                System.out.println("_______________________________________");
                System.out.println("____ Até a próxima, volte sempre ;D ___");
                System.out.println("_______________________________________");
                break;

            default:
                System.out.println(" (/)__(/)");
                System.out.println(" (=*.*=) ");
                System.out.println(" (“)__(“)");
                System.out.println("EPA, essa opção não esta na nossa lista ;D");
                break;

        }
    }


        private String endereco;

        public void PedidoOnline(String id, String nomeCliente, String descricao, double valor, String endereco) {
            //super(id, nomeCliente, descricao, valor);
            this.endereco = endereco;

        }

    public Online(String id, String nomeCliente, String descricao, double valor) {
        super(id, nomeCliente, descricao, valor);
    }

    // Adiciona um método para obter o endereço
        public String getEndereco() {
            return endereco;
        }

        // Adiciona um método para definir o endereço
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        // Sobrescreve o método fazer() para incluir a entrega
        @Override
        public void fazer() {
            super.fazer();
            System.out.println("O pedido será entregue no endereço: " + endereco);
        }

}

