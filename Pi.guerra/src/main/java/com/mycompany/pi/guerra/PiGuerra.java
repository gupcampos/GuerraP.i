/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pi.guerra;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class PiGuerra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade;
// contextualização
        System.out.println("Atena, no intuito de preparar Theo, e trazer o conhecimento e sabedoria da guerra, ela o leva para uma experiência \n"
                + "de guerra, onde ele iria conhecer a verdade sobre as guerras, diferente da visão que seu pai tinha");
        //história
        System.out.println("Iniciando em um corredor totalmente escuro, com ruídos de armas recarregando, e fuzis disparando, como se fossem\n"
                + "disparos de testes e avisos");

        do {

            System.out.println("Theo tem 2 opções, seguir no corredor escuro e enfrentar tudo o que pode acontecer, ou procurar um interruptor.\n"
                    + "Digite 1 para procurar um interruptor\n"
                    + "Digite 2 seguir no escuro");

            grade = input.nextInt();

        } while (grade != 1 && grade != 2);

        switch (grade) {

            case 1:
                System.out.println("ao procurar o interruptor, ele (theo), encontra um tablet, \n"
                        + " porém para desbloquea-lo ele precisa descobrir a senha de \n"
                        + "acesso, que é a resposta de um eniguima!\n"
                        + " qual a data de invasão  mais recente de um país pelo outro, dando inicio a uma guerra?");

                int diaQ1,
                 mesQ1,
                 anoQ1;
                do {
                    System.out.print("dia:");
                    diaQ1 = input.nextInt();
                    System.out.print("mes:");
                    mesQ1 = input.nextInt();
                    System.out.print("ano:");
                    anoQ1 = input.nextInt();
                    if (diaQ1 != 24 || mesQ1 != 02 || anoQ1 != 2022) {
                        System.out.println("você errou, tente novamente!");
                    }
                } while (diaQ1 != 24 || mesQ1 != 02 || anoQ1 != 2022);

                System.out.println("O Theo ao conseguir desbloquear, ve toda aquela cena de guerra, não as mais \n"
                        + "conhecidas, como imagem de homens fardados com armas, e sim a cena de uma cidade \n"
                        + "destruída, com pessoas feridas, desoladas, crianças perdidas chorando, inúmeros \n"
                        + "tiroteios e bombardeios acontecendo ao redor.)\n");
                System.out.println("\n");
                System.out.println("DERREPENTE, ele é surpreendido com uma bomba de fumaça, perde todos os seus \n"
                        + "sentidos, e acaba desmaiando.\n"
                        + "\n"
                        + "Tempo depois. Ele acorda sem saber onde está, em um local \n"
                        + "completamente escuro. De repente, acende painéis iluminando apenas as áreas onde \n"
                        + "podem ser pisadas, mantendo a escuridão no entorno.\n"
                        + "\n"
                        + "O Theo decide se mover pelo corredor, \n"
                        + "ao som de bombas explodindo, e mantendo aqueles mesmos avisos de armas! \n"
                        + "pelo caminho, ele recebe pelo tablet um \n"
                        + "“torpedo” questionando se ele sabe onde e quando ele está?\n"
                        + "DERREPENTE Theo houve um barulho ensurdecedor,\n"
                        + "como nunca ninguém ouviu antes, e de repente tudo se ilumina!\n"
                        + "uma nuvem gigante em formato de cogumelo se forma ao fundo! parece o apocalipse\n"
                        + " para fugir disso, descubra onde e quando você está!");
                //onde: Hiroshima 06/08/1945;

                String onde;
                int diaQ2,
                 mesQ2,
                 anoQ2;
                do {
                    System.out.println("onde você está?");
                    onde = input.next();
                    if (onde != "hiroshima" | onde != "Hiroshima" | onde != "HIROSHIMA") {
                        System.out.println("você ainda não sabe onde está! tente novamente! (dica: bomba nuclear!");
                    } else {
                        System.out.println("você acertou onde!");
                    }
                } while (onde != "hiroshima" | onde != "Hiroshima" | onde != "HIROSHIMA");
                do {
                    System.out.println("em quando você está?");
                    System.out.println("dia:");
                    diaQ2 = input.nextInt();
                    System.out.println("mes:");
                    mesQ2 = input.nextInt();
                    System.out.println("ano:");
                    anoQ2 = input.nextInt();
                    if (diaQ2 == 06 || mesQ2 == 8 || anoQ2 == 1945) {
                        System.out.println("exatamente! esse foi um marco historico e mundialmente triste!");
                    } else {
                        System.out.println("ainda não sabe onde está! (dica: bomba nuclear!)");
                    }

                } while (diaQ2 != 06 || mesQ2 != 8 || anoQ2 != 1945);

                System.out.println("Hiroshima foi onde explodiu a primeira bomba atômica no mundo, seu poder para \n"
                        + "época era inigualável, nunca havia visto algo assim antes, sua explosão dizimou cerca \n"
                        + "de 140.000 pessoas, acabando com toda uma civilização) isso considerando que é uma \n"
                        + "bomba que explodiu em 1945, dado isso, consideramos o ano de 2022, temos bombas \n"
                        + "com poderio aproximado em 3000 X o poder da bomba de Hiroshima, então sabemos \n"
                        + "que é uma bomba de proporções infinitas, onde não existe algo que possa se livrar das \n"
                        + "consequências dessas bombas. \n"
                        + "\n"
                        + "Com esse conhecimento, sabendo de todas essas consequencias que a guerra nos trás,\n"
                        + "é impossivel imaginar o anseio a tais atos!");
                break;
            case 2:
                System.out.println("Theo sai correndo no escuro como se não houvesse amanhã, de repente começam \n"
                        + "clarões no céu de misseis passando (neste momento Theo, se depara com toda aquela \n"
                        + "cena de guerra, não as mais conhecidas, como imagem de homens fardados com \n"
                        + "armas, e sim a cena da cidade destruída, com pessoas feridas, desoladas, crianças \n"
                        + "perdidas chorando, e inúmeros tiroteios acontecendo ao redor.)");
                //início desafio 1b    
                int resposta;
                System.out.println("De repente um grupo de soldados o aborda, acreditando que Theo seja um infiltrado\n"
                        + "eles começam a questioná-lo sobre quem ele é e porque ele estava ali\n"
                        + "Theo fica sem reação e se questionando se tudo aquilo era realmente real,\n"
                        + "até que todos os soldados perguntam\n "
                        + "Quem é o maior culpado por essa Guerra?");
                do {
                    System.out.println(
                            " 1) Vladmir Putin\n "
                            + "2) Adolf Hitler\n "
                            + "3) Josef Stalin\n"
                            + " 4) Fidel Castro");
                    System.out.println("insira o número que corresponde à alternativa correta");
                    resposta = input.nextInt();
                } while (resposta != 1);
                System.out.println("ótimo ele é ucraniano, deixem ele ir");
                System.out.println("logo após, ainda muito assustado com o que estava acontecendo, Theo sai correndo novamente...");
                System.out.println("Durante sua fuga desesperada Theo acaba se perdendo, até que começam a tocar sirenes alerta de bomba\n"
                        + "Dessa mesma sirene começa a sair uma risada diabólica\n "
                        + "mas logo essa risada é ofuscada pelo som mais alto e ensurdecedor de todos,\n"
                        + "e junto desse som uma nuvem se forma no horizonte com a forma de um cogumelo.\n"
                        + "Enquanto isso Theo escuta uma voz macabra que lembrava muito a de seu pai, lhe perguntanto se sabia onde estava ");
                int resposta2;
                System.out.println("para prosseguir responda onde você está");

                do {
                    System.out.println(
                            " 1) Hiroshima quando: 06/09/1950\n "
                            + "2) Nagazaki quando: 03/07/1943\n "
                            + "3) Hiroshima quando: 06/08/1945\n"
                            + " 4) Japão quando: 02/07/1942");
                    System.out.println("insira o número que corresponde à alternativa correta");
                    resposta2 = input.nextInt();
                } while (resposta2 != 3);
                System.out.println("Hiroshima foi onde explodiu a primeira bomba atômica no mundo, seu poder para \n"
                        + "época era inigualável, nunca havia visto algo assim antes, sua explosão dizimou cerca\n"
                        + "de 140.000 pessoas, acabando com toda uma civilização) isso considerando que é uma \n"
                        + "bomba que explodiu em 1945, dado isso, consideramos o ano de 2022, temos bombas \n"
                        + "com poderio aproximado em 3000 X o poder da bomba de Hiroshima, então sabemos \n"
                        + "que é uma bomba de proporções infinitas, onde não existe algo que possa se livrar das \n"
                        + "consequências dessas bombas. ");
                break;
        }
    }
}
