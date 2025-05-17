package Carteziano;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Ponto {
    
 int y;   
 int x;   
 double CD(Ponto Ponto2){   
int Dx = x - Ponto2.x;
 int Dy = y - Ponto2.y;
 return Math.sqrt(Dx * Dx + Dy * Dy); 
 
   

 }
 
 
}
