package biblioteca;

import java.util.Date;

public class TestaEmprestimo {

    public static void main(String[] args){
        
        Editora editora = new Editora("EdX", "Rua X-54");
        Pessoa autor = new Pessoa("Jose Rei", 1900);
        Livro livro = new Livro("MST", editora, autor, 2004);
        
        Pessoa funcionario = new Pessoa("Joao", 1930);
        Pessoa usuario = new Pessoa("Ze Maria", 1989);
        Emprestimo emprestimo = new Emprestimo(livro, funcionario, usuario, new Date());
        
        System.out.println(emprestimo);
        
    }
    
}
