package com.grupo2.filaed;

public class ControllerFila 
{
    ClasseFila inicio = null;
    ClasseFila ultimo = null;

    // INICIO DA FUNÇÃO PARA INSERIR
   
    public void inserir(int valor)
    {   
        // VERIFICA SE A FILA É VAZIA SE SIM ATRIBUI O INICIO E O ULTIMO
        if (inicio == null) 
        { 
            inicio = new ClasseFila(valor);
            ultimo = inicio;
        }
        // CASO NÃO SEJA VAZIA 
        else
        {
            // VERIFICAMOS SE O INICIO PROXIMO É VAZIO SE SIM APONTAMOS PARA O ULTIMO
            if ( inicio.proximo == null ) 
            {
                ClasseFila aux = new ClasseFila(valor);
                ultimo = aux;
                inicio.proximo = ultimo;
            }
            // ACRESCENTAMOS VALOR SEMPRE AO ULTIMO E ATRIBUIMOS AO ULTIMO.PROXIMO CRIANDO O ENCADEAMENTO
            else
            {
                ClasseFila aux = new ClasseFila(valor);
                ultimo.proximo = aux;
                ultimo = ultimo.proximo;
            }
        }
    }
    
    void exibir(){exibindo(inicio);}
    
    void exibindo(ClasseFila ult)
    {
        // PERCORRRE TODA A LISTA EXIBINDO SEUS VALORES
        if (ult != null)
        {
            System.out.print(ult.valor + " - ");
            exibindo(ult.proximo);
        }
    }

    void remover()
    {   
        // CASO HAJA UM PROXIMO NÓ, O NÓ ATUAL RECEBE SEU VALOR
        if(inicio != null)
        {
            System.out.println("valor: "+inicio.valor+" proximo: "+inicio.proximo);
            inicio = inicio.proximo;
        }
        // CASO NÃO TENHA NENHUM NÓ SEGUINTE SE TORNA NULA
        else 
        {
            inicio = null;
            ultimo = null;
        } 
    }


}
