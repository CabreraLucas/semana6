import java.util.Scanner;

public class Exerc5 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        
        int codigo[]= new int[5];
        String nome[]= new String[5];
        double preco[]= new double[5];
        for (int index = 0; index < codigo.length; index++) {
            System.out.println("Digite o código do produto: ");
            codigo[index]=sc.nextInt();
            System.out.println("Digite o nome do produto: ");
            nome[index]=sc.next();
            System.out.println("Digite o preço do produto: ");
            preco[index]=sc.nextDouble();
        }
        for (int i = 0; i < preco.length; i++) {
            System.out.println("Código: "+codigo[i]);
            System.out.println("Nome: "+nome[i]);
            if(preco[i]>120){
            System.out.println("Preço: "+(preco[i]+20));
            }
            else{
                
            System.out.println("Preço: "+(preco[i]));
             }
        }
        
    }
}
