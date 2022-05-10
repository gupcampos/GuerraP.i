/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.piguerra;

import java.util.Scanner;

/**
 *
 * @author gupca
 */
public class Piguerra {

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
                System.out.println("teste");
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

