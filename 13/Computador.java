package First;

public class Computador {
    
    String placaMae, memoria, processador, hardDrive, placaDeRede, fonte, placaDeVideo;
    float preco;
    
    public static void main(String[] args){
        
        Computador computadorDeEscritorio = new Computador();
        
        computadorDeEscritorio.placaMae = "H61MA/BR - Asus";
        computadorDeEscritorio.memoria = "4g DDR3";
        computadorDeEscritorio.fonte = "Fonte Aerocool 350W VX-350 EN57181";
        computadorDeEscritorio.processador = "Intel Core I3 2120";
        computadorDeEscritorio.placaDeVideo = "InBoard";
        computadorDeEscritorio.hardDrive = "HD 500GB 7200 RPM";
        computadorDeEscritorio.placaDeRede = "InBoard";
        computadorDeEscritorio.preco = 1500;
        
        System.out.println("Configurações:\n");
        System.out.println("Placa-mãe: " + computadorDeEscritorio.placaMae);
        System.out.println("Memória: " + computadorDeEscritorio.memoria);
        System.out.println("Fonte: " + computadorDeEscritorio.fonte);
        System.out.println("Processador: " + computadorDeEscritorio.processador);
        System.out.println("Placa de vídeo: " + computadorDeEscritorio.placaDeVideo);
        System.out.println("HD: " + computadorDeEscritorio.hardDrive);
        System.out.println("Placa de rede: " + computadorDeEscritorio.placaDeRede);
        System.out.print("O preço do computador é: R$ " + computadorDeEscritorio.preco);
        
    }
    
}
