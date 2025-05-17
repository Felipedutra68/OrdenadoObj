package Carteziano;

import Estoque.Produto;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ponto Po = new Ponto();

        Ponto Po2 = new Ponto();

        System.out.println("Digite as coordenadas do primiro ponto");
        System.out.println("X");
        Po.x = teclado.nextInt();
        System.out.println("Y");
        Po.y = teclado.nextInt();

        
        System.out.println("Digite as coordenadas do segundo ponto");
        System.out.println("X");
        Po2.x = teclado.nextInt();
        System.out.println("Y");
        Po2.y = teclado.nextInt();
        
        double di = Po.CD(Po2);
        System.out.println("A distancia entre os dois pontos eh "+di);
        
    }
}
