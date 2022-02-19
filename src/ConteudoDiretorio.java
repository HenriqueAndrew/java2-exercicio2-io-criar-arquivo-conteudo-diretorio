//Henrique Andrew da Silva

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConteudoDiretorio {
    
   public void analisaCaminhoDiretorio(String nome){ 
    
    //cria Objeto da Classe File atraves da entrada(teclado) do usuario   
    File arquivo = new File(nome);
    
       if(arquivo.exists()){ //se nome do arquivo digitado existir...
           if(arquivo.isDirectory()){//Se nome do arquivo digitado for diretorio exibe arquivos do diretório
               String diretorio[] = arquivo.list();
               System.out.println("\n=====CONTEUDO DO DIRETORIO=====\n");
                                         
               for (String item : diretorio){
                                                        
                   //Solucao 1 >>>
                   File x = new File(nome + item);
                   boolean isDirectory = x.isDirectory();
                   boolean isFile = x.isFile();
                   
                   if(isDirectory){
                       System.out.printf("%s\n", x + ">>> Diretorio");
                   }
                   else if(isFile){
                       System.out.printf("%s\n", x + ">>> Arquivo");    
                   }
                   else{
                       System.out.printf("%s\n", x + ">>> nao identificou");
                   }
               }                       
           }
           else{//Nome do arquivo nao eh de diretorio, apresentar mensagem de erro e finaliza programa
               System.out.printf( "%s %s", nome, ">>> O caminho indicado não é diretório!" );
            
           }
        }    
        else{//se nome do arquivo digitado nao existir, apresentar mensgaem de erro e finaliza programa
           System.out.printf( "%s %s", nome, " >>> Este arquivo não existe!" );
        
        }    
    }    
}
