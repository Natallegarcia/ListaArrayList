package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import modelo.Docente;
import enums.Titulo;
import enums.Contrato;
import estruturaDados.ILista;
import estruturaDados.Lista;

/**
 *
 * @author ejmcc
 */
public class PersistenciaDeDados {
    // Atributos
    private String nomeArquivoNoDisco;

    public PersistenciaDeDados(String nomeArquivoNoDisco) {
        this.nomeArquivoNoDisco = nomeArquivoNoDisco;
    }

    public ILista listaDeDocentes() throws Exception {
        
        try {
            
            ILista lista = new Lista();  // Criando um objeto da classe Lista que implementa ILista
            FileReader fr = new FileReader(nomeArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                
                String[] vetor = linha.split(";");

                // Converte os valores lidos 
                int matricula = Integer.parseInt(vetor[0]);  
                String nome = vetor[1];  
                String escola = vetor[2];  

                // Converte o texto do arquivo para o enum Titulo usando o método fromString
                Titulo titulo = Titulo.fromString(vetor[3]);

                // Converte o texto do arquivo para o enum Contrato
                Contrato contrato = Contrato.valueOf(vetor[4].toUpperCase());

                // Cria o objeto Docente
                Docente docente = new Docente(matricula, nome, escola, titulo, contrato);

                // Usando o método incluir da Lista para adicionar o docente na lista encadeada
                lista.incluirFim(docente);
            }

            br.close();
            return lista;  // Retorna a lista encadeada com os docentes
        } catch (Exception erro) {
            throw erro;
        }
    }
}
