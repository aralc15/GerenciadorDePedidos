package PedidoPadrao;

import Modelo.Produto;
import PedidoOnline.Online;
import PedidoPresencial.Presencial;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    public static ArrayList<Produto> produtos = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    private String id;
    private String nomeCliente;
    private String descricao;
    private double valor;
    private boolean pago;
    private boolean concluido;

    public Pedido(String id, String nomeCliente, String descricao, double valor) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.descricao = descricao;
        this.valor = valor;
        this.pago = false;
        this.concluido = false;
    }

    public void fazer() {
        System.out.println("Pedido feito por: " + nomeCliente);
    }

    public void cancelar() {
        System.out.println("Pedido cancelado.");
    }

    public void atualizar(String nomeCliente, double valor) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        System.out.println("Pedido atualizado.");
    }

    public void concluir() {
        this.concluido = true;
        System.out.println("Pedido concluído.");
    }

    public void registrarPagamento() {
        this.pago = true;
        System.out.println("Pagamento registrado.");
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }


    public static void menuPadrao(){
        System.out.println("╔╔══════════════════════╗╗");
        System.out.println("║║▐█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▌║║        _______________________________________________________");
        System.out.println("║║▐▌░░▒▒░░▒▒░░▒▒░░▒▒░░▐▌║║        __________ BEM VINDO AO RESTAURANTE STREAM ____________");
        System.out.println("║║▐▌▒▒░░▒▒░░▒▒░░▒▒░░▒▒▐▌║║        _______________________________________________________");
        System.out.println("║║▐▌▒▒░░▒▒░░▒▒░░▒▒░░▒▒▐▌║║        _________ DIGA-NOS QUAL SEU TIPO DE PEDIDO? ___________");
        System.out.println("║║▐▌░░▒▒░░▒▒░░▒▒░░▒▒░░▐▌║║        _______________________________________________________");
        System.out.println("║║▐▌▒▒░░▒▒░░▒▒░░▒▒░░▒▒▐▌║║        |  Opção 1 - Presencial      |");
        System.out.println("║║▐▌░░▒▒░░▒▒░░▒▒░░▒▒░░▐▌║║        |  Opção 2 - Online          |");
        System.out.println("║║▐█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█▌║║        |  Opção 3 - Sair            |");
        System.out.println("╚╚══════════════════════╝╝");
        System.out.println("██▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄██");
        System.out.println("██▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄██");
        System.out.println("██▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄██");
        System.out.println("██▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀██");
        System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

        int escolha1 = entrada.nextInt();
        switch (escolha1){
            case 1:
                System.out.println("\n");
                Presencial.menuPresencial();
                break;

            case 2:
                Online.menuOnline();
                break;

            case 3:
                System.out.println("\n");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("▒▒▒▒▓▒▒▓▒▒▒▒");
                System.out.println("▒▒▒▒▓▒▒▓▒▒▒▒");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("▒▓▒▒▒▒▒▒▒▒▓▒");
                System.out.println("▒▒▓▓▓▓▓▓▓▓▒▒");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒");
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

}
