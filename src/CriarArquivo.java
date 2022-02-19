//Henrique Andrew da Silva

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CriarArquivo {
    
    public static void main(String[]args) throws FileNotFoundException, IOException{
        Scanner leitura = new Scanner(System.in);
        String nome, fone;
        int idade;
        long n;
        
        RandomAccessFile contato = new RandomAccessFile("C:\\TESTE\\contatos.dat", "rw");
        
        contato.seek(contato.length()); //posicionar o ponteiro para o final do arquivo para inserir o registro
        n = (contato.length()) +1 ;
        while (true){
            System.out.printf("\n======Novo Registro ======\n", n);
            System.out.printf("Informe o nome do Contato. Ou digite 'FIM' para encerrar o sistema: \n");
            nome = leitura.nextLine();
            if(nome.equalsIgnoreCase("FIM"))
                break;
            
            System.out.printf("\nInforme a idade do Contato: ");
            idade = leitura.nextInt();
            
            System.out.printf("\nInforme o telefone do Contato: ");
            fone = leitura.nextLine();
            
            leitura.nextLine(); 
            
            gravarContato(contato, nome);
            contato.writeUTF(fone);
            contato.writeInt(idade);
            
            n = n + 1;
                        
        }
        contato.close();
    }
    
    private static void gravarContato(RandomAccessFile arquivo, String nome) throws IOException{
        StringBuilder resultado = new StringBuilder(nome);
        arquivo.writeChars(resultado.toString());
    }
}
