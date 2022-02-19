//Henrique Andrew da Silva

import java.util.Scanner;

public class ConteudoDiretorioTest {
    
    public static void main( String args[] )
   {
       Scanner leitura = new Scanner(System.in);
       ConteudoDiretorio aplicacao = new ConteudoDiretorio();
       
       System.out.println("Informe o nome do diretório raiz do Disco Rígido.\nExemplo >>> 'C:/'   \n");
       aplicacao.analisaCaminhoDiretorio(leitura.nextLine());
    
   }
    
}
