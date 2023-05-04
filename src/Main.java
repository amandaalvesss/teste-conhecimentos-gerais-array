import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int numPerg = 5;
        int pontoQuestao = 2;
        int nota =0;

        String [] gabarito = {"a", "c", "b", "c", "a"};
        String [] perguntas = {
                "Quem inventou a lâmpada?",
                "Qual o maior planeta do sistema solar?",
                "Qual a maior floresta tropical do mundo?",
                "Qual o monumento famoso pela sua inclinação?",
                "Quem pintou Mona Lisa?"};

        String [] alternativas ={
                "a) Thomas Edison        b) Henry Ford          c) Santos Dumont",
                "a) Saturno              b) Terra               c) Júpiter",
                "a) Pantanal             b) Floresta Amazônica  c) Caatinga",
                "a) Estátua da Liberdade b) Cristo Redentor     c) Torre de Pisa",
                "a) Leonardo da Vinci    b) Salvador Dalí       c) Van Gogh"};


        String [] respostas = new String[numPerg];


        System.out.println("------------ TESTE DE CONHECIMENTOS GERAIS ----------------- ");
        System.out.println("Qual o seu nome?");
        String nome = scan.nextLine();

        for (int i = 0; i < numPerg; i++){
            System.out.println(perguntas [i]);
            System.out.println(alternativas[i]);
            String respostaAluno = scan.nextLine();
           respostas[i] = respostaAluno;
       }

        for(int i = 0; i < 5; i++) {
            if (respostas[i].equals(gabarito[i])) {
                nota += pontoQuestao;
            }
        }

        System.out.println(nome + ", você fez " + nota  + " pontos!");
        if (nota >= 6){
            System.out.println("Parabéns, você passou!");
        } else {
            System.out.println("Estude mais e tente novamente!");

        }

    }
}