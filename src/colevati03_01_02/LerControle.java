/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colevati03_01_02;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class LerControle {
    public static void Carregar(Scanner ler){
        String[] palavras = ler.nextLine().split(";");
        System.out.println(palavras.length);
    }
}
