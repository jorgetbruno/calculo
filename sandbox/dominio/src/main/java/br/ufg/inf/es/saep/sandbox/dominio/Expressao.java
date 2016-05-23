package br.ufg.inf.es.saep.sandbox.dominio;

/**
 * Encapsula uma expressão lógica ou numérica.
 */
public class Expressao {
    private String expressao;

    /**
     * Recupera a expressão.
     * @return A sequência de caracteres que define
     * a expressão.
     */
    public String getExpressao() {
        return expressao;
    }

    /**
     * Cria uma expressão para a sequência fornecida.
     * @param expressao A sequência de caracteres que
     *                  define a expressão.
     */
    public Expressao(String expressao) {

        if (expressao == null || expressao.isEmpty()) {
            throw new IllegalArgumentException("expressao");
        }

        this.expressao = expressao;
    }
}