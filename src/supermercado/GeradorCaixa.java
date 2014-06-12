/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermercado;

import java.util.Random;

/**
 *
 * @author tessis
 */
public class GeradorCaixa {
    private double probabilidade;
    private int quantidadeGerada;
    private static final Random gerador = new Random(); //gerador de numeros aleatorios de Java
    
    public GeradorCaixa(double p)
    {
        probabilidade = p;
        quantidadeGerada = 0;
    }
    
    public boolean gerar()
    {
        boolean gerado = false;
        if(gerador.nextDouble() < probabilidade)
        {
            quantidadeGerada++;
            gerado = true;
        }
        return gerado;
    }
    
    public int getQuantidadeGerada()
    {
        return quantidadeGerada;
    }
    
}
