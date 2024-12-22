
package estruturaDados;

import modelo.Docente;

/**
 *
 * @author Luís Fernando
 */
public class Lista implements ILista {

    private int tamanho = 0;
    private No inicio = null;
    private No fim = null;

    public Lista() {
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public void incluirInicio(Docente elemento) throws Exception {  // Substituí Piloto por Docente
        No aux = new No(elemento, inicio);
        inicio = aux;
        if (estaVazia()) {
            fim = aux;
        }
        tamanho++;
    }

    @Override
    public void retirarInicio() throws Exception {
        if (estaVazia()) {
            throw new Exception("Não pode retirar, lista está vazia...");
        }
        inicio = inicio.getProximo();
        tamanho--;
        if (estaVazia()) {
            fim = null;
        }
    }

    @Override
    public Docente acessarInicio() throws Exception {  // Substituí Piloto por Docente
        if (estaVazia()) {
            throw new Exception("Não pode acessar, lista está vazia...");
        }
        return inicio.getDado();
    }

    @Override
    public boolean estaVazia() {
        return (tamanho == 0);
    }

    @Override
    public String obterLista() throws Exception {
        if (estaVazia()) {
            return "Lista = { }";
        }
        String saida = "Lista = { ";
        No aux = inicio;
        do {
            saida += aux.getDado() + " ";
            aux = aux.getProximo();
        } while (aux != null);
        return saida += "}";
    }

    @Override
    public void incluirFim(Docente elemento) throws Exception {  // Substituí Piloto por Docente

        No aux = new No(elemento);

        if (estaVazia()) {
            inicio = fim = aux;
            tamanho++;
            return;
        }

        fim.setProximo(aux);
        fim = aux;
        tamanho++;
    }

    @Override
    public void retirarNoFim() throws Exception {

        if (estaVazia()) {
            throw new Exception("Não pode retirar, lista está vazia...");
        }

        if (tamanho == 1) {
            inicio = fim = null;
            tamanho = 0;
            return;
        }

        No ref = inicio;

        for (int contador = 1; contador < tamanho - 1; contador++) {
            ref = ref.getProximo();
        }

        ref.setProximo(null);
        fim = ref;
        tamanho--;
    }

    @Override
    public Docente acessarNoFim() throws Exception {  // Substituí Piloto por Docente

        if (estaVazia()) {
            throw new Exception("Não pode acessar, lista está vazia...");
        }
        return fim.getDado();
    }

    @Override
    public No acessarPrimeiroNo() throws Exception {
                if (estaVazia()) {
            throw new Exception("Não pode acessar, lista está vazia...");
        }
        return inicio;
    }

}
