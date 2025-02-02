package listaHeranca.ingresso;

import java.util.Scanner;

public class Evento {
    public static void main(String[] args) {
        float custoTotal = 0;
        Ingresso ingresso = null;
        int tipoIngresso = 0;
        String camarote = "Sem camarote";
        float comboPipoca = 0;
        String tipoPipoca = "Sem pipoca";

        Scanner scan = new Scanner(System.in);
        System.out.println("*** Compra de ingresso ***");

        // Loop para escolher o tipo de ingresso
        boolean executando = true;
        while (executando) {
            System.out.print("Ingresso Normal (1) ou VIP (2): ");
            tipoIngresso = scan.nextInt();

            switch (tipoIngresso) {
                case 1:
                    ingresso = new IngressoNormal(10); // Cria um ingresso normal
                    custoTotal += ingresso.getValor();
                    executando = false;
                    break;
                case 2:
                    ingresso = new IngressoVIP(10, 0.4f); // Cria um ingresso VIP
                    custoTotal += ingresso.getValor(); // Soma o valor do ingresso VIP
                    executando = false;
                    break;
                default:
                    System.out.println("Tente novamente...");
                    break;
            }
        }

        // Se o ingresso for VIP, perguntar sobre o tipo de camarote
        if (tipoIngresso == 2 && ingresso instanceof IngressoVIP) {
            System.out.print("Camarote Inferior (1) ou Superior (2): ");
            int tipoCamarote = scan.nextInt();

            while (tipoCamarote != 1 && tipoCamarote != 2) {
                System.out.println("Tente novamente...");
                System.out.print("Camarote Inferior (1) ou Superior (2): ");
                tipoCamarote = scan.nextInt();
            }

            // Atualiza o tipo de camarote no ingresso VIP
            if (tipoCamarote == 1) {
                CamaroteInferior camaroteInferior = new CamaroteInferior((IngressoVIP) ingresso);
                camarote = camaroteInferior.getLocalizacao();
                // Não soma o valor novamente, pois já foi somado quando o ingresso VIP foi criado
            } else if (tipoCamarote == 2) {
                CamaroteSuperior camaroteSuperior = new CamaroteSuperior((IngressoVIP) ingresso);
                camarote = camaroteSuperior.getLocalizacao();
                // Não soma o valor novamente, pois já foi somado quando o ingresso VIP foi criado
            }
        }

        // Loop para escolher o combo de pipoca
        executando = true;
        while (executando) {
            System.out.println("Você gostaria de um combo de pipoca?");
            System.out.println("Pequena (1) - Média (2) - GRANDE (3) - Sem pipoca! (0)");

            int pipoca = scan.nextInt();
            switch (pipoca) {
                case 0:
                    comboPipoca = 0;
                    tipoPipoca = "Sem pipoca";
                    executando = false;
                    break;
                case 1:
                    comboPipoca = 5;
                    tipoPipoca = "Pequena";
                    executando = false;
                    break;
                case 2:
                    comboPipoca = 7;
                    tipoPipoca = "Média";
                    executando = false;
                    break;
                case 3:
                    comboPipoca = 10;
                    tipoPipoca = "Grande";
                    executando = false;
                    break;
                default:
                    System.out.println("Tente novamente...");
                    break;
            }
        }

        // Exibe os detalhes da compra
        System.out.println("\n--- Resumo da Compra ---");
        System.out.println(ingresso.getTipoIngresso() + ": " + ingresso.getValor());
        System.out.println("CAMAROTE: " + camarote);
        System.out.println("COMBO PIPOCA (" + tipoPipoca + "): " + comboPipoca);
        System.out.println("Custo Total: " + (custoTotal + comboPipoca));

        System.out.println("\nBoa atração! Volte sempre!");
        scan.close();
    }
}