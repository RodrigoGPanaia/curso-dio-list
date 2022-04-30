package ExercicioLista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex1Temperatura {
    public static void main(String[] args) {
        /*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as
        em uma lista. Após isto, calcule a média semestral das temperaturas e mostre todas as
        temperaturas acima desta média, e em que mês elas ocorreram (mostrar o mês por extenso:
        1 – Janeiro, 2 – Fevereiro e etc).
        */

        Scanner scan = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList<Double>();
        double soma = 0.0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Qual a temperatura do mês " + i + ": ");
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
            soma += temp;
        }
        double mediaTemperaturasSemenstral = soma/temperaturasSemestral.size();

        System.out.println("___________________________________________________________________");
        System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
        System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + " C");

        System.out.print("Temperaturas acima da média: ");
        temperaturasSemestral.stream()
                .filter(t -> t > mediaTemperaturasSemenstral)
                .forEach(t -> System.out.printf("%.1f ", t));
        System.out.println("\n___________________________________________________________________");
        for (Double temp : temperaturasSemestral) {
            if(temp > mediaTemperaturasSemenstral) {
                int index = temperaturasSemestral.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " C");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " C");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " C");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " C");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " C");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " C");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
