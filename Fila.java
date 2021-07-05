package com.grupo2.filaed;

import java.util.Scanner;

public class Fila {
    
    public static void main(String[] args) 
    {
        Scanner le = new Scanner(System.in);
        ControllerFila fila = new ControllerFila();
        int opcao;
        int valor;


        System.out.println("-_-_- Fila _-_-_");

        do 
        {
            System.out.println("\n***********************************");
            System.out.println("\n FILA SEM CABEÇA");
            System.out.print("\nEntre com a opcao:");
            System.out.print("\n ----1: Inserir");
            System.out.print("\n ----2: Excluir");
            System.out.print("\n ----3: Exibir");
            System.out.print("\n ----4: Sair do programa");
            System.out.print("\n***********************************");
            System.out.print("\n-> ");
            opcao = le.nextInt();
            System.out.println();
            
            
            switch(opcao) 
            {
                    // Opção do menu INSERIR
                    case 1: 
                    {
                        System.out.print("\n Informe o valor -> ");
                        valor = le.nextInt();
                        fila.inserir(valor);
                        break;
                    }
                    // Opção do menu REMOVER
                    case 2:
                    {
                        fila.remover();
                        break;
                    }
                    // Opção do menu CAMINHAR
                    case 3: 
                    {  
                        fila.exibir();
                        break; 
                    }

            } // fim switch
        } 
        while(opcao != 4);


    }

}
