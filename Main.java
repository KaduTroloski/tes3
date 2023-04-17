import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String continuar = "S";
        Integer num = 0;
        Integer continua = 0, contagem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de repetições: ");
        while (!sc.hasNextInt()){
            System.out.println("Não permitido.");
            System.out.println("Digite a quantidade de repetições: ");
            sc.next();
        }
        continua = sc.nextInt();
        while ((continua > contagem)){
            System.out.println("Digite o número: ");
            while (!sc.hasNextInt()){
                System.out.println("Não permitido.");
                System.out.println("Digite o número: ");
                sc.next();
            }
            num = sc.nextInt();
            if (num > 0){
                System.out.println("Este número é positivo");
            } if (num < 0){
                System.out.println("Este número é negativo");
            } if (num == 0) {
                System.out.println("Isto é um zero");
            }
            contagem++;
        }
    }
}
