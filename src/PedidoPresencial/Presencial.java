package PedidoPresencial;
import java.util.Scanner;


public class Presencial {

    static Scanner entrada = new Scanner(System.in);

    public static void menuPresencial() {
        System.out.println("──────▄▀▄─────▄▀▄");
        System.out.println("─────▄█░░▀▀▀▀▀░░█▄");
        System.out.println("─▄▄──█░░░░░░░░░░░█──▄▄");
        System.out.println("█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█");
        System.out.println("_______________________________________");
        System.out.println("______ BEM VINDO AO ATENDIMENTO _______");
        System.out.println("_____________ PRESENCIAL ______________");
        System.out.println("**SELECIONE QUE OPERAÇÃO DESEJA FAZER**");
        System.out.println("_______________________________________");
        System.out.println("|  Opção 1 - Listar                |");
        System.out.println("|  Opção 2 - Compra                |");
        System.out.println("|  Opção 3 - Ver Carrinho          |");
        System.out.println("|  Opção 4 - Escolher minha mesa   |");
        System.out.println("|  Opção 5 - Sair                  |");

        int esco = entrada.nextInt();
        switch (esco) {
            case 1:
                //listarProdutos();
                break;
            case 2:
                //comprarProdutos();
                break;
            case 3:
                //verCarrinho();
                break;

            case 4:
                mesaCliente();
                break;
            case 5:
                System.out.println("──────▄▀▄─────▄▀▄");
                System.out.println("─────▄█░░▀▀▀▀▀░░█▄");
                System.out.println("─▄▄──█░░░░░░░░░░░█──▄▄");
                System.out.println("█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█");
                System.out.println("_______________________________________");
                System.out.println("____ Até a próxima, volte sempre ;D ___");
                System.out.println("_______________________________________");
                System.exit(0);
                break;

            default:
                System.out.println(" (/)__(/)");
                System.out.println(" (=*.*=) ");
                System.out.println(" (“)__(“)");
                System.out.println("EPA, essa opção não esta na nossa lista ;D");
                menuPresencial();
                break;

        }


    }


    public static void mesaCliente(){
        System.out.println("◯╔═╗◯ __________________________________");
        System.out.println("◯║ ║◯ ______ Escolha sua mesa;D ________");
        System.out.println("◯╚═╝◯ __________________________________");
        System.out.println("◯╔═╗◯ __________________________________");
        System.out.println("◯║ ║◯ ____ Disponiveis 1, 2, 3, 4 e 5___");
        System.out.println("◯╚═╝◯ __________________________________");
        int escolha2 = entrada.nextInt();
        if (escolha2 == 1){
            System.out.println("Muito bem, você será atendido pela Ana, qualquer coisa só chamar ;D");
        } else if (escolha2 == 2) {
            System.out.println("Muito bem, você será atendido pela Gabi, qualquer coisa só chamar ;D");
        } else if (escolha2 == 3) {
            System.out.println("Muito bem, você será atendido pelo Daniel, qualquer coisa só chamar ;D");
        } else if (escolha2 == 4) {
            System.out.println("Muito bem, você será atendido pelo Felipe, qualquer coisa só chamar ;D");
        } else if (escolha2 == 5) {
            System.out.println("Muito bem, você será atendido pela Maria, qualquer coisa só chamar ;D");
        } else {
            System.out.println("\n");
            System.out.println(" (/)__(/)");
            System.out.println(" (=*.*=) ");
            System.out.println(" (“)__(“)");
            System.out.println("EPA, só temos mesas de 1 a 5 ;D");
            System.out.println("\n");
            mesaCliente();
        }
        menuPresencial();
    }
}
/*
    public static void listarProdutos(){
            if (x.size() > 0) {
                System.out.println("---------- LISTA DE PRODUTOS: ---------- \n");
                for (Produto p : produtos) {
                    System.out.println(p);
                    System.out.println("\n");
                }

            } else {
                System.out.println(" Nenhum Produto Cadastrado \n");
                menuPresencial();

            }

        }

    public static void comprarProdutos() {
        if (produtos.size() > 0) {

            System.out.println("---------- Produtos Disponíveis ---------- \n");
            for (Produto p : produtos) {
                System.out.println(p + "\n");

            }
            System.out.println("Código do produto: \n");
            int id = Integer.parseInt(entrada.next());
            boolean isPresente = false;

            for (Produto p : produtos) {
                if (p.getId() == id) {
                    int qtd = 0;
                    try { //
                        qtd = carrinho.get(p);
                        //se o produto ja estiver no carrinho incrementar a quantidade
                        carrinho.put(p, qtd + 1);
                    } catch (NullPointerException e) {
                        // se o estiver sendo adcionado pela primeira vez
                        carrinho.put(p, 1);
                    }
                    System.out.println(p.getNome() + " Adcionado ao carrinho.");
                    isPresente = true;

                    if (isPresente) {
                        System.out.println("Deseja comtinuar comprando? ");
                        System.out.println("Digite 1 para continuar comprando ou 0 para finalizar compra atual: ");
                        int esco = Integer.parseInt(entrada.next());
                        if (esco == 1) {
                            compraProdutos();
                        } else if (esco == 0) {
                            finalizarCompra();
                        }

                    }
                } else {
                    System.out.println("Esse Produto Não foi Encontrado");
                    menu();
                }

            }
        } else {
            System.out.println("Este produto não esta cadastrado no nosso mercado");
            menu();
        }

    }

    public static void verCarrinho(){
        System.out.println("---------- Produtos no seu carrinho ---------- \n");
        if (carrinho.size() > 0){
            for (Produto p : carrinho.keySet()) {
                System.out.println("Produto: " + p + "\nQuantidade: " + carrinho.get(p));
            }
        } else {
            System.out.println("---------- CARRINHO VAZIO ---------- \n");
        }
        menuPresencial();
    }

    }
    public static void listarProdutos(){
        produtos1 = new ArrayList<>();
        String nome = "Cheetos";
        Double preco = 4.5;
        String nome2 = "Rufles";
        Double preco2 = 6.5;
        String nome3 = "Fofura";
        Double preco3 = 2.5;
        String nome4 = "Foleado de carne";
        Double preco4 = 5.5;
        String nome5 = "Doritos";
        Double preco5 = 4.5;
        Produto lanche = new Produto(nome, preco, nome2, preco2, nome3, preco3, nome4, preco4, nome5, preco5);
        produtos1.add(lanche);
        System.out.println("---------- LISTA DE PRODUTOS: ---------- \n");
        System.out.println(produtos1);

    }
}
}
 */
