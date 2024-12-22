
package enums;

/**
 *
 * @author Luís Fernando
 */
public enum Titulo {
    
    BACHARELADO("Bacharelado"),
    ESPECIALISTA("Especialista"),
    MESTRE("Mestre"),
    DOUTOR("Doutor"),
    POS_DOUTOR("Pos-Doutor");

    private final String descricao;

    // Construtor para associar a descrição ao enum
    Titulo(String descricao) {
        this.descricao = descricao;
    }

    // Método para retornar a descrição
    public String getDescricao() {
        return descricao;
    }

    // Método para buscar o enum correspondente à string, ignorando "(a)" e diferenças de maiúsculas/minúsculas
    public static Titulo fromString(String tituloStr) {
        // Remove "(a)" e espaços desnecessários, converte para maiúsculas
        String tituloFormatado = tituloStr.toUpperCase().replace("(A)", "").trim();

        // Faz a correspondência com os valores do enum
        for (Titulo titulo : Titulo.values()) {
            if (titulo.descricao.toUpperCase().equals(tituloFormatado)) {
                return titulo;
            }
        }
        throw new IllegalArgumentException("Título inválido: " + tituloStr);
    }
}
