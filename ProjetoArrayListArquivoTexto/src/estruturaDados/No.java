
package estruturaDados;

import modelo.Docente;

/**
 *
 * @author Luís Fernando
 */
public class No {

    private Docente dado = null;  // Substituí Piloto por Docente
    private No proximo = null;

    public No() {
    }

    public No(Docente dado, No proximo) {  // Substituí Piloto por Docente
        this.dado = dado;
        this.proximo = proximo;
    }

    public No(Docente dado) {  // Substituí Piloto por Docente
        this.dado = dado;
    }

    public Docente getDado() {  // Substituí Piloto por Docente
        return dado;
    }

    public void setDado(Docente dado) {  // Substituí Piloto por Docente
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
