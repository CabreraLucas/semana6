//importante classe Scanner
import java.util.Scanner;
// declara uma classe publica chamada Exer2 e inicia o corpo da classe por meio do sinal {}
public class Exerc2 {
    //Classe main onde começa toda a estrutura
    public static void main(String[] args) {
        //Scanner = Separar a entrada de texto digitadas pelo usuario
        Scanner sc=new Scanner(System.in);
        // uma váriavel inteira
        int n=5;
        //vetor funcionario do tipo string
        String funcionario[] = new String[n];
        //estrutura de repetição com condição de inserir nomes para cada espaço no vetor
        for (int i = 0; i < funcionario.length; i++) {
            //Exibir a frase na tela do usuario
            System.out.println("Nome do Funcionário: ");
            //Adicionar os nomes que foram digitados pelo usuario no vetor
            funcionario[i]=sc.next();
            }

    for (int index = 0; index < funcionario.length; index++) {
        System.out.println("Os nomes foram: " +funcionario[index]);
        
    }

    }
}
