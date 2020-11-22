package testalivro;

public final class Livro {
    
    private int ano;
    private String titulo;
    private String autor;
    private String editora;
    
    public Livro(String titulo, String autor, String editora, int ano) {
        
        setTitulo(titulo);
        setAutor(autor);
        setEditora(editora);
        setAno(ano);
        
    }

    public int getAno() {
        
        return ano;
        
    }

    public void setAno(int ano) {
        
        this.ano = ano;
        
    }

    public String getAutor() {
        
        return autor;
        
    }

    public void setAutor(String autor) {
        
        this.autor = autor;
        
    }

    public String getTitulo() {
        
        return titulo;
        
    }

    public void setTitulo(String titulo) {
        
        this.titulo = titulo;
        
    }
    
    @Override
    public String toString() {
        
        return getTitulo() + "\n" + getAutor() + "\n" + getEditora() + ", "+ getAno();
        
    }

    public String getEditora() {
        
        return editora;
        
    }

    public void setEditora(String editora) {
        
        this.editora = editora; //Diferencia o parâmetro do método e da classe.
        
    }
    
}
