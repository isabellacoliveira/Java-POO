package br.com.dio.desafio;

public abstract class Conteudo {
    // todo bootcamp tem conteudos 
    // todo conteudo será instanciado com o XP_PADRAO 
    // final representa uma constante, nesse caso do tipo double 
    // modificador protected, somente os filhos terão acesso 
    // e é estatico pois podemos acessar o xp_padrao fora da classe conteudo
    protected static final double XP_PADRAO = 10d;

    private String titulo; 
    private String descricao; 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // as classes filhas serão obrigadas a implementar uma lógica desse método
    // sendo abstract, a calsse não pode ser instanciada
    public abstract double calcularXp();

    
}
