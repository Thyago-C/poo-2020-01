package testalivro;


public class TestaLivro {


    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Anne I. Pacote de 3 livros: Edição Especial I", "Lucy Maud Montgomery", "Principis", 2020);
        Livro livro2 = new Livro("Guia Prático Me Poupe! - 33 Dias Para Mudar Sua Vida Financeira + 4 Envelopes Para Você Carimbar Seu Dinheiro", "Nathalia Arcuri", "Sextante", 2020);
        Livro livro3 = new Livro("O homem mais rico da Babilônia", "George S Clason", "HarperCollins", 2017);

        System.out.println(livro1 + "\n");
        System.out.println(livro2 + "\n");
        System.out.println(livro3 + "\n");
        
    }
    
}
